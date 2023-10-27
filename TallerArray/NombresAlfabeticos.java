//Dado un ArrayList de nombres, ordénalos alfabéticamente.

import java.util.ArrayList;
import java.util.Collections;

public class NombresAlfabeticos{
    public static void main(String[] args) {
      ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Luisa");
        nombres.add("María");

        Collections.sort(nombres);

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
