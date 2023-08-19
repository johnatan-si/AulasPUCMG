package ProgramacaoModular.Laboratorio.Biblioteca;


public class Funcionario {
    private int id;
    private String nome;
    private Cargo cargo;
    private Endereco endereco;

    public enum Cargo {
        BIBLIOTECARIO,
        ADMINISTRADOR
    }

    public Funcionario(int id, String nome, Cargo cargo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Cargo: " + cargo + ", Endereço: " + endereco.toString();
    }
}
