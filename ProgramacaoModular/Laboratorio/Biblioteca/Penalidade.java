package ProgramacaoModular.Laboratorio.Biblioteca;


import java.util.Date;

public class Penalidade {
    private Usuario usuario;
    private Date dataInicio;
    private int duracaoDias;
    private String razao;
        

    public Penalidade(Usuario usuario, Date dataInicio, int duracaoDias, String razao) {
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.duracaoDias = duracaoDias;
        this.razao = razao;

        // Quando uma penalidade é criada, o usuário é marcado como penalizado
        this.usuario.setPenalizado(true);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.duracaoDias = duracaoDias;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public void finalizarPenalidade() {
        this.usuario.setPenalizado(false);
    }

    @Override
    public String toString() {
        return "Usuário: " + usuario.getNome() + ", Data de Início: " + dataInicio + ", Duração: " + duracaoDias + " dias, Razão: " + razao;
    }
}
