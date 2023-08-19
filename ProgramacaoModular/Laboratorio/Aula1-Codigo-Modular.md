
## Aula 0-Programação Modular em Java

Iremos aprender os conceitos preliminares de programação modular usando a linguagem Java. A programação modular é uma técnica que permite dividir um programa em partes menores e independentes, chamadas de módulos, para facilitar a manutenção, reutilização e organização do código.

### O que é Programação Modular?

A programação modular é uma abordagem para desenvolver programas dividindo-os em partes menores e independentes, chamadas de módulos. Cada módulo contém um conjunto de funcionalidades relacionadas e pode ser desenvolvido, testado e mantido separadamente. Dessa forma, torna-se mais fácil entender e gerenciar o código, além de promover a reutilização de trechos de código em diferentes partes do programa.

### Vantagens da Programação Modular

-   **Facilita a manutenção:** Como o código é dividido em módulos, as mudanças e correções podem ser feitas em partes específicas do programa sem afetar o resto.
-   **Promove a reutilização:** Os módulos podem ser utilizados em diferentes partes do programa, economizando tempo e esforço.
-   **Melhora a organização:** O código é dividido em partes lógicas, tornando-o mais fácil de entender e navegar.
-   **Aumenta a produtividade:** Ao trabalhar em equipe, cada membro pode focar em módulos específicos, permitindo o desenvolvimento paralelo.


### Criando Módulos em Java

Em Java, os módulos podem ser criados usando classes e métodos. Vamos criar um exemplo básico de programa modular que calcula a soma e a média de um conjunto de números.

1.  Crie um novo projeto Java em sua IDE preferida.
2.  Crie duas classes chamadas `Calculadora` e `Main`.

> public class Calculadora {
>     public static int somar(int a, int b) {
>         return a + b;
>     }
> 
>     public static double calcularMedia(int[] numeros) {
>         int soma = 0;
>         for (int num : numeros) {
>             soma += num;
>         }
>         return (double) soma / numeros.length;
>     } }

A seguir é criado a classe principal: 

    import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite dois números para somar:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
    
            int resultadoSoma = Calculadora.somar(num1, num2);
            System.out.println("A soma é: " + resultadoSoma);
    
            System.out.println("Digite a quantidade de números para calcular a média:");
            int quantidadeNumeros = scanner.nextInt();
    
            int[] numeros = new int[quantidadeNumeros];
            for (int i = 0; i < quantidadeNumeros; i++) {
                System.out.println("Digite o número " + (i + 1) + ":");
                numeros[i] = scanner.nextInt();
            }
    
            double resultadoMedia = Calculadora.calcularMedia(numeros);
            System.out.println("A média é: " + resultadoMedia);
    
            scanner.close();
        }
    }


### Como o Programa Funciona

-   A classe `Calculadora` contém dois métodos, `somar` e `calcularMedia`, que são as funcionalidades dos nossos módulos.
-   A classe `Main` é a classe principal que interage com o usuário e usa os métodos da `Calculadora`.
-   O método `somar` recebe dois inteiros e retorna a soma deles.
-   O método `calcularMedia` recebe um array de inteiros e retorna a média dos números.
-   No método `main`, os números são lidos do usuário e os módulos são utilizados para fazer os cálculos.
