
# Java: Conceitos Básicos e Exemplos Práticos

Esse material tem como objetivo ensinar os conceitos básicos de programação em Java, incluindo atributos, métodos e tipos de relacionamentos entre classes. Vamos utilizar trechos de código de exemplo para facilitar o entendimento.

## Índice

* Introdução
* Variáveis e Tipos de Dados
* Métodos
* Classes e Objetos
* Relacionamentos entre Classes 
  * Associação 
	* Agregação 
	* Composição
* Conclusão

## 1. Introdução

Java é uma linguagem de programação orientada a objetos amplamente utilizada no desenvolvimento de aplicações de todos os tipos, desde aplicações desktop até aplicações web e móveis.

Orientação a objetos é um paradigma de programação que organiza o código em classes e objetos, facilitando a reutilização de código e tornando-o mais fácil de manter e estender.

## 2. Variáveis e Tipos de Dados

Em Java, as variáveis são usadas para armazenar valores em memória. Existem diferentes tipos de dados que podem ser utilizados em variáveis. Alguns dos tipos de dados primitivos em Java são:

    // Exemplo de variáveis e tipos de dados
    int idade = 30;
    double altura = 1.75;
    char genero = 'M';
    boolean ehProgramador = true;
    String nome = "João";
## 3. Métodos

Métodos são blocos de código que executam uma determinada tarefa e podem retornar valores. Em Java, os métodos são definidos dentro de classes. Aqui está um exemplo de um método simples que soma dois números:

    // Exemplo de método em Java
    public int somar(int a, int b) {
        return a + b;
    }

## 4. Classes e Objetos

Classes são a estrutura básica da orientação a objetos em Java. Uma classe é um modelo para criar objetos. Os objetos são instâncias das classes, e cada objeto possui seus próprios atributos e métodos. Aqui está um exemplo de uma classe simples:

    // Exemplo de classe em Java
    public class Pessoa {
        String nome;
        int idade;
    
        public void dizerOla() {
            System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
        }
    }


## 5. Relacionamentos entre Classes

Em Java, podemos estabelecer diferentes tipos de relacionamentos entre classes: associação, agregação e composição.

### 5.1. Associação

A associação representa uma relação entre duas classes de forma que uma classe esteja relacionada à outra, mas não dependa diretamente dela. Um exemplo de associação seria uma classe "Carro" que possui uma referência para uma classe "Motor".

    public class Carro {
        String modelo;
        Motor motor;
    
        public Carro(String modelo, Motor motor) {
            this.modelo = modelo;
            this.motor = motor;
        }
    }


### 5.2. Agregação

A agregação é uma forma de relacionamento mais forte que a associação. Nesse caso, uma classe pode conter objetos de outra classe, mas esses objetos podem existir independentemente da classe que os contém. Um exemplo seria uma classe "Time" que possui uma lista de jogadores.

    public class Time {
        String nome;
        List<Jogador> jogadores;
    
        public Time(String nome, List<Jogador> jogadores) {
            this.nome = nome;
            this.jogadores = jogadores;
        }
    }

### 5.3. Composição

A composição é o tipo de relacionamento mais forte, onde uma classe é composta por outras classes e, nesse caso, a classe interna não pode existir independentemente da classe que a contém. Um exemplo de composição seria uma classe "Casa" que contém objetos da classe "Porta".

    public class Casa {
        Porta portaPrincipal;
        Porta portaCozinha;
    
        public Casa() {
            this.portaPrincipal = new Porta();
            this.portaCozinha = new Porta();
        }
    }

## 6. Conclusão

Você agora possui uma visão geral dos conceitos básicos de programação em Java, incluindo atributos, métodos e tipos de relacionamentos entre classes. Com esse conhecimento, você pode começar a criar aplicações mais complexas e explorar as vastas possibilidades da linguagem Java.

Lembre-se de que a prática é essencial para aprofundar seus conhecimentos, então continue programando e aprimorando suas habilidades em Java.

Esse tutorial é apenas um ponto de partida, e há muito mais para aprender em Java. Sinta-se à vontade para explorar a documentação oficial da linguagem Java e outros recursos disponíveis online para se tornar um desenvolvedor Java mais competente.

**Bom aprendizado!**

