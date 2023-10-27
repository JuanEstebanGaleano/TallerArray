//Muestra el primer elemento de un ArrayList de cadenas.

import java.util.ArrayList;

public class MostrarElPrimerElemento {
    public static void main(String[] args) {
         ArrayList<String> listaDeCadenas = new ArrayList<String>();
        listaDeCadenas.add("Manzana");
        listaDeCadenas.add("Banana");
        listaDeCadenas.add("Cereza");
        listaDeCadenas.add("Damasco");

        // Mostrar el primer elemento de la lista (índice 0)
        if (!listaDeCadenas.isEmpty()) {
            String primerElemento = listaDeCadenas.get(0);
            System.out.println("El primer elemento es: " + primerElemento);
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }
}
