

# Tutorial de Estruturas de Dados em Java

Neste tutorial, vamos aprender sobre algumas das estruturas de dados mais comuns em Java, incluindo Listas, Pilhas e Filas. As estruturas de dados são essenciais para armazenar e organizar dados de maneira eficiente em um programa.

## 1. Listas

Uma lista é uma coleção ordenada de elementos, onde cada elemento tem uma posição indexada. Em Java, a interface `List` é implementada por várias classes, sendo a mais comum a `ArrayList`.

### Criando uma Lista:

    import java.util.List;
    import java.util.ArrayList;
    
    // Criando uma lista de inteiros
    List<Integer> numeros = new ArrayList<>();
    
    // Adicionando elementos à lista
    adicionarElemento(numeros, 10);
    adicionarElemento(numeros, 20);
    adicionarElemento(numeros, 30);
    
    // Método para adicionar elementos à lista
    public static void adicionarElemento(List<Integer> lista, int elemento) {
        lista.add(elemento);
    }

### Acessando Elementos:

    // Acessando o primeiro elemento
    int primeiro = acessarElemento(numeros, 0); // Output: 10
    
    // Acessando o último elemento
    int ultimo = acessarElemento(numeros, numeros.size() - 1); // Output: 30
    
    // Método para acessar elementos da lista
    public static int acessarElemento(List<Integer> lista, int index) {
        return lista.get(index);
    }


### Iterando sobre a Lista:

    // Iterando com for-each loop
    iterarLista(numeros);
    
    // Método para iterar sobre a lista
    public static void iterarLista(List<Integer> lista) {
        for (int numero : lista) {
            System.out.println(numero);
        }
    }


## 2. Pilha (Stack)

Uma pilha é uma estrutura de dados do tipo LIFO (Last In, First Out), onde o último elemento adicionado é o primeiro a ser removido.

### Criando uma Pilha:

    import java.util.Stack;
    
    // Criando uma pilha de strings
    Stack<String> pilha = new Stack<>();
    
    // Adicionando elementos à pilha
    adicionarElemento(pilha, "A");
    adicionarElemento(pilha, "B");
    adicionarElemento(pilha, "C");
    
    // Método para adicionar elementos à pilha
    public static void adicionarElemento(Stack<String> pilha, String elemento) {
        pilha.push(elemento);
    }


### Removendo Elementos:

    // Removendo o elemento do topo da pilha
    String elementoRemovido = removerElemento(pilha); // Output: "C"
    
    // Método para remover elementos da pilha
    public static String removerElemento(Stack<String> pilha) {
        return pilha.pop();
    }


### Verificando o Topo da Pilha:

    // Verificando o elemento no topo da pilha sem removê-lo
    String topo = verificarTopo(pilha); // Output: "B"
    
    // Método para verificar o topo da pilha
    public static String verificarTopo(Stack<String> pilha) {
        return pilha.peek();
    }


## 3. Fila (Queue)

Uma fila é uma estrutura de dados do tipo FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser removido.

### Criando uma Fila:

    import java.util.LinkedList;
    import java.util.Queue;
    
    // Criando uma fila de caracteres
    Queue<Character> fila = new LinkedList<>();
    
    // Adicionando elementos à fila
    adicionarElemento(fila, 'X');
    adicionarElemento(fila, 'Y');
    adicionarElemento(fila, 'Z');
    
    // Método para adicionar elementos à fila
    public static void adicionarElemento(Queue<Character> fila, char elemento) {
        fila.add(elemento);
    }


### Removendo Elementos:

    // Removendo o primeiro elemento da fila
    char elementoRemovido = removerElemento(fila); // Output: 'X'
    
    // Método para remover elementos da fila
    public static char removerElemento(Queue<Character> fila) {
        return fila.poll();
    }

### Verificando o Primeiro Elemento:

    // Verificando o primeiro elemento da fila sem removê-lo
    char primeiro = verificarPrimeiro(fila); // Output: 'Y'
    
    // Método para verificar o primeiro elemento da fila
    public static char verificarPrimeiro(Queue<Character> fila) {
        return fila.peek();
    }

