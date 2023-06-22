/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;


import java.util.ArrayList;
import java.util.List;


public class Livro {

    private int id;
    private String nome;
    private String email;
    private int telefone;
    private int qtdLivrosEmprestados;
    private List<Livro> livrosEmprestados;

    public Livro(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.qtdLivrosEmprestados = 0;
        this.livrosEmprestados = new ArrayList<>();
    }
    

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getQtdLivrosEmprestados() {
        return qtdLivrosEmprestados;
    }

    public boolean getPossuiVaga() {
        return qtdLivrosEmprestados < 3;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        qtdLivrosEmprestados++;
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        qtdLivrosEmprestados--;
    }

    // Sobrescrevendo o método toString() para exibir informações do usuário

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
                + ", qtdLivrosEmprestados=" + qtdLivrosEmprestados + ", livrosEmprestados=" + livrosEmprestados + "]";
    }

    public boolean isDisponivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDisponivel(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
