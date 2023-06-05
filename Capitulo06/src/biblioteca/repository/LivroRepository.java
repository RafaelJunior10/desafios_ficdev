/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.repository;

/**
 *
 * @author ficdev
 */
class LivroRepository {
    private List<LivroRepository> livros;
    private int proximoId;

    public LivroRepository() {
        this.livros = new ArrayList<>();
        this.proximoId = 1;
    }

    public void cadastrar(LivroRepository livro) {
        livro.setId(proximoId++);
        livros.add(livro);
    }

    public List<LivroRepository> buscarTodos() {
        return livros;
    }

    public LivroRepository buscarPorId(int id) {
        for (LivroRepository livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }
}
