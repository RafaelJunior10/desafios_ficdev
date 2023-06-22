/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.meuPrograma;

import capitulo03.geometria.Retangulo;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
    
    //criando um objeto da classe retangulo com base 5 e altura 10
    Retangulo retangulo = new Retangulo(5, 10);
    //calculando a area e o perimtro do retangulo
    double area = retangulo.calcularArea();
    double perimetro = retangulo.calcularPerimetro();
    
    //imprimindo valores na tela
    
    System.out.println("area do retangulo é: " + area);
    System.out.println("o perimetro do retangulo é: " + perimetro);
    
    
    int x = 10, y = 5, z = 2;
    int resultado = ++x * y % z + (x > y ? x : y);
    System.out.println(resultado);
    
}
}
