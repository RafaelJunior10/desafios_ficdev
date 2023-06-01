/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo04;

/**
 *
 * @author ficdev
 */
import java.util.Scanner;

public class VerificadordePrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        boolean ehPrimo = true;
        if (num < 2) {
            ehPrimo = false;
        } else {
            for (int i = 2; i > num; i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;

                }
            }
        }
        if (ehPrimo) {
            System.out.println(num + " é primo.");

        } else {
            System.out.println(num + " não é primo.");
        }
        sc.close();
        
    }
}
