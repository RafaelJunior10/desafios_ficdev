/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Desafio06 {
    private static List<Tarefa> listaTarefas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            exibirMenu();
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção"));

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    marcarTarefaConcluida();
                    break;
                case 3:
                    exibirTarefas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        String menu = "----- GERENCIADOR DE TAREFAS -----\n" +
                      "1. Adicionar tarefa\n" +
                      "2. Marcar tarefa como concluída\n" +
                      "3. Exibir tarefas\n" +
                      "4. Sair";
        JOptionPane.showMessageDialog(null, menu);
    }

    private static void adicionarTarefa() {
        String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
        String prioridade = JOptionPane.showInputDialog("Digite a prioridade da tarefa (alta, média, baixa):");

        Tarefa tarefa = new Tarefa(descricao, prioridade);
        listaTarefas.add(tarefa);

        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
    }

    private static void marcarTarefaConcluida() {
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da tarefa a ser marcada como concluída:"));

        if (indice >= 0 && indice < listaTarefas.size()) {
            Tarefa tarefa = listaTarefas.get(indice);
            tarefa.setConcluida(true);
            JOptionPane.showMessageDialog(null, "Tarefa marcada como concluída: " + tarefa.getDescricao());
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido. Tente novamente.");
        }
    }

    private static void exibirTarefas() {
        StringBuilder lista = new StringBuilder("----- LISTA DE TAREFAS -----\n");

        if (listaTarefas.isEmpty()) {
            lista.append("Nenhuma tarefa encontrada.");
        } else {
            for (int i = 0; i < listaTarefas.size(); i++) {
                Tarefa tarefa = listaTarefas.get(i);
                String status = tarefa.isConcluida() ? "[CONCLUÍDA]" : "[PENDENTE]";
                lista.append(i).append(". ").append(status).append(" ").append(tarefa.getDescricao())
                        .append(" - Prioridade: ").append(tarefa.getPrioridade()).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }
}

