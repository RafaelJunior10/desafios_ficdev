import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> minhaFila = new LinkedList<Carro>();
        minhaFila.add(new Carro("Ford", "Mustang", 2020));
        minhaFila.add(new Carro("Chevrolet", "Camaro", 2021));
        minhaFila.add(new Carro("Dodge", "Charger", 2019));

        Carro carroRemovido = minhaFila.remove(); // Remove o primeiro elemento da fila

        // Imprime o carro removido
        System.out.println("Carro removido: " + carroRemovido);

        // Imprime os carros restantes na fila
        System.out.println("Carros restantes na fila:");
        for (Carro carro : minhaFila) {
            System.out.println(carro);
        }
    }
}