//Cambia el segundo nombre del ArrayList "nombres" por "Ana".

import java.util.ArrayList;

public class CambiarElNombre {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luisa");
        nombres.add("María");
        
        if (nombres.size() >= 2) {
            nombres.set(1, "Ana"); 
            System.out.println("ArrayList después del cambio: " + nombres);
        } else {
            System.out.println("El ArrayList no tiene al menos dos nombres.");
        }
    }
}