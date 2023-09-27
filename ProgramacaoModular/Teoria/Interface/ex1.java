class Animal {
    void fazerBarulho() {
        System.out.println("Animal fazendo barulho");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Cachorro latindo");
    }
}

public class Exemplo {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        ((Cachorro) animal).latir(); // Cast de Animal para Cachorro
    }
}
Neste exemplo, um objeto da classe Animal é 
convertido em um objeto da classe Cachorro usando um cast. 
Isso permite que você acesse
 os métodos específicos da classe Cachorro.
