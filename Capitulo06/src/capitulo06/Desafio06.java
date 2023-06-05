/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

/**
 *
 * @author ficdev
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Desafio06 {
    private String descricao;
    private int prioridade;
    private boolean concluida;

    public Desafio06(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarConcluida() {
        concluida = true;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluído" : "Pendente";
        return "Descrição: " + descricao + ", Prioridade: " + prioridade + ", Status: " + status;
    }
}
