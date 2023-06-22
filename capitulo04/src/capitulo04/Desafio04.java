

package capitulo04;
import java.util.Scanner;
/**
 *
 * @author ficdev
 */
public class Desafio04 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Comando de seleção (if-else)
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Comando de repetição (while)
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int soma = 0;
        int i = 1;

        while (i <= n) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números de 1 a " + n + " é: " + soma);
    }
} 

