public class Candidato {
    private String nome;
    private int[] pontuacoesHabilidades;

    public Candidato(String nome, int[] pontuacoesHabilidades) {
        this.nome = nome;
        this.pontuacoesHabilidades = pontuacoesHabilidades;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacaoHabilidade(int indice) {
        if (indice >= 0 && indice < pontuacoesHabilidades.length) {
            return pontuacoesHabilidades[indice];
        } else {
            return -1; // Valor inválido
        }
    }

    public int getPontuacaoTotal() {
        int total = 0;
        for (int pontuacao : pontuacoesHabilidades) {
            total += pontuacao;
        }
        return total;
    }
}
