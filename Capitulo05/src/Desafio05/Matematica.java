/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio05;

/**
 *
 * @author ficdev
 */
public class Matematica {
    public static int somar(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int resultado = Matematica.somar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
