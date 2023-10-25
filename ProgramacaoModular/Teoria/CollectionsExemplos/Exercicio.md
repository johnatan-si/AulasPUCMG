# EXERÍCIOS RESOLVIDOS

# 1- Exercício: Sistema de Gerenciamento de Notas de Alunos

Neste exercício, você irá criar um sistema de gerenciamento de notas para uma escola usando Java e a estrutura de dados `HashMap`. O sistema permitirá que você adicione notas aos alunos, recupere as notas de um aluno específico e calcule a média das notas.

## Tarefas

1. Crie uma classe chamada `StudentManager` que conterá um `HashMap` para armazenar os alunos e suas notas.

2. Implemente um método chamado `addGrade` que recebe o nome de um aluno e uma nota. Este método deve adicionar a nota ao aluno correspondente no `HashMap`. Se o aluno não estiver no `HashMap`, ele deve ser adicionado com a nota.

3. Implemente um método chamado `getGrades` que recebe o nome de um aluno e retorna suas notas como uma lista.

4. Implemente um método chamado `calculateAverage` que recebe o nome de um aluno e calcula a média de suas notas. A média deve ser retornada como um valor decimal.

5. Crie um programa principal (`main`) para testar o sistema. Adicione alguns alunos e notas ao `StudentManager` e realize operações de recuperação e cálculo de média.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        // notas dos alunos
        studentManager.addGrade("João", 85);
        studentManager.addGrade("Maria", 92);
        studentManager.addGrade("Pedro", 78);

        // Recuperar notas de um aluno
        List<Integer> gradesMaria = studentManager.getGrades("Maria");
        System.out.println("Notas de Maria: " + gradesMaria);

        // Calcular a média de um aluno
        double averagePedro = studentManager.calculateAverage("Pedro");
        System.out.println("Média de Pedro: " + averagePedro);
    }
}
````

# 2- Exercício: Remoção de Duplicatas de uma Lista usando HashSet

Neste exercício, você enfrentará um problema comum em que precisa remover duplicatas de uma lista de números inteiros. Para resolver esse problema, você usará a estrutura de dados `HashSet` em Java.

## Contexto

Você recebeu uma lista de números inteiros e sua tarefa é remover todas as duplicatas, deixando apenas os valores únicos. Você deve implementar um método chamado `removeDuplicates` que aceita uma lista de números inteiros e retorna uma nova lista contendo apenas os valores únicos, preservando a ordem original.

Por exemplo, se a lista original for `[3, 7, 1, 3, 9, 7, 3]`, a lista resultante após a remoção das duplicatas deve ser `[3, 7, 1, 9]`.

## Tarefas

1. Crie uma classe chamada `DuplicateRemover`.

2. Implemente um método estático chamado `removeDuplicates` na classe `DuplicateRemover` que aceita uma lista de números inteiros como entrada e retorna uma nova lista contendo apenas os valores únicos, preservando a ordem original.

3. Use um `HashSet` para realizar a remoção de duplicatas de forma eficiente. Aqui estão os passos gerais:
   - Crie um `HashSet` para armazenar temporariamente os valores únicos.
   - Percorra a lista original e, para cada elemento, adicione-o ao `HashSet`. Como um `HashSet` não permite duplicatas, ele automaticamente removerá quaisquer valores duplicados.
   - Crie uma nova lista para armazenar os valores únicos na ordem em que foram encontrados (mantendo a ordem original).

## Exemplo de Uso

