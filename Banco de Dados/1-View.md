
# Criando uma View em MySQL usando MySQL Workbench

Nessa aula, vamos aprender passo a passo como criar uma View em MySQL usando o MySQL Workbench. Uma View é uma representação virtual de uma tabela que contém uma consulta SQL. Ela pode ser usada para simplificar consultas complexas ou criar uma camada adicional de segurança, limitando o acesso aos dados subjacentes.

Vamos dividir este tutorial em três seções principais:

1.  Configurando o ambiente
2.  Criando o banco de dados e as tabelas
3.  Criando a View

## 1. Configurando o ambiente

Antes de começarmos, certifique-se de ter o MySQL Workbench instalado e configurado corretamente. Você pode baixar a versão mais recente do MySQL Workbench no site oficial do MySQL.

Após instalar o MySQL Workbench, abra o programa e conecte-se a um servidor MySQL existente ou crie um novo servidor.

## 2. Criando o banco de dados e as tabelas

Agora vamos criar o banco de dados e as tabelas necessárias para nosso exemplo.

### 2.1. Criando o banco de dados Via interface

Para criar um novo banco de dados, siga estes passos:

1.  No MySQL Workbench, clique no ícone "Create a new schema in the connected server" (Criar um novo esquema no servidor conectado) na barra de ferramentas superior ou selecione "Database -> Create Schema" (Banco de Dados -> Criar Esquema) no menu.
2.  Digite um nome para o novo banco de dados, por exemplo, "aulaview".
3.  Selecione o servidor onde deseja criar o banco de dados.
4.  Clique em "Apply" (Aplicar) e depois em "Finish" (Concluir) para criar o banco de dados.
5. 
### 2.1. Criando o banco de dados via SQL 
***Atenção.... ou você cria via interface ou via sql. Não faça os dois.*** 
Execute o seguinte comando SQL para criar o banco de dados:
````
CREATE DATABASE aulaview;
````

#### Usando o banco de dados

Use o banco de dados recém-criado executando o comando SQL a seguir:

````
`USE aulaview;`
````

### 2.2. Criando as tabelas

Agora, vamos criar as tabelas necessárias dentro do banco de dados recém-criado. Neste exemplo, vamos criar duas tabelas: "clientes" e "pedidos".

Siga estes passos para criar as tabelas:

1.  Selecione o banco de dados recém-criado na lista de esquemas à esquerda.
    
2.  Clique com o botão direito do mouse no banco de dados e selecione "Create Table..." (Criar Tabela...).
    
3.  Na janela "Create Table" (Criar Tabela), digite o nome da primeira tabela, por exemplo, "clientes".
    
4.  Defina as colunas da tabela, por exemplo:
````
id INT PRIMARY KEY,
nome VARCHAR(100),
email VARCHAR(100),
telefone VARCHAR(20)
````
5. Clique em "Apply" (Aplicar) e depois em "Finish" (Concluir) para criar a tabela "clientes".
    
6.  Repita os passos 2-5 para criar a tabela "pedidos" com as colunas adequadas.

### Criação das tabelas via sql manual
Agora, vamos criar as tabelas "clientes" e "pedidos" usando comandos SQL.

#### Tabela "clientes":
Execute o seguinte comando SQL para criar a tabela "clientes":

````
CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20)
);
````
#### Tabela "pedidos":

Execute o seguinte comando SQL para criar a tabela "pedidos":

````
CREATE TABLE pedidos (
    id INT PRIMARY KEY,
    cliente_id INT,
    produto VARCHAR(100),
    quantidade INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);
````

Agora temos nosso banco de dados e tabelas prontos para criar a View.

## 3. Criando a View

Agora vamos criar uma View que combina informações das tabelas "clientes" e "pedidos". A View irá exibir o nome do cliente, o email e o número total de pedidos feitos por cada cliente.

Siga estes passos para criar a View:

