/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *
 * @author ficdev
 */
class Usuario {
    private int id;
    private String nome;
    private String email;
    private int telefone;
    private int qtdLivrosEmprestados;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.qtdLivrosEmprestados = 0;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e setters

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

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
                + ", qtdLivrosEmprestados=" + qtdLivrosEmprestados + ", livrosEmprestados=" + livrosEmprestados + "]";
    }
}
