/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

/**
 *
 * @author ficdev
 */
import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<String, Integer>();
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Charlie", 35);

        for (String nome : idades.keySet()) {
            Integer idade = idades.get(nome);
            System.out.println(nome + " tem " + idade + " anos");
        }
    }
}
