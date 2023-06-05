/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.repository;

/**
 *
 * @author ficdev
 */
class UsuarioRepository {
    private List<Usuario> usuarios;
    private int proximoId;

    public UsuarioRepository() {
        this.usuarios = new ArrayList<>();
        this.proximoId = 1;
    }

    public void cadastrar(Usuario usuario) {
        usuario.setId(proximoId++);
        usuarios.add(usuario);
    }

    public List<Usuario> buscarTodos() {
        return usuarios;
    }

    public Usuario buscarPorId(int
