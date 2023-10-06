
# Atividade: Testes em Processamento de Big Data com PySpark

## Objetivo

Aprender a escrever e executar testes unitários para funções que processam dados utilizando PySpark.

## Pré-requisitos

- PySpark
- pytest
Se não tiver, faça a instalação usando: pip3 intall pyspark & pytest

## Instruções
### 1.  Estrutura de Arquivos Sugerida 	

    /big-data-testing-activity
    |-- /src 
    |   |-- dataProcessor.py 
    |-- /tests 
	    |-- testDataProcessor.py 
	|-- /data 
		-- users.json

### 2. Arquivo base json chamado: users.json

    [
        {"name": "Alice", "age": 28, "country": "US"},
        {"name": "Bob", "age": 35, "country": "US"},
        {"name": "Charlie", "age": 22, "country": "UK"},
        {"name": "David", "age": 29, "country": "CA"}
    ]
### 3. Código base: dataProcessor.py

```python
from  pyspark.sql  import  SparkSession

def  avgAgeCountry(filePath):

	spark  =  SparkSession.builder.appName("AnalysisApp").getOrCreate()
	data  =  spark.read.json(filePath)
	avgAge  =  data.groupBy("country").agg({"age": "avg"}).collect()
	result  = {row["country"]: row["avg(age)"] for  row  in  avgAge}

	print(result)

	return  result
```

### 4. Código para teste unitário: DataProcessor_test.py 

```python
import  pytest

from  src.dataProcessor  import  avgAgeCountry
  
def  testAvgAgeCountry():

file_path  =  "data/users.json"

result  =  avgAgeCountry(file_path)

  

assert  result["US"] == (28  +  35) /  2
assert  result["UK"] ==  22
assert  result["CA"] ==  29

```

### 4. Atividade 

 - No arquivo `/tests/testDataProcessor.py`, escreva mais testes unitários para a função `avgAgeCountry`. Considere cenários como:

	-  	 Arquivo JSON vazio.
	-   Valores de idade ausentes ou nulos.
	-   Campo `country` ausente ou nulo.
	- Escreva mais funções que realizam diferentes tipos de processamento de dados e teste-as.
	- Modifique a função `avgAgeCountry` para que ela aceite uma função de transformação como segundo argumento. Esta função deve ser aplicada à idade antes de calcular a média (por exemplo, converter idade de anos para meses). Escreva testes para essa nova funcionalidade.

### Relatório 
Depois de concluir a atividade, reflita sobre os desafios de escrever testes para big data e a importância de testar funções que processam grandes volumes de dados. Considere também a otimização de performance com PySpark. Para isso, escreva um relatório técnico que  mostre importância dos seus testes e qual era o seu objetivo. O relatório deve abordar os tipos de teste e qual era a sua intenção com esses testes, por exemplo, quais problemas você estava tentando  evitar.  Para essa atividade é obrigatório apenas o teste unitário. Porém, o aluno pode desenvolver diferentes asserts para o testo unitário.  Explique a importância das outras funções que você criou.  O template para o relatório pode ser acessado em: [Overleaf
](https://www.overleaf.com/read/scydhjmrtszr)

### 5. Avaliação

Os critérios de avaliação incluem:

-   Correção e robustez dos testes.
-   Deteção de problemas 
- Explicação via relatório
