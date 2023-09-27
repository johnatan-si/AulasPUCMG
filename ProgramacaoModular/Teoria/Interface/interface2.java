public class Peixe implements Animal {

    @Override
    public void comer() {
        System.out.println("O peixe come alimentos marinhos.");
    }

    @Override
    public void mover() {
        System.out.println("O peixe nada.");
    }
}
