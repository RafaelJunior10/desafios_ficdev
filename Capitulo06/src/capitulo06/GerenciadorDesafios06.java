/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ficdev
 */
class GerenciadorDesafios06 {
    private List<Desafio06> desafios;

    public GerenciadorDesafios06() {
        this.desafios = new ArrayList<>();
    }

    public void adicionarDesafio(Scanner scanner) {
        System.out.print("Digite a descrição do desafio: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a prioridade do desafio (1 - baixa, 2 - média, 3 - alta): ");
        int prioridade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        Desafio06 desafio = new Desafio06(descricao, prioridade);
        desafios.add(desafio);

        System.out.println("Desafio adicionado com sucesso!");
    }

    public void exibirDesafios() {
        if (desafios.isEmpty()) {
            System.out.println("Não há desafios cadastrados.");
            return;
        }

        System.out.println("Desafios cadastrados:");
        for (Desafio06 desafio : desafios) {
            System.out.println(desafio);
        }
    }

    public void marcarDesafioConcluido(Scanner scanner) {
        if (desafios.isEmpty()) {
            System.out.println("Não há desafios cadastrados.");
            return;
        }

        System.out.print("Digite o número do desafio que deseja marcar como concluído: ");
        int numeroDesafio = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        if (numeroDesafio < 1 || numeroDesafio > desafios.size()) {
            System.out.println("Número de desafio inválido.");
            return;
        }

        Desafio06 desafio = desafios.get(numeroDesafio - 1);
        desafio.marcarConcluida();
        System.out.println("Desafio marcado como concluído.");
    }
}