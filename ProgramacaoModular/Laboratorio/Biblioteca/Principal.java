package ProgramacaoModular.Laboratorio.Biblioteca;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    private static Bibliopolis bibliopolis = new Bibliopolis(new Endereco("Rua Central", 123, "", "Livropolis", "LV", "12345-678"));
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    adicionarUsuario();
                    break;
                case 4:
                    listarUsuarios();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n--- Menu Bibliopolis ---");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Adicionar Usuário");
        System.out.println("4. Listar Usuários");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.nextLine();

        System.out.println("Digite a categoria do livro (por enquanto, apenas o nome):");
        String nomeCategoria = scanner.nextLine();
        Categoria categoria = new Categoria(nomeCategoria, "");  // Descrição vazia para simplificação

        Livro livro = new Livro(titulo, autor, isbn, categoria);
        bibliopolis.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listarLivros() {
        System.out.println("\n--- Livros em Bibliopolis ---");
        for (Livro livro : bibliopolis.getLivros()) {
            System.out.println(livro);
        }
    }

    private static void adicionarUsuario() {
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço (somente a rua para simplificar):");
        String rua = scanner.nextLine();
        Endereco endereco = new Endereco(rua, 0, "", "", "", "");  // Valores simplificados

        Usuario usuario = new Usuario(nome, endereco);
        bibliopolis.adicionarUsuario(usuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    private static void listarUsuarios() {
        System.out.println("\n--- Usuários de Bibliopolis ---");
        for (Usuario usuario : bibliopolis.getUsuarios()) {
            System.out.println(usuario);
        }
    }
}