```java
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class DuplicateRemover {
    public static List<Integer> removeDuplicates(List<Integer> originalList) {
        // Crie um HashSet para armazenar os valores únicos
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Crie uma nova lista para armazenar os valores únicos na ordem original
        List<Integer> uniqueList = new ArrayList<>();

        // Percorra a lista original e adicione os elementos ao HashSet e à lista única
        for (Integer num : originalList) {
            if (uniqueSet.add(num)) {
                uniqueList.add(num);
            }
        }

        return uniqueList;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = Arrays.asList(3, 7, 1, 3, 9, 7, 3);

        List<Integer> uniqueList = DuplicateRemover.removeDuplicates(originalList);

        System.out.println("Lista original: " + originalList);
        System.out.println("Lista após a remoção de duplicatas: " + uniqueList);
    }
}
````


# 3- Exercício: Manutenção da Ordem de Inserção usando LinkedHashSet

Neste exercício, você lidará com um cenário em que a ordem de inserção de elementos é importante. Para resolver esse problema, você usará a estrutura de dados `LinkedHashSet` em Java.

## Contexto

Você está desenvolvendo um sistema de gerenciamento de tarefas em que a ordem em que as tarefas são adicionadas é significativa. Você precisa implementar uma lista de tarefas que mantenha a ordem de inserção das tarefas, mas também permita a remoção eficiente de tarefas duplicadas.

Para fazer isso, você usará a estrutura de dados `LinkedHashSet`, que mantém a ordem de inserção dos elementos e, ao mesmo tempo, garante que não haja duplicatas.

## Tarefas

1. Crie uma classe chamada `TaskList`.

2. Implemente um método `addTask` na classe `TaskList` que aceita o nome de uma tarefa como entrada e a adiciona à lista de tarefas.

3. Implemente um método `removeTask` na classe `TaskList` que aceita o nome de uma tarefa como entrada e a remove da lista de tarefas.

4. Use um `LinkedHashSet` para armazenar as tarefas. Isso garantirá que a ordem de inserção seja mantida e que não haja tarefas duplicadas.

## Exemplo de Uso

```java
import java.util.LinkedHashSet;

public class TaskList {
    private LinkedHashSet<String> tasks = new LinkedHashSet<>();

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    public void removeTask(String taskName) {
        tasks.remove(taskName);
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Estudar Java");
        taskList.addTask("Fazer exercícios");
        taskList.addTask("Estudar Java"); // Tarefa duplicada

        System.out.println("Lista de tarefas:");
        taskList.displayTasks();

        taskList.removeTask("Fazer exercícios");

        System.out.println("\nLista de tarefas após a remoção:");
        taskList.displayTasks();
    }
}
```


# 4-Exercício: Ordenação de Números usando TreeSet

Neste exercício, você enfrentará um problema em que precisa ordenar um conjunto de números inteiros de forma crescente. Para resolver esse problema, você usará a estrutura de dados `TreeSet` em Java.

## Contexto

Você está desenvolvendo um programa que precisa ler um conjunto de números inteiros e exibi-los em ordem crescente. Para fazer isso, você usará um `TreeSet`, que é uma implementação da interface `Set` que armazena elementos únicos e os mantém automaticamente em ordem crescente.

## Tarefas

1. Crie uma classe chamada `NumberSorter`.

2. Implemente um método estático chamado `sortNumbers` na classe `NumberSorter` que aceita uma lista de números inteiros como entrada e retorna um `TreeSet` contendo esses números em ordem crescente.

3. Use um `TreeSet` para realizar a ordenação dos números. O `TreeSet` garantirá que os números sejam automaticamente organizados em ordem crescente.

## Exemplo de Uso

```java
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.Arrays;

public class NumberSorter {
    public static Set<Integer> sortNumbers(List<Integer> numbers) {
        TreeSet<Integer> sortedNumbers = new TreeSet<>(numbers);
        return sortedNumbers;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);

        Set<Integer> sortedNumbers = NumberSorter.sortNumbers(numbers);

        System.out.println("Números em ordem crescente:");
        for (Integer num : sortedNumbers) {
            System.out.println(num);
        }
    }
}

````



# 5-Exercício: Gerenciamento de Itens em uma Lista usando ArrayList

Neste exercício, você enfrentará um problema em que precisa gerenciar uma lista de itens. Para resolver esse problema, você usará a estrutura de dados `ArrayList` em Java.

## Contexto

Você está desenvolvendo um programa para um restaurante que deseja gerenciar os pedidos dos clientes. Para fazer isso, você usará um `ArrayList`, que é uma implementação da interface `List` em Java que permite armazenar e manipular uma coleção de itens de forma dinâmica.

## Tarefas

1. Crie uma classe chamada `OrderManager`.

2. Implemente um método chamado `addItem` na classe `OrderManager` que aceita o nome de um item de pedido como entrada e o adiciona à lista de itens do pedido.

3. Implemente um método chamado `removeItem` na classe `OrderManager` que aceita o nome de um item de pedido como entrada e o remove da lista de itens do pedido.

4. Implemente um método chamado `displayOrder` na classe `OrderManager` que exibe a lista de itens do pedido.

