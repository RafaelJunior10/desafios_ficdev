/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03;

/**
 *
 * @author ficdev
 */
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    
    //Métodos
    public void SetNome(String nome) {
        this.nome = nome;
    }
    
    public void SetIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
}
