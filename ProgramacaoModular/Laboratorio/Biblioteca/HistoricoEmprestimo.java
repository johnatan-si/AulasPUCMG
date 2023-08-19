package ProgramacaoModular.Laboratorio.Biblioteca;


import java.util.Date;

public class HistoricoEmprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public HistoricoEmprestimo(Livro livro, Usuario usuario, Date dataEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null; // A data de devolução é definida posteriormente quando o livro é devolvido
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void registrarDevolucao() {
        this.dataDevolucao = new Date(); // Definir a data de devolução como a data atual
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + usuario.getNome() + ", Data de Empréstimo: " + dataEmprestimo + ", Data de Devolução: " + (dataDevolucao != null ? dataDevolucao : "Não devolvido ainda");
    }
}