5. Use um `ArrayList` para armazenar os itens do pedido e realizar as operações de adição e remoção de itens.

## Exemplo de Uso

```java
import java.util.List;
import java.util.ArrayList;

public class OrderManager {
    private List<String> orderItems = new ArrayList<>();

    public void addItem(String itemName) {
        orderItems.add(itemName);
    }

    public void removeItem(String itemName) {
        orderItems.remove(itemName);
    }

    public void displayOrder() {
        System.out.println("Itens do Pedido:");
        for (String item : orderItems) {
            System.out.println(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        orderManager.addItem("Hambúrguer");
        orderManager.addItem("Batatas Fritas");
        orderManager.addItem("Refrigerante");

        System.out.println("Pedido após adição de itens:");
        orderManager.displayOrder();

        orderManager.removeItem("Batatas Fritas");

        System.out.println("\nPedido após remoção de itens:");
        orderManager.displayOrder();
    }
}
```

# 6-Exercício: Gerenciamento de Tarefas usando LinkedList

Neste exercício, você enfrentará um problema em que precisa gerenciar uma lista de tarefas pendentes. Para resolver esse problema, você usará a estrutura de dados `LinkedList` em Java.

## Contexto

Você está desenvolvendo um programa de lista de tarefas que permite que os usuários adicionem, removam e visualizem tarefas pendentes. Para isso, você usará uma `LinkedList`, que é uma implementação da interface `List` em Java que oferece suporte a inserções e remoções eficientes em qualquer ponto da lista.

## Tarefas

1. Crie uma classe chamada `TaskManager`.

2. Implemente um método chamado `addTask` na classe `TaskManager` que aceita uma descrição de tarefa como entrada e a adiciona à lista de tarefas pendentes.

3. Implemente um método chamado `removeTask` na classe `TaskManager` que aceita uma descrição de tarefa como entrada e a remove da lista de tarefas pendentes.

4. Implemente um método chamado `displayTasks` na classe `TaskManager` que exibe a lista de tarefas pendentes.

5. Use uma `LinkedList` para armazenar as tarefas pendentes e realizar as operações de adição e remoção de tarefas.

## Exemplo de Uso

```java
import java.util.LinkedList;
import java.util.List;

public class TaskManager {
    private List<String> taskList = new LinkedList<>();

    public void addTask(String taskDescription) {
        taskList.add(taskDescription);
    }

    public void removeTask(String taskDescription) {
        taskList.remove(taskDescription);
    }

    public void displayTasks() {
        System.out.println("Tarefas Pendentes:");
        for (String task : taskList) {
            System.out.println(task);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Estudar Java");
        taskManager.addTask("Fazer exercícios");
        taskManager.addTask("Comprar leite");

        System.out.println("Tarefas pendentes após adição:");
        taskManager.displayTasks();

        taskManager.removeTask("Fazer exercícios");

        System.out.println("\nTarefas pendentes após remoção:");
        taskManager.displayTasks();
    }
}

````

# 7- Exercício: Gerenciamento de Tarefas Prioritárias usando PriorityQueue

Neste exercício, você enfrentará um problema em que precisa gerenciar tarefas prioritárias. Para resolver esse problema, você usará a estrutura de dados `PriorityQueue` em Java.

## Contexto

Você está desenvolvendo um programa de lista de tarefas que permite que os usuários adicionem tarefas com prioridades diferentes e, em seguida, realizem as tarefas na ordem de prioridade. Para fazer isso, você usará uma `PriorityQueue`, que é uma implementação de uma fila de prioridades em Java.

## Tarefas

1. Crie uma classe chamada `TaskManager`.

2. Implemente um método chamado `addTask` na classe `TaskManager` que aceita a descrição de uma tarefa e sua prioridade como entrada e a adiciona à fila de tarefas prioritárias.

3. Implemente um método chamado `completeTask` na classe `TaskManager` que remove e retorna a tarefa de maior prioridade da fila. Lembre-se de que tarefas com prioridade mais alta devem ser executadas primeiro.

4. Implemente um método chamado `displayTasks` na classe `TaskManager` que exibe a lista de tarefas prioritárias.

5. Use uma `PriorityQueue` para armazenar as tarefas prioritárias e realizar as operações de adição e conclusão de tarefas com base em suas prioridades.

## Exemplo de Uso

```java
import java.util.PriorityQueue;
import java.util.Comparator;

