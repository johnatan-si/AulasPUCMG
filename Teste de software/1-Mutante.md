
# Aula: Teste de Mutante com MutPy em Python

Nessa aula, vamos aprender como criar testes de software utilizando a técnica de teste de mutante com a biblioteca MutPy em Python. O teste de mutante é uma técnica que envolve a modificação controlada do código-fonte para verificar a eficácia dos testes.

## Pré-requisitos

Antes de começarmos, certifique-se de que você tenha as seguintes ferramentas instaladas:

-   Python (versão 3.x)
-   Pip (gerenciador de pacotes do Python)

## Passo 1: Instalação do MutPy

O primeiro passo é instalar o MutPy. Abra o terminal ou prompt de comando e execute o seguinte comando:

````
pip install mutpy
````

Isso instalará o MutPy e suas dependências.

## Passo 2: Configuração do ambiente

Crie um diretório para o seu projeto e navegue até ele no terminal ou prompt de comando:
````
mkdir teste-de-mutante
cd teste-de-mutante
````

## Passo 3: Escrevendo o código

Agora, vamos escrever um código simples para demonstrar o teste de mutante. Crie um arquivo chamado `calculos.py` e adicione o seguinte conteúdo:

````
def soma(a, b):
    return a + b

def subtracao(a, b):
    return a - b

def multiplicacao(a, b):
    return a * b
````

Este código contém três funções simples: `soma`, `subtracao` e `multiplicacao`. Vamos criar testes para cada uma delas usando o MutPy.

## Passo 4: Escrevendo os testes

Crie um arquivo chamado `test_calculos.py` para escrever os testes. Adicione o seguinte conteúdo:

````
import unittest
from calculos import soma, subtracao, multiplicacao

class TestCalculos(unittest.TestCase):

    def test_soma(self):
        self.assertEqual(soma(2, 3), 5)

    def test_subtracao(self):
        self.assertEqual(subtracao(5, 3), 2)

    def test_multiplicacao(self):
        self.assertEqual(multiplicacao(2, 3), 6)

if __name__ == '__main__':
    unittest.main()
````

Neste código, estamos importando as funções `soma`, `subtracao` e `multiplicacao` do arquivo `calculos.py` e escrevendo testes para cada uma delas usando a biblioteca `unittest`. Cada teste verifica se o resultado da função corresponde ao valor esperado.

## Passo 5: Executando os testes

No terminal ou prompt de comando, execute o seguinte comando para executar os testes:

````
python test_calculos.py
````

Você verá a saída dos testes, indicando se eles passaram ou falharam.

## Passo 6: Executando o MutPy

Agora que os testes estão funcionando corretamente, vamos executar o MutPy para realizar o teste de mutante. No terminal ou prompt de comando, execute o seguinte comando:
````
mut.py --target calculos.py --unit-test test_calculos.py
````

O MutPy irá modificar o código-fonte de forma controlada, gerando mutantes. Em seguida, executará os testes para cada mutante gerado, verificando se os testes conseguem detectar as mutações.

## Passo 7: Analisando os resultados

Após a execução do MutPy, você verá uma saída mostrando os resultados do teste de mutante. Os resultados incluem o número total de mutantes, quantos foram mortos (detectados pelos testes) e a porcentagem de cobertura de mutante.
Analise os resultados para identificar mutantes que não foram detectados pelos testes. Isso pode indicar falhas nos testes e áreas do código que precisam ser melhor cobertas.

Lembre-se de que o teste de mutante é apenas uma ferramenta adicional no processo de teste de software. É importante combiná-lo com outras técnicas e práticas de teste para obter resultados abrangentes. Experimente o MutPy em seus próprios projetos e explore mais recursos e opções oferecidos pela biblioteca.

## Desafio

Seja o código Python para uma  função de loop.  Arquivo foo.py

````
def foo(a, b):
    c = 0
    while(a < 0):
        if (b < 0):
            b = b + 2
        a = a + 1
    c = a + b
    return c
````

Para o código anterior, temos o caso de teste  a seguir. Para esse caso de teste  um tipo de mutante ficará vivo. Modifique o  caso de teste de tal forma que ele seja capaz de matar esse mutante. Veja o código a seguir: 

````
import unittest

from Foo import foo

class TestMethod(unittest.TestCase):

	def test_case1(self):
		self.assertEqual(foo(1,1), 2, "Precisa ser 2")

	def test_case2(self):
		self.assertEqual(foo(-1,1), 1, "Precisa ser 1")

	def test_case3(self):
		self.assertEqual(foo(-1,-1), 1,  "Precisa ser 1")


if __name__ == '__main__':
    unittest.main()
    ````
