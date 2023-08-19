import java.io.*;
import java.util.*;

public class BancoDeHabilidades {
    private List<String> tecnologias;
    private List<Candidato> candidatos;

    public BancoDeHabilidades(String arquivoTecnologias, String arquivoCandidatos) throws IOException {
        this.tecnologias = new ArrayList<>();
        this.candidatos = new ArrayList<>();

        carregarTecnologias(arquivoTecnologias);
        carregarCandidatos(arquivoCandidatos);
    }

    private void carregarTecnologias(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            tecnologias.add(linha.trim());
        }
        br.close();
    }

    private void carregarCandidatos(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(";");
            String nome = partes[0];
            int[] pontuacoes = new int[partes.length - 1];
            for (int i = 1; i < partes.length; i++) {
                pontuacoes[i - 1] = Integer.parseInt(partes[i]);
            }
            candidatos.add(new Candidato(nome, pontuacoes));
        }
        br.close();
    }

    public Candidato melhorCandidatoParaHabilidade(int indiceHabilidade) {
        Candidato melhor = null;
        int maxPontuacao = -1;
        for (Candidato c : candidatos) {
            if (c.getPontuacaoHabilidade(indiceHabilidade) > maxPontuacao) {
                melhor = c;
                maxPontuacao = c.getPontuacaoHabilidade(indiceHabilidade);
            }
        }
        return melhor;
    }

    public Candidato melhorCandidatoParaDuasHabilidades(int habilidadeObrigatoria, int habilidadeImportante) {
        Candidato melhor = null;
        int maxPontuacao = -1;
        for (Candidato c : candidatos) {
            int pontuacao = c.getPontuacaoHabilidade(habilidadeObrigatoria) * 2 + c.getPontuacaoHabilidade(habilidadeImportante);
            if (pontuacao > maxPontuacao) {
                melhor = c;
                maxPontuacao = pontuacao;
            }
        }
        return melhor;
    }

    public Candidato melhorCandidatoGeral() {
        Candidato melhor = null;
        int maxPontuacao = -1;
        for (Candidato c : candidatos) {
            if (c.getPontuacaoTotal() > maxPontuacao) {
                melhor = c;
                maxPontuacao = c.getPontuacaoTotal();
            }
        }
        return melhor;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }
}