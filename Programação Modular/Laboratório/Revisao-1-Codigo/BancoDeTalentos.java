import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BancoDeTalentos {
    private List<Tecnologia> tecnologias;
    private List<Candidato> candidatos;

    public BancoDeTalentos() {
        tecnologias = new ArrayList<>();
        candidatos = new ArrayList<>();
    }

    public void lerArquivoTecnologias(String nomeArquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                tecnologias.add(new Tecnologia(linha));
            }
        }
    }

    public void lerArquivoCandidatos(String nomeArquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0];
                List<Integer> habilidades = new ArrayList<>();
                for (int i = 1; i < dados.length; i++) {
                    habilidades.add(Integer.parseInt(dados[i]));
                }
                candidatos.add(new Candidato(nome, habilidades));
            }
        }
    }

    public String melhorCandidatoPorHabilidade(String habilidade) {
        int indiceHabilidade = tecnologias.indexOf(new Tecnologia(habilidade));
        if (indiceHabilidade == -1) {
            return "Habilidade nao encontrada.";
        }

        Candidato melhorCandidato = null;
        int maiorHabilidade = -1;

        for (Candidato candidato : candidatos) {
            int habilidadeCandidato = candidato.getHabilidades().get(indiceHabilidade);
            if (habilidadeCandidato > maiorHabilidade) {
                melhorCandidato = candidato;
                maiorHabilidade = habilidadeCandidato;
            }
        }

        return melhorCandidato.getNome();
    }

    public String melhorCandidatoPorDuasHabilidades(String habilidade1, String habilidade2) {
        int indiceHabilidade1 = tecnologias.indexOf(new Tecnologia(habilidade1));
        int indiceHabilidade2 = tecnologias.indexOf(new Tecnologia(habilidade2));
        if (indiceHabilidade1 == -1 || indiceHabilidade2 == -1) {
            return "Pelo menos uma das habilidades nao foi encontrada.";
        }

        Candidato melhorCandidato = null;
        int maiorSomaHabilidades = -1;

        for (Candidato candidato : candidatos) {
            int habilidadeCandidato1 = candidato.getHabilidades().get(indiceHabilidade1);
            int habilidadeCandidato2 = candidato.getHabilidades().get(indiceHabilidade2);
            int somaHabilidades = habilidadeCandidato1 + habilidadeCandidato2;
            if (somaHabilidades > maiorSomaHabilidades) {
                melhorCandidato = candidato;
                maiorSomaHabilidades = somaHabilidades;
            }
        }

        return melhorCandidato.getNome();
    }

    public String candidatoMaisInteressante() {
        Candidato candidatoMaisInteressante = null;
        int maiorSomaHabilidades = -1;

        for (Candidato candidato : candidatos) {
            int somaHabilidades = candidato.getHabilidades().stream().mapToInt(Integer::intValue).sum();
            if (somaHabilidades > maiorSomaHabilidades) {
                candidatoMaisInteressante = candidato;
                maiorSomaHabilidades = somaHabilidades;
            }
        }

        return candidatoMaisInteressante.getNome();
    }

    public static void main(String[] args) throws IOException {
        BancoDeTalentos bancoDeTalentos = new BancoDeTalentos();
        bancoDeTalentos.lerArquivoTecnologias("arquivo1.txt");
        bancoDeTalentos.lerArquivoCandidatos("arquivo2.txt");

        String habilidade1 = "Java";
        String habilidade2 = "Front-end";
        String habilidadeObrigatoria = "Back-end";
        String habilidadeImportante = "Python";

        String melhorCandidatoHabilidade1 = bancoDeTalentos.melhorCandidatoPorHabilidade(habilidade1);
        String melhorCandidatoHabilidade2 = bancoDeTalentos.melhorCandidatoPorHabilidade(habilidade2);
        String melhorCandidatoDuasHabilidades = bancoDeTalentos.melhorCandidatoPorDuasHabilidades(habilidadeObrigatoria, habilidadeImportante);
        String candidatoMaisInteressante = bancoDeTalentos.candidatoMaisInteressante();

        System.out.println("Melhor candidato em " + habilidade1 + ": " + melhorCandidatoHabilidade1);
        System.out.println("Melhor candidato em " + habilidade2 + ": " + melhorCandidatoHabilidade2);
        System.out.println("Melhor candidato com habilidade obrigatoria em " + habilidadeObrigatoria + " e importante em " + habilidadeImportante + ": " + melhorCandidatoDuasHabilidades);
        System.out.println("Candidato mais interessante: " + candidatoMaisInteressante);
    }
}
