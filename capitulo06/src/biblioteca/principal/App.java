/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.principal;

import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static BibliotecaService bibliotecaService = new BibliotecaService();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    realizarEmprestimo();
                    break;
                case 4:
                    realizarDevolucao();
                    break;
                case 5:
                    listarLivros();
                    break;
                case 6:
                    listarUsuarios();
                    break;
                case 7:
                    buscarLivro();
                    break;
                case 8:
                    buscarUsuario();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("== Sistema de Biblioteca ==");
        System.out.println("1. Cadastrar livro");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Realizar empréstimo");
        System.out.println("4. Realizar devolução");
        System.out.println("5. Listar livros");
        System.out.println("6. Listar usuários");
        System.out.println("7. Buscar livro por ID");
        System.out.println("8. Buscar usuário por ID");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarLivro() {
        System.out.println("\nCadastro de livro\n");
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        Livro livro = new Livro(titulo, autor);
        bibliotecaService.cadastrarLivro(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }

    private static void cadastrarUsuario() {
        System.out.println("\nCadastro de usuário\n");
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        Usuario usuario = new Usuario(nome, email, telefone);
        bibliotecaService.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    private static void realizarEmprestimo() {
        System.out.println("\nEmpréstimo de livro\n");
        System.out.print("ID do livro: ");
        int idLivro = scanner.nextInt();
        System.out.print("ID do usuário: ");
        int idUsuario = scanner.nextInt();
        try {
            bibliotecaService.realizarEmprestimo(idLivro, idUsuario);
            System.out.println("Empréstimo realizado com sucesso.");
        } catch (EmprestimoException e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
    }

    private