public class TaskManager {
    private PriorityQueue<Task> taskQueue;

    public TaskManager() {
        taskQueue = new PriorityQueue<>(Comparator.comparing(Task::getPriority).reversed());
    }

    public void addTask(String taskDescription, int priority) {
        taskQueue.add(new Task(taskDescription, priority));
    }

    public Task completeTask() {
        return taskQueue.poll();
    }

    public void displayTasks() {
        System.out.println("Tarefas Prioritárias:");
        for (Task task : taskQueue) {
            System.out.println("Prioridade: " + task.getPriority() + " - " + task.getDescription());
        }
    }
}

public class Task {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Estudar Java", 2);
        taskManager.addTask("Fazer exercícios", 1);
        taskManager.addTask("Comprar leite", 3);

        System.out.println("Tarefas priorizadas:");
        taskManager.displayTasks();

        Task completedTask = taskManager.completeTask();
        System.out.println("\nTarefa concluída: " + completedTask.getDescription());

        System.out.println("\nTarefas restantes:");
        taskManager.displayTasks();
    }
}
````

# 8- Exercício: Gerenciamento de Contatos usando TreeMap

Neste exercício, você enfrentará um problema em que precisa gerenciar uma lista de contatos com base em seus nomes. Para resolver esse problema, você usará a estrutura de dados `TreeMap` em Java.

## Contexto

Você está desenvolvendo um aplicativo de agenda de contatos e precisa armazenar informações de contato, como nome e número de telefone. É essencial que os contatos sejam organizados em ordem alfabética pelo nome. Para fazer isso, você usará um `TreeMap`, que é uma implementação de mapa em Java que mantém os elementos classificados por chave.

## Tarefas

1. Crie uma classe chamada `ContactManager`.

2. Implemente um método chamado `addContact` na classe `ContactManager` que aceita o nome e o número de telefone de um contato como entrada e o adiciona ao mapa de contatos.

3. Implemente um método chamado `removeContact` na classe `ContactManager` que aceita o nome de um contato como entrada e o remove do mapa de contatos.

4. Implemente um método chamado `displayContacts` na classe `ContactManager` que exibe a lista de contatos em ordem alfabética pelo nome.

5. Use um `TreeMap` para armazenar os contatos e realizar as operações de adição e remoção de contatos com base em seus nomes.

## Exemplo de Uso

```java
import java.util.TreeMap;

public class ContactManager {
    private TreeMap<String, String> contactMap = new TreeMap<>();

    public void addContact(String name, String phoneNumber) {
        contactMap.put(name, phoneNumber);
    }

    public void removeContact(String name) {
        contactMap.remove(name);
    }

    public void displayContacts() {
        System.out.println("Contatos em ordem alfabética:");
        for (String name : contactMap.keySet()) {
            System.out.println(name + ": " + contactMap.get(name));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        contactManager.addContact("Alice", "123-456-7890");
        contactManager.addContact("Bob", "987-654-3210");
        contactManager.addContact("Eve", "555-123-4567");

        System.out.println("Contatos após adição:");
        contactManager.displayContacts();

        contactManager.removeContact("Bob");

        System.out.println("\nContatos após remoção:");
        contactManager.displayContacts();
    }
}
`````

# AGORA SIM É A SUA VEZ

## Exercício 1: Gerenciamento de Alunos usando LinkedHashSet

### Contexto

Você é um professor e deseja manter uma lista de alunos matriculados em sua classe. No entanto, você não quer permitir que alunos com nomes duplicados se inscrevam. Use um `LinkedHashSet` para armazenar os nomes dos alunos de forma única.

### Tarefas

1.  Crie uma classe chamada `StudentManager`.
2.  Implemente um método `enrollStudent` na classe `StudentManager` que aceita o nome de um aluno como entrada e o adiciona ao conjunto de alunos matriculados.
3.  Garanta que não seja possível matricular um aluno com o mesmo nome novamente.
4.  Implemente um método `displayEnrolledStudents` que exiba a lista de alunos matriculados em ordem de matrícula.

## Exercício 2: Ordenação de Números usando TreeSet

### Contexto

Você possui uma lista de números inteiros e deseja classificá-los em ordem crescente. Use um `TreeSet` para realizar essa tarefa.

### Tarefas

