//Convierte un ArrayList de cadenas en un array de cadenas.

import java.util.ArrayList;

public class ArrayListCadena {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Uno");
        arrayList.add("Dos");
        arrayList.add("Tres");
        arrayList.add("Cuatro");

        String[] arrayDeCadenas = new String[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            arrayDeCadenas[i] = arrayList.get(i);
        }

        System.out.print("Array de cadenas: ");
        for (String cadena : arrayDeCadenas) {
            System.out.print(cadena + " ");
        }
    }
}

