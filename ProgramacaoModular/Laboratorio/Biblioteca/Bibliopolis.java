package ProgramacaoModular.Laboratorio.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Bibliopolis {

    private Endereco endereco;
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Funcionario> funcionarios;

    public Bibliopolis(Endereco endereco) {
        this.endereco = endereco;
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

}
