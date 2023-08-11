## Configurando e Usando o Apache Kafka no Linux e Windows

Nessa aula  vamos aprender os passos necessários para configurar um ambiente básico do Apache Kafka no Linux e Windows, e criar um tópico de streaming para coletar dados em tempo real. O Apache Kafka é uma plataforma poderosa para streaming de dados em ambientes de Big Data.


**Passo 1: Instalação do Apache Kafka**

1.  Faça o download do Apache Kafka em [https://kafka.apache.org/downloads](https://kafka.apache.org/downloads).
2.  Extraia o arquivo baixado para uma pasta de sua escolha.
3.  Acesse a pasta do Kafka usando o terminal.

**Passo 2: Iniciar o Servidor do ZooKeeper**

O Apache Kafka depende do servidor do ZooKeeper para coordenar e gerenciar os nós do cluster. Execute o seguinte comando:

> bin/zookeeper-server-start.sh config/zookeeper.properties


**Passo 3: Iniciar o Servidor do Kafka**

Agora, inicie o servidor do Kafka executando o seguinte comando:

> bin/kafka-server-start.sh config/server.properties

**Passo 4: Criar um Tópico**

Vamos criar um tópico chamado "dados-em-tempo-real" usando o seguinte comando:


> bin/kafka-topics.sh --create --topic dados-em-tempo-real
> --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

**Passo 5: Produzir Dados para o Tópico**

Agora, vamos produzir dados simulados para o tópico "dados-em-tempo-real":

> bin/kafka-console-producer.sh --topic dados-em-tempo-real
> --bootstrap-server localhost:9092

**Passo 6: Consumir Dados do Tópico**

Em uma nova janela do terminal, vamos consumir os dados do tópico "dados-em-tempo-real":

> bin/kafka-console-consumer.sh --topic dados-em-tempo-real
> --bootstrap-server localhost:9092

**Passo 7: Experimente!**

Agora TEMOS O  ambiente básico do Apache Kafka configurado e um tópico de streaming pronto para coletar dados em tempo real. Experimente produzir dados no produtor e observar a sua visualização no consumidor.

Este é apenas um exemplo introdutório. O Apache Kafka oferece muitos recursos avançados, como particionamento, replicação e controle de offset, para lidar com cenários mais complexos.

Lembre-se de que esta  aula cobre apenas os passos básicos. À medida que APRENDERMOS MAIS NA DISCIPLINA, iremos  explora mais sobre o Apache Kafka. Dessa forma, você poderá mergulhar em configurações avançadas e casos de uso mais elaborados.



