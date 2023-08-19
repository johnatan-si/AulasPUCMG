

### Teste de Carga usando Teste Unitário em Python

Na aula de hoje, faremos um abuso do uso dos testes unitários para simular um teste de carga. Embora testes de unidade normalmente não sejam usados para testes de carga, é possível simular um cenário básico de carga usando o módulo `unittest` do Python. A seguir, detalharemos um exercício prático sobre isso.

#### 1. Criando o "Serviço" de Big Data

Primeiro, criaremos uma função simples que simula a recuperação de uma grande quantidade de dados:


    def get_big_data():
        # Simula um atraso para obter os dados, como se fosse uma operação pesada
        import time
        time.sleep(0.1)  # simula um atraso de 100ms
        return [i for i in range(10000)]  # retornando uma lista com 10.000 números

#### 2. Criando o Teste de Carga

Nesta etapa, usaremos o módulo `unittest` do Python, e também `threading` para simular múltiplas requisições ao nosso "serviço". Pode ser necessário instalar o modulo unittest. Se for necessário, use pip 3 install unittest. 

> import unittest import threading
> 
> class BigDataLoadTest(unittest.TestCase):
> 
>     def test_load(self):
>         def worker():
>             data = get_big_data()
>             self.assertEqual(len(data), 10000)  # Verifica se os dados recuperados têm o tamanho esperado
> 
>         # Cria 100 threads, cada uma chamando o serviço
>         threads = []
>         for _ in range(100):
>             t = threading.Thread(target=worker)
>             threads.append(t)
>             t.start()
> 
>         # Espera todas as threads terminarem
>         for t in threads:
>             t.join()

#### 3. Executando o Teste

Para executar o teste, utilize o seguinte código:

    > `if __name__ == '__main__':
    >     unittest.main()`

### Explicação:

O teste acima simula um teste de carga ao fazer várias chamadas simultâneas a um serviço que recupera uma grande quantidade de dados. Usamos threads para simular várias requisições ao serviço ao mesmo tempo. A função `get_big_data` simula a recuperação de dados com um **atraso artificial**, representando uma operação que leva algum tempo. No nosso teste, verificamos a carga deste serviço ao fazer 100 requisições simultâneas a ele. Embora este seja um exemplo simples e não utilize ferramentas de teste de carga reais, ele oferece uma noção básica de como as coisas funcionam. Em cenários reais, ferramentas como **JMeter** ou **Locust** seriam mais adequadas para essa finalidade.
