import java.util.ArrayList;
import java.util.List;

public class Capitulo06 {
    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<Integer>();
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);

        // Iterando sobre a lista e imprimindo os elementos
        for (Integer elemento : minhaLista) {
            System.out.println(elemento);
        }
    }
}

