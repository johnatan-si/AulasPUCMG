public class Robo implements Carregavel, Movel, Camera, ComunicacaoVoz {
    
    private int nivelBateria;
    private boolean microfoneAtivado;
    private int posicao;
    private String ultimaImagemCapturada;
    
    public Robo() {
        this.nivelBateria = 100; // Inicialmente, a bateria está totalmente carregada.
        this.microfoneAtivado = false;
        this.posicao = 0;  // posição inicial
        this.ultimaImagemCapturada = "Nenhuma imagem capturada ainda.";
    }

    @Override
    public void carregarBateria() {
        this.nivelBateria = 100; // Carrega a bateria totalmente.
        System.out.println("Robô carregado. Nível da bateria: " + nivelBateria + "%");
    }

    @Override
    public void moverParaFrente() {
        if (nivelBateria > 0) {
            posicao++;
            nivelBateria -= 10;  // Consome 10% da bateria para se mover.
            System.out.println("Robô moveu para frente. Posição atual: " + posicao);
        } else {
            System.out.println("Bateria fraca. Não é possível mover.");
        }
    }

    @Override
    public void moverParaTras() {
        if (nivelBateria > 0) {
            posicao--;
            nivelBateria -= 10;
            System.out.println("Robô moveu para trás. Posição atual: " + posicao);
        } else {
            System.out.println("Bateria fraca. Não é possível mover.");
        }
    }

    @Override
    public void parar() {
        System.out.println("Robô parou na posição: " + posicao);
    }

    @Override
    public void capturarImagem() {
        if (nivelBateria > 5) {
            ultimaImagemCapturada = "Imagem capturada na posição: " + posicao;
            nivelBateria -= 5;  // Consome 5% da bateria para capturar imagem.
            System.out.println(ultimaImagemCapturada);
        } else {
            System.out.println("Bateria fraca. Não é possível capturar imagem.");
        }
    }

    public String verUltimaImagem() {
        return ultimaImagemCapturada;
    }

    @Override
    public void ativarMicrofone() {
        if (nivelBateria > 2) {
            microfoneAtivado = true;
            nivelBateria -= 2;  // Consome 2% da bateria para ativar o microfone.
            System.out.println("Microfone ativado.");
        } else {
            System.out.println("Bateria fraca. Não é possível ativar microfone.");
        }
    }

    @Override
    public void desativarMicrofone() {
        microfoneAtivado = false;
        System.out.println("Microfone desativado.");
    }

    @Override
    public void reproduzirSom(String som) {
        if (microfoneAtivado && nivelBateria > 2) {
            System.out.println("Robô reproduzindo: " + som);
            nivelBateria -= 2;  // Consome 2% da bateria para reproduzir som.
        } else {
            System.out.println("Não é possível reproduzir som. Verifique o microfone e a bateria.");
        }
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean isMicrofoneAtivado() {
        return microfoneAtivado;
    }
}
