public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        System.out.println(resultado); // Saída: 5
    }
}
