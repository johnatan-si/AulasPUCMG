
# Exercícios SOLID

## Questões Teóricas

### 1. Qual dos seguintes princípios SOLID afirma que uma classe deve ter apenas uma razão para mudar?

a) Interface Segregation Principle  
b) Open/Closed Principle  
c) Liskov Substitution Principle  
d) Single Responsibility Principle  
e) Dependency Inversion Principle


### 2. Qual princípio SOLID sugere que módulos de alto nível não devem depender de módulos de baixo nível, mas ambos devem depender de abstrações?

a) Dependency Inversion Principle  
b) Liskov Substitution Principle  
c) Open/Closed Principle  
d) Single Responsibility Principle  
e) Interface Segregation Principle


## Questões Práticas

### 3. Considere o seguinte código:

```java
public class Conta {
    public void depositar(double valor) {
        // aqui vai o código da lógica para depositar
    }

    public void sacar(double valor) {
        // aqui vai o código da  lógica para sacar
    }

    public void imprimirRelatorio() {
        // aqui vai o código da lógica para imprimir relatório
    }
}
```
**Identifique o princípio SOLID que está sendo violado.**

### 4. Analise o código:
```java
public interface OperacoesBancarias {
    void depositar(double valor);
    void sacar(double valor);
    void gerarRelatorio();
}

public class ContaPoupanca implements OperacoesBancarias {
    // codigo  dos métodos
}
```
Qual princípio SOLID está sendo comprometido e por quê?

### 5. Dado o código:
```java
public class Banco {
    private NotificacaoEmail notificacao;

    public Banco() {
        this.notificacao = new NotificacaoEmail();
    }
}
```
Indique o princípio SOLID que está sendo desrespeitado e sugira uma solução.

### 6. Qual princípio SOLID afirma que as classes, módulos e funções devem estar abertos para extensões, mas fechados para modificações?

a) Open/Closed Principle  
b) Dependency Inversion Principle  
c) Interface Segregation Principle  
d) Liskov Substitution Principle  
e) Single Responsibility Principle


### 7. Segundo qual princípio SOLID subtipos devem ser substituíveis por seus tipos de base sem afetar a corretude do programa?

a) Dependency Inversion Principle  
b) Interface Segregation Principle  
c) Single Responsibility Principle  
d) Open/Closed Principle  
e) Liskov Substitution Principle


## Questões Práticas

### 8. Analise o seguinte código:

```java
public class ContaCorrente {
    public void realizarOperacao(String operacao) {
        if (operacao.equals("depositar")) {
            // Executa depósito
        } else if (operacao.equals("sacar")) {
            // Executa saque
        }
    }
}
```
Indique o princípio SOLID que está sendo violado e por quê.

### 9. Considere o código:

````java 
public class ContaPoupanca extends ContaBancaria {
    @Override
    public void movimentar(double valor) {
        // Lógica que altera o comportamento básico
    }
}
````
Qual problema você vê em relação aos princípios SOLID?

### 10. Dado o trecho:

````java
public interface Notificacao {
    void enviarSMS(String mensagem);
    void enviarEmail(String mensagem);
}

public class Alerta implements Notificacao {
    @Override
    public void enviarSMS(String mensagem) {
        // Envia SMS
    }

    @Override
    public void enviarEmail(String mensagem) {
        // Não faz nada, pois Alerta não deveria enviar emails
    }
}
````

Qual princípio SOLID está sendo comprometido e por quê?

### 11 -   O que diferencia uma classe abstrata de uma interface em Java?

### 12 Crie uma interface "Voador" que tenha um método "voar".

### 13 Por que não podemos instanciar uma classe abstrata diretamente?

### 14 Dado o código a seguir, torne a classe "Animal" abstrata e adicione um método abstrato "emitirSom".

### 15  Por que Java não suporta herança múltipla e como ela contorna essa limitação?

### 16  Usando interfaces, crie uma estrutura que simula herança múltipla com as classes "Mamífero" e "Voador".

### 17 -    O que é overloading de métodos e como ele é diferente de overriding?

### 18 Crie um método "imprimir" que pode aceitar tanto uma string quanto um número inteiro.

### 19  Explique o conceito de type casting em Java e sua relação com polimorfismo.

### 20 Considere as classes a seguir:

```java
class Animal { 
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```
Dada a instância `Animal myDog = new Dog();`, demonstre como realizar um type casting para chamar o método `sound()` de `Dog`.

### 21 -   O que é coerção explícita e como ela difere da coerção implícita em Java?
## 22 Dado os seguintes fragmentos de código: double myDouble = 9.78;
Converta `myDouble` em um `int` usando coerção explícita.
