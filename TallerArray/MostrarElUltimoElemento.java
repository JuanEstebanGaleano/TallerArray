//Muestra el último elemento de un ArrayList de cadenas.

import java.util.ArrayList;

public class MostrarElUltimoElemento{
    public static void main(String[] args) {
         ArrayList<String> listaDeCadenas = new ArrayList<String>();
        listaDeCadenas.add("Manzana");
        listaDeCadenas.add("Banana");
        listaDeCadenas.add("Cereza");
        listaDeCadenas.add("Durazno");

        int tamaño = listaDeCadenas.size();
        if (tamaño > 0) {
            String ultimoElemento = listaDeCadenas.get(tamaño - 1);
            System.out.println("El último elemento es: " + ultimoElemento);
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }
}
