
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
