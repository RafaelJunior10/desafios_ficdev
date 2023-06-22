/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

/**
 *
 * @author ficdev
 */
public class Tarefa {
     private String descricao;
    private String prioridade;
    private boolean concluida;

    public Tarefa(String descricao, String prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    // getters e setters

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