1.  Selecione o banco de dados que contém as tabelas na lista de esquemas à esquerda.
    
2.  Clique com o botão direito do mouse no banco de dados e selecione "Create View..." (Criar View...).
    
3.  Na janela "Create View" (Criar View), digite um nome para a View, por exemplo, "view_clientes_pedidos".
    
4.  Na área de texto "View Definition" (Definição da View), insira a consulta SQL que combina informações das tabelas, por exemplo:
````
SELECT 
    c.nome,
    c.email,
    COUNT(p.id) AS total_pedidos
FROM 
    clientes c
LEFT JOIN 
    pedidos p ON c.id = p.cliente_id
GROUP BY 
    c.id
````

1.  Clique em "Apply" (Aplicar) e depois em "Finish" (Concluir) para criar a View.
    

Você criou com sucesso uma View em MySQL usando o MySQL Workbench. Agora você pode usar essa View para executar consultas que exibam informações de clientes e seus pedidos de forma consolidada. Lembre-se de que as Views são atualizações virtuais dos dados subjacentes e não armazenam dados fisicamente. Elas são atualizadas automatica
# Criando uma View em MySQL usando MySQL Workbench

Nessa aula, vamos aprender passo a passo como criar uma View em MySQL usando o MySQL Workbench. Uma View é uma representação virtual de uma tabela que contém uma consulta SQL. Ela pode ser usada para simplificar consultas complexas ou criar uma camada adicional de segurança, limitando o acesso aos dados subjacentes.

Vamos dividir este tutorial em três seções principais:

1.  Configurando o ambiente
2.  Criando o banco de dados e as tabelas
3.  Criando a View

## 1. Configurando o ambiente

Antes de começarmos, certifique-se de ter o MySQL Workbench instalado e configurado corretamente. Você pode baixar a versão mais recente do MySQL Workbench no site oficial do MySQL.

Após instalar o MySQL Workbench, abra o programa e conecte-se a um servidor MySQL existente ou crie um novo servidor.

## 2. Criando o banco de dados e as tabelas

Agora vamos criar o banco de dados e as tabelas necessárias para nosso exemplo.

### 2.1. Criando o banco de dados Via interface

Para criar um novo banco de dados, siga estes passos:

1.  No MySQL Workbench, clique no ícone "Create a new schema in the connected server" (Criar um novo esquema no servidor conectado) na barra de ferramentas superior ou selecione "Database -> Create Schema" (Banco de Dados -> Criar Esquema) no menu.
2.  Digite um nome para o novo banco de dados, por exemplo, "aulaview".
3.  Selecione o servidor onde deseja criar o banco de dados.
4.  Clique em "Apply" (Aplicar) e depois em "Finish" (Concluir) para criar o banco de dados.
5. 
### 2.1. Criando o banco de dados via SQL 
***Atenção.... ou você cria via interface ou via sql. Não faça os dois.*** 
Execute o seguinte comando SQL para criar o banco de dados:
````
CREATE DATABASE aulaview;
````

#### Usando o banco de dados

Use o banco de dados recém-criado executando o comando SQL a seguir:

````
`USE aulaview;`
````

### 2.2. Criando as tabelas

Agora, vamos criar as tabelas necessárias dentro do banco de dados recém-criado. Neste exemplo, vamos criar duas tabelas: "clientes" e "pedidos".

Siga estes passos para criar as tabelas:

1.  Selecione o banco de dados recém-criado na lista de esquemas à esquerda.
    
2.  Clique com o botão direito do mouse no banco de dados e selecione "Create Table..." (Criar Tabela...).
    
3.  Na janela "Create Table" (Criar Tabela), digite o nome da primeira tabela, por exemplo, "clientes".
    
4.  Defina as colunas da tabela, por exemplo:
````
id INT PRIMARY KEY,
nome VARCHAR(100),
email VARCHAR(100),
telefone VARCHAR(20)
````
5. Clique em "Apply" (Aplicar) e depois em "Finish" (Concluir) para criar a tabela "clientes".
    