1.  Crie uma classe chamada `NumberSorter`.
2.  Implemente um método `sortNumbers` na classe `NumberSorter` que aceita uma lista de números inteiros como entrada e retorna um `TreeSet` contendo esses números em ordem crescente.
3.  Certifique-se de que não haja números duplicados no conjunto resultante.

## Exercício 3: Lista de Tarefas usando ArrayList

### Contexto

Você está desenvolvendo um aplicativo de lista de tarefas e precisa permitir que os usuários adicionem, removam e exibam tarefas. Use um `ArrayList` para implementar a lista de tarefas.

### Tarefas

1.  Crie uma classe chamada `TaskList`.
2.  Implemente um método `addTask` na classe `TaskList` que aceita o nome de uma tarefa como entrada e a adiciona à lista de tarefas.
3.  Implemente um método `removeTask` na classe `TaskList` que aceita o nome de uma tarefa como entrada e a remove da lista de tarefas.
4.  Implemente um método `displayTasks` na classe `TaskList` que exibe a lista de tarefas.

## Exercício 4: Gerenciamento de Tarefas usando LinkedList

### Contexto

Você está desenvolvendo um aplicativo de gerenciamento de tarefas e deseja permitir que os usuários adicionem, removam e visualizem tarefas. Use uma `LinkedList` para implementar a lista de tarefas.

### Tarefas

1.  Crie uma classe chamada `TaskManager`.
2.  Implemente um método `addTask` na classe `TaskManager` que aceita a descrição de uma tarefa como entrada e a adiciona à lista de tarefas.
3.  Implemente um método `removeTask` na classe `TaskManager` que aceita a descrição de uma tarefa como entrada e a remove da lista de tarefas.
4.  Implemente um método `displayTasks` na classe `TaskManager` que exibe a lista de tarefas.

## Exercício 5: Gerenciamento de Tarefas Prioritárias usando PriorityQueue

### Contexto

Você está desenvolvendo um aplicativo de gerenciamento de tarefas e deseja permitir que os usuários adicionem tarefas com diferentes prioridades. Use uma `PriorityQueue` para implementar a lista de tarefas priorizadas.

### Tarefas

1.  Crie uma classe chamada `PriorityTaskManager`.
2.  Implemente um método `addTask` na classe `PriorityTaskManager` que aceita a descrição e a prioridade de uma tarefa como entrada e a adiciona à fila de tarefas priorizadas.
3.  Implemente um método `completeTask` na classe `PriorityTaskManager` que remove e retorna a tarefa de maior prioridade da fila.
4.  Implemente um método `displayTasks` na classe `PriorityTaskManager` que exibe a lista de tarefas priorizadas.

## Exercício 6: Dicionário de Palavras usando HashMap

### Contexto

Você está desenvolvendo um aplicativo de dicionário de palavras e deseja armazenar pares de palavras e seus significados. Use um `HashMap` para implementar o dicionário.

### Tarefas

1.  Crie uma classe chamada `Dictionary`.
2.  Implemente um método `addWord` na classe `Dictionary` que aceita uma palavra e seu significado como entrada e a adiciona ao dicionário.
3.  Implemente um método `lookupWord` na classe `Dictionary` que aceita uma palavra como entrada e retorna seu significado, se estiver no dicionário.
4.  Implemente um método `displayDictionary` na classe `Dictionary` que exibe todas as palavras e seus significados no dicionário.

## Exercício 7: Agenda de Contatos usando TreeMap

### Contexto

Você está desenvolvendo um aplicativo de agenda de contatos e deseja armazenar informações de contato, como nome e número de telefone. Use um `TreeMap` para manter os contatos organizados em ordem alfabética pelo nome.

### Tarefas

1.  Crie uma classe chamada `ContactManager`.
2.  Implemente um método `addContact` na classe `ContactManager` que aceita o nome e o número de telefone de um contato como entrada e o adiciona ao mapa de contatos.
3.  Implemente um método `removeContact` na classe `ContactManager` que aceita o nome de um contato como entrada e o remove do mapa de contatos.
4.  Implemente um método `displayContacts` na classe `ContactManager` que exibe a lista de contatos em ordem alfabética pelo nome.

Cada exercício aborda uma estrutura de dados específica e um contexto diferente. Veja a aplicação das estruturas em cada tipo de aplicação. 
