package ProgramacaoModular.Laboratorio.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static int contadorId = 0;
    private int id;
    private String nome;
    private Endereco endereco;
    private List<Livro> livrosEmprestados;
    private List<HistoricoEmprestimo> historicoEmprestimos;
    private List<Livro> reservas;
    private boolean penalizado;


    public Usuario(String nome, Endereco endereco) {
        this.id = ++contadorId;
        this.nome = nome;
        this.endereco = endereco;
        this.livrosEmprestados = new ArrayList<>();
        this.historicoEmprestimos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public List<HistoricoEmprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public List<Livro> getReservas() {
        return reservas;
    }

    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }
    
    public boolean isPenalizado() {
        return penalizado;
    }
    

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Endereço: " + endereco;
    }
}
