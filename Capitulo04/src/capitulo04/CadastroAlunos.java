/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo04;

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class CadastroAlunos {

    public static void main(String[] args) {
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade de alunos a serem cadastrados:"));
        Aluno[] alunos = new Aluno[capacidade];
        int quantidadeAlunos = 0;

        boolean continuarCadastro = true;

        while (continuarCadastro) {
            String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno:"));
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno:"));

            Aluno aluno = new Aluno(nome, idade, nota);
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?", "Continuar Cadastro", JOptionPane.YES_NO_OPTION);
            continuarCadastro = (opcao == JOptionPane.YES_OPTION);
        }

        String listaAlunos = "Lista de Alunos:\n";
        double somaNotas = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = alunos[i];
            listaAlunos += "Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade() + ", Nota: " + aluno.getNota() + "\n";
            somaNotas += aluno.getNota();
        }

        double mediaNotas = somaNotas / quantidadeAlunos;

        listaAlunos += "Média das Notas: " + mediaNotas;

        JOptionPane.showMessageDialog(null, listaAlunos);
    }
}

class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }
}
