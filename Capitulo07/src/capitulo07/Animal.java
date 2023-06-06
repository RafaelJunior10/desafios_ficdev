/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo07;

/**
 *
 * @author ficdev
 */
public class Animal {
    private int altura;
    private int pata;
    
    public Animal(int pata, int altura) {
        this.pata = pata;
        this.altura = altura;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getPata() {
        return pata;
    }
    
    public void setPata(int pata) {
        this.pata = pata;
    }
}