6.  Repita os passos 2-5 para criar a tabela "pedidos" com as colunas adequadas.

### Criação das tabelas via sql manual
Agora, vamos criar as tabelas "clientes" e "pedidos" usando comandos SQL.

#### Tabela "clientes":
Execute o seguinte comando SQL para criar a tabela "clientes":

````
CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20)
);
````
#### Tabela "pedidos":

Execute o seguinte comando SQL para criar a tabela "pedidos":

````
CREATE TABLE pedidos (
    id INT PRIMARY KEY,
    cliente_id INT,
    produto VARCHAR(100),
    quantidade INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);
````

Agora temos nosso banco de dados e tabelas prontos para criar a View.

## 3. Criando a View

Agora vamos criar uma View que combina informações das tabelas "clientes" e "pedidos". A View irá exibir o nome do cliente, o email e o número total de pedidos feitos por cada cliente.

Siga estes passos para criar a View:

1.  Selecione o banco de dados que contém as tabelas na lista de esquemas à esquerda.
    
2.  Clique com o botão direito do mouse no banco de dados e selecione "Create View..." (Criar View...).
    
3.  Na janela "Create View" (Criar View), digite um nome para a View, por exemplo, "view_clientes_pedidos".
    
4.  Na área de texto "View Definition" (Definição da View), insira a consulta SQL que combina informações das tabelas, por exemplo:
````
SELECT 
    c.nome,
    c.email,
    COUNT(p.id) AS total_pedidos
FROM 
    clientes c
LEFT JOIN 
    pedidos p ON c.id = p.cliente_id
GROUP BY 
    c.id
````

1.  Clique em "Apply" (Aplicar) e depois em "Finish" (Concluir) para criar a View.


#### A criação da view também pode ser manual 
````
CREATE VIEW nome_da_view AS
SELECT 
    c.nome,
    c.email,
    COUNT(p.id) AS total_pedidos
FROM 
    clientes c
LEFT JOIN 
    pedidos p ON c.id = p.cliente_id
GROUP BY 
    c.id;
````

Substitua `nome_da_view` pelo nome que deseja atribuir à View. Você pode verificar se a View foi criada corretamente executando o seguinte comando:

````
SHOW CREATE VIEW nome_da_view;
````
Substitua `nome_da_view` pelo nome da View que você criou.

O comando mostrará a definição SQL da View e confirmará se ela foi criada com sucesso.

Pronto! Agora você criou uma View usando comandos SQL, sem depender de uma interface gráfica.

Neste exemplo, estamos criando uma View chamada `nome_da_view` que combina informações das tabelas `clientes` e `pedidos`, exibindo o nome do cliente, o email e o número total de pedidos feitos por cada cliente.

Você criou com sucesso uma View em MySQL usando o MySQL Workbench. Agora você pode usar essa View para executar consultas que exibam informações de clientes e seus pedidos de forma consolidada. Lembre-se de que as Views são atualizações virtuais dos dados subjacentes e não armazenam dados fisicamente. Elas são atualizadas automaticamente conforme os dados nas tabelas subjacentes são modificados. Essa aula  abordou os conceitos básicos de criação de uma View no MySQL. Você pode explorar mais recursos avançados do MySQL Workbench e a sintaxe SQL para criar Views mais complexas e personalizadas. Espero que esta aula tenha sido útil e tenha fornecido uma introdução clara à criação de Views no MySQL usando o MySQL Workbench.

mente conforme os dados nas tabelas subjacentes são modificados. Essa aula  abordou os conceitos básicos de criação de uma View no MySQL. Você pode explorar mais recursos avançados do MySQL Workbench e a sintaxe SQL para criar Views mais complexas e personalizadas. Espero que esta aula tenha sido útil e tenha fornecido uma introdução clara à criação de Views no MySQL usando o MySQL Workbench.

