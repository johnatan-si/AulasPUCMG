import java.util.List;

public class Candidato {
    private String nome;
    private List<Integer> habilidades;

    public Candidato(String nome, List<Integer> habilidades) {
        this.nome = nome;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getHabilidades() {
        return habilidades;
    }
}
