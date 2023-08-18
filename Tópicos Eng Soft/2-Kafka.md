
### **Tutorial Kafka no Windows**

**1. Instalação e Configuração**

TÔ SUPONDO QUE ESSE PASSO VOCÊ JÁ FEZ, NÉ? 

1.2. Extraia o arquivo baixado para um diretório de sua escolha, por exemplo: `C:\kafka_3.5.1`.

**2. Iniciando o Zookeeper e o Kafka**

2.1. Abra o terminal e navegue até a pasta `bin\windows`:

bashCopy code

`cd C:\kafka_3.5.1\bin\windows` 

2.2. Inicie o ZooKeeper:

`zookeeper-server-start.bat ..\..\config\zookeeper.properties` 

2.3. Abra um novo terminal e novamente navegue até `bin\windows` e inicie o servidor Kafka:

`cd C:\kafka_3.5.1\bin\windows
kafka-server-start.bat ..\..\config\server.properties` 

**3. Criando um Tópico no Kafka**

3.1. Em um novo terminal, crie um tópico chamado "meu_topico":

`cd C:\kafka_3.5.1\bin\windows
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic meu_topico` 

**4. Produzindo e Consumindo Mensagens com Kafka**

4.1. Criando um arquivo de logs:

-   No diretório `C:\kafka_3.5.1\bin\windows`, crie um arquivo chamado `logs.txt`.
    
-   Adicione algumas linhas de texto a este arquivo, como se fossem logs. Por exemplo:
    

`ERROR: Erro na aplicação.  INFO: João acessou a plataforma.  
WARNING: Maria tentou acessar com senha incorreta.  INFO: Sistema inicializado com sucesso.` 

4.2. Produzindo mensagens a partir de `logs.txt`:

Navegue até `bin\windows` (se já não estiver lá) e execute:


`kafka-console-producer.bat --broker-list localhost:9092 --topic meu_topico < logs.txt` 

4.3. Consumindo mensagens:

Em um novo terminal:


`cd C:\kafka_3.5.1\bin\windows
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic meu_topico --from-beginning` 

Agora, você deve ver as linhas do arquivo `logs.txt` aparecendo como mensagens no consumidor.
