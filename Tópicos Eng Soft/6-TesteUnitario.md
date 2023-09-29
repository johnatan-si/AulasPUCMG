
# Análise de Dados de Usuários com PySpark

Vamos construir uma aplicação simples que calcula a idade média de usuários por país usando PySpark. Vamos também criar testes para essa funcionalidade e explicar o que esperamos deles.

## Configuração do Ambiente

Instale as dependências necessárias:
```bash
pip install pyspark pytest
```

## Estrutura do Projeto

```
bigDataAnalysis/
│
├── src/
│   ├── __init__.py
│   ├── dataProcessor.py
│
├── tests/
│   ├── __init__.py
│   ├── testDataProcessor.py
│
└── data/
    ├── users.json
```

## Dados de Amostra (users.json)

```json
[
    {"id": 1, "name": "Alice", "age": 28, "country": "US"},
    {"id": 2, "name": "Bob", "age": 22, "country": "UK"},
    {"id": 3, "name": "Charlie", "age": 35, "country": "US"},
    {"id": 4, "name": "David", "age": 29, "country": "CA"}
]
```

Nossos dados contêm informações básicas de usuários, como ID, nome, idade e país.

## Funcionalidade Principal (dataProcessor.py)

O objetivo aqui é ler os dados dos usuários e calcular a idade média por país.

```python
from pyspark.sql import SparkSession

def avgAgeByCountry(filePath):
    spark = SparkSession.builder.appName("AnalysisApp").getOrCreate()
    data = spark.read.json(filePath)
    avgAge = data.groupBy("country").agg({"age": "avg"}).collect()
    return {row["country"]: row["avg(age)"] for row in avgAge}
```

## Testando a Funcionalidade (testDataProcessor.py)

**O que estamos testando?**
Estamos verificando se nossa função `avgAgeByCountry` consegue calcular corretamente a idade média dos usuários por país.

**Expectativas:**
1. Para os usuários dos EUA (US), esperamos que a idade média seja `(28 + 35) / 2 = 31.5`.
2. Para o usuário do Reino Unido (UK), esperamos `22`.
3. Para o usuário do Canadá (CA), esperamos `29`.

```python
import pytest
from src.dataProcessor import avgAgeByCountry

def testAvgAgeByCountry():
    filePath = "./data/users.json"
    result = avgAgeByCountry(filePath)
    assert result["US"] == 31.5
    assert result["UK"] == 22
    assert result["CA"] == 29
```

## Executando o Teste

A partir do diretório principal (bigDataAnalysis):

```bash
pytest
```

Se tudo correr bem, os testes deverão passar sem erros, confirmando que a função `avgAgeByCountry` está calculando corretamente as idades médias por país.
