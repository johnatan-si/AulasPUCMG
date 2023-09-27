public class ExemploSobrecarga {

    // Método sobrecarregado com dois parâmetros int
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado com três parâmetros int
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecarregado com dois parâmetros double
    public double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        ExemploSobrecarga exemplo = new ExemploSobrecarga();
        
        System.out.println(exemplo.somar(2, 3));            // Chama o primeiro método
        System.out.println(exemplo.somar(2, 3, 4));         // Chama o segundo método
        System.out.println(exemplo.somar(2.5, 3.7));       // Chama o terceiro método
    }
}
