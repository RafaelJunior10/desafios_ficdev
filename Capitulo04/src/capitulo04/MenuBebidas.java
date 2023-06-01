/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo04;

/**
 *
 * @author ficdev
 */
import java.util.Scanner;

public class MenuBebidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Bebidas:");
        System.out.println("1. Café - R$ 2.50");
        System.out.println("2. Chá - R$ 1.80");
        System.out.println("3. Suco - R$ 3.00");
        System.out.println("4. Refrigerante - R$ 4.50");

        System.out.print("Escolha uma opção (1-4): ");
        int opcao = scanner.nextInt();

        double preco;

        switch (opcao) {
            case 1:
                preco = 2.50;
                break;
            case 2:
                preco = 1.80;
                break;
            case 3:
                preco = 3.00;
                break;
            case 4:
                preco = 4.50;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O preço da bebida escolhida é: R$ " + preco);

        scanner.close();
    }
}