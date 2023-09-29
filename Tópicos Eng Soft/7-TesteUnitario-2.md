
## Atividade: Criação de Testes Unitários para Big Data

### Descrição:

Nesta atividade, você desenvolverá testes unitários para um dataset do GitHug usando Python  e  Visual Studio Code.

### Dataset:

O dataset possui os seguintes campos:

- **Username:** Nome do usuário (String)
- **RepositoryName:** Nome do repositório (String)
- **Description:** Descrição do repositório (String, pode ser nulo)
- **LastUpdateDate:** Data da última atualização (DateTime)
- **Language:** Linguagem de programação principal (String, pode ser nulo)
- **NumberOfStars:** Número de estrelas do repositório (Inteiro)
- **Tags:** Tags associadas ao repositório (String, pode ser nulo)
- **Url:** URL do repositório (String)

### Configurando seu ambiente no Visual Studio Code:

1. Abra o Visual Studio Code.
2. Crie uma nova pasta chamada `BigDataTests`.
3. Dentro de `BigDataTests`, crie duas subpastas: `Data` e `Tests`.
4. Coloque o arquivo do dataset (por exemplo, `Dataset.csv`) dentro da pasta `Data`.
5. Vamos usar as bibliotecas `pytest` e `pandas`:
   ```bash
      pip install pytest pandas
   ```

### Tarefa:

Dentro da pasta `Tests`, crie um arquivo chamado `TestDataIntegrity.py`. Escreva seus testes unitários neste arquivo.

### Requisitos do Teste:

1. **Validação de integridade:** Verifique se os campos que são `non-null` no dataset realmente não possuem valores nulos.
2. **Validação de formato:** Verifique se o campo `LastUpdateDate` possui um formato de data válido.
3. **Validação de tipos:** Verifique se o campo `NumberOfStars` é um número inteiro.
4. **Validação de formato de URL:** Verifique se o campo `Url` possui um formato de URL válido.

### Exemplo de Teste para Base:

A seguir, veja um exemplo de teste unitário que verifica a validação de integridade para o campo `Username`:

```python
import pandas as pd
import pytest

data = pd.read_csv("../Data/Dataset.csv")

def testUsernameIntegrity():
    assert data["Username"].isnull().sum() == 0, "Campo Username possui valores nulos!"
```

Com base nesse exemplo, desenvolva testes para os outros requisitos. Ao concluir, você pode executar seus testes no terminal do VS Code usando:

```bash
pytest Tests/
```

Certifique-se de que todos os testes passem sem erros e estejam de acordo com os requisitos fornecidos.
