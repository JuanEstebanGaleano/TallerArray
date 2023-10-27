//Cambia todos los elementos de un ArrayList de cadenas por el valor "Hola".

import java.util.ArrayList;

public class CambiarElementos {
    public static void main(String[] args) {
        ArrayList<String> listaDeCadenas = new ArrayList<String>();
        listaDeCadenas.add("Manzana");
        listaDeCadenas.add("Banana");
        listaDeCadenas.add("Cereza");
        listaDeCadenas.add("Durazno");

        String nuevoValor = "Hola";
        for (int i = 0; i < listaDeCadenas.size(); i++) {
            listaDeCadenas.set(i, nuevoValor);
        }
        System.out.println("ArrayList después de cambiar los elementos: " + listaDeCadenas);
    }
}
