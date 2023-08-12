# Passo 1: Você já tem o Kafka instalado, né ? Se não tem , instale! 

### Passo 2: Inicie o ZooKeeper

> bin/zookeeper-server-start.sh config/zookeeper.properties

### Passo 3: Inicie o Kafka Broker

> bin/kafka-server-start.sh config/server.properties


### Passo 4: Criar um Tópico

> bin/kafka-topics.sh --create --topic vendas --bootstrap-server
> localhost:9092 --partitions 1 --replication-factor 1

### Passo 5: Produtor de Vendas

Crie um arquivo chamado `vendas-producer.py`:


    from kafka import KafkaProducer
    import json
    
    producer = KafkaProducer(bootstrap_servers='localhost:9092', value_serializer=lambda v: json.dumps(v).encode('utf-8'))
    
    venda = {
        "produto_id": "123",
        "quantidade": 5,
        "valor_total": 250.0
    }
    
    producer.send('vendas', venda)
    print("Venda registrada:", venda)


### Passo 6: Consumidor de Estoque

Crie um arquivo chamado `estoque-consumer.py`:

    from kafka import KafkaConsumer
    import json
    
    consumer = KafkaConsumer('vendas', bootstrap_servers='localhost:9092', value_deserializer=lambda v: json.loads(v.decode('utf-8')))
    
    for message in consumer:
        venda = message.value
        print("Venda recebida:", venda)


### Passo 7: Consumidor de Relatórios

Crie um arquivo chamado `relatorios-consumer.py`:

    from kafka import KafkaConsumer
    import json
    
    consumer = KafkaConsumer('vendas', bootstrap_servers='localhost:9092', value_deserializer=lambda v: json.loads(v.decode('utf-8')))
    
    for message in consumer:
        venda = message.value
        print("Relatório gerado para a venda:", venda)

### Passo 8: Execute os Consumidores e Produtores

Abra três terminais e execute cada script de consumidor e o produtor:

**Terminal 1:**

> python vendas-producer.py

**Terminal 2:**

> python estoque-consumer.py


**Terminal 3:**
 

> python relatorios-consumer.py


Isso é apenas um exemplo básico para entender como o Kafka pode ser usado. Em um ambiente de produção real, você precisaria considerar aspectos como o gerenciamento de erros, particionamento, replicação, e muito mais.
