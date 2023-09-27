## Atividade - Sistema Bancário XuBank

O XuBank é uma fintech emergente que precisa de um sistema modular e confiável para administrar as contas de seus clientes. Sua missão é desenvolver um sistema de informação que atenda aos requisitos do produto, fazendo uso de conceitos avançados de programação orientada a objetos, como herança, polimorfismo, interfaces e diagrama de classes.

### Requisitos:

1. **Clientes:**
   - Atributos: nome, CPF e senha.
   - Tipos de cliente: regular, gold e vip.
   - Todos os clientes podem possuir múltiplos tipos de contas.
   - Clientes devem ser capazes de acessar extratos, saldos e realizar operações em suas contas.

2. **Tipos de Conta:**
   - *Conta Corrente:* Taxa mensal de R$20. Saque especial até R$200 além do saldo.
   - *Poupança:* Sem taxa mensal. Rendimento fixo de 0,5% no dia 5 de cada mês.
   - *Renda Fixa:* Sem taxa mensal. Rendimento contratado no momento da criação. Imposto de 15% sobre o rendimento no momento do saque.
   - *Investimento:* Rendimento diário (positivo ou negativo). Imposto de 15% e taxa de 1,5% sobre o rendimento no saque.

3. **Fidelidade de Clientes:**
   - *Clientes Regulares:* Acesso padrão às contas conforme regras descritas.
   - *Clientes Gold:* Taxa mensal de R$10. Acumulam 10 pontos de fidelidade mensalmente e 10 pontos para cada R$1.000 de saldo.
   - *Clientes Vip:* Mensalidade de R$30. Acumulam 35 pontos mensalmente e 30 pontos a cada R$2.000 de saldo.
   - A utilização dos pontos será definida posteriormente.

4. **Visão de Diretoria:**
   - Total em custódia para cada tipo de conta.
   - Saldo médio de todas as contas.
   - Número de clientes com saldo total negativo.
   - Clientes com maior e menor saldo total.

### Instruções:

1. Utilize herança para criar classes base para Cliente e Conta, e depois subclasses para os tipos específicos.
2. Implemente interfaces para garantir que todas as contas tenham os métodos necessários.
3. Faça uso de polimorfismo onde aplicável.
4. Crie um menu no terminal para operações.
5. Crie um diagrama de classes.
6. Garanta a encapsulação dos dados.

### Entrega:

Apresente o código-fonte e o diagrama de classes.

### Critérios de Avaliação (Total: 5 pontos):

1. **Domínio dos Conceitos de OOP (1 ponto):**
   - **Herança (0,25 pontos):** Uso adequado de classes e subclasses.
   - **Polimorfismo (0,25 pontos):** Capacidade de tratar diferentes tipos.
   - **Interfaces (0,25 pontos):** Implementação de interfaces.
   - **Encapsulamento (0,25 pontos):** Proteção adequada dos atributos.

2. **Funcionalidade (1 ponto):**
   - **Funcionalidades Básicas (0,5 pontos):** Implementação das operações.
   - **Regras de Negócios (0,25 pontos):** Implementação correta das regras.
   - **Visão da Diretoria (0,25 pontos):** Implementação das funcionalidades de direção.

3. **Design e Organização do Código (1 ponto):**
   - **Estrutura (0,5 pontos):** Organização das classes e métodos.
   - **Documentação (0,25 pontos):** Comentários no código.
   - **Convenções (0,25 pontos):** Uso de boas práticas.

4. **Robustez e Tratamento de Erros (1 ponto):**
   - **Tratamento de Exceções (0,5 pontos):** Lidar com situações inesperadas.
   - **Testes (0,25 pontos):** Apresentação de testes.
   - **Consistência (0,25 pontos):** Garantia de consistência dos dados.

5. **Apresentação e Diagrama (1 ponto):**
   - **Clareza do Diagrama (0,5 pontos):** Representação visual clara.
   - **Correspondência com Código (0,25 pontos):** Fidelidade do diagrama ao código.
   - **Qualidade da Apresentação (0,25 pontos):** Capacidade de explicação.

