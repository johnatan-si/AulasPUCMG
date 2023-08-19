package ProgramacaoModular.Laboratorio.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private Categoria categoria;
    private StatusLivro status;
    private List<Usuario> filaReserva = new ArrayList<>();

    public enum StatusLivro {
        DISPONIVEL,
        EMPRESTADO,
        EM_MANUTENCAO
    }

    public Livro(String titulo, String autor, String ISBN, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.categoria = categoria;
        this.status = StatusLivro.DISPONIVEL; // Assumindo que cada novo livro adicionado estará disponível inicialmente.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    public List<Usuario> getFilaReserva() {
        return filaReserva;
    }

    public void adicionarReserva(Usuario usuario) {
        if (status == StatusLivro.EMPRESTADO && !filaReserva.contains(usuario)) {
            filaReserva.add(usuario);
        }
    }

    public void removerReserva(Usuario usuario) {
        filaReserva.remove(usuario);
    }

    public Usuario proximaReserva() {
        if (!filaReserva.isEmpty()) {
            return filaReserva.get(0); // Retorna o primeiro da fila de reserva.
        }
        return null;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN + ", Categoria: " + categoria.getNome() + ", Status: " + status;
    }
}
