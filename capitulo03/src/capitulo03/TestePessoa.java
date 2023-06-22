/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03;

/**
 *
 * @author ficdev
 */
public class TestePessoa {
    public static void main (String[]args) {
        
  Pessoa p1 = new Pessoa();
  
  p1.SetNome("jõao");
  p1.SetIdade(25);
  
  System.out.println("nome: " + p1.getNome());
  System.out.print("idade: " + p1.getIdade());
    
    
    }
    
}
