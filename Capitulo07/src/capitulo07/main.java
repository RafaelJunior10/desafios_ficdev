/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo07;

/**
 *
 * @author ficdev
 */
public class main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(4, 50, "Marrom");
        System.out.println("Cachorro 1 - Pata: " + cachorro1.getPata());
        System.out.println("Cachorro 1 - Altura: " + cachorro1.getAltura());
        System.out.println("Cachorro 1 - Cor do Pelo: " + cachorro1.getCorPelo());

        Cachorro cachorro2 = new Cachorro(3, 40);
        cachorro2.setCorPelo("Preto");
        System.out.println("Cachorro 2 - Pata: " + cachorro2.getPata());
        System.out.println("Cachorro 2 - Altura: " + cachorro2.getAltura());
        System.out.println("Cachorro 2 - Cor do Pelo: " + cachorro2.getCorPelo());
    }
}
