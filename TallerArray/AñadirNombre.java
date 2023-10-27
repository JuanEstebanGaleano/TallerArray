//Añade el nombre "Pedro" en la segunda posición del ArrayList "nombres".

import java.util.ArrayList;

public class AñadirNombre{
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Luisa");
        nombres.add("María");

        nombres.add(1, "Pedro");

        System.out.println("ArrayList después de agregar a Pedro en la segunda posición: " + nombres);
    }
}
