/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio05;

/**
 *
 * @author ficdev
 */
public class ExemploPassagemParametros {

    public static void main(String[] args) {
        int numero = 10;
        alterarNumero(numero);
        System.out.println(numero); // Saída: 10
    }

    public static void alterarNumero(int num) {
        num = 20;
        
    }
}
