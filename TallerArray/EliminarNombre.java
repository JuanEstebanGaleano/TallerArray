//Elimina el primer nombre del ArrayList "nombres".

import java.util.ArrayList;

public class EliminarNombre {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luisa");
        nombres.add("María");
        
        if (nombres.size() >= 1) {
            nombres.remove(0); 
            System.out.println("ArrayList después de eliminar el primer nombre: " + nombres);
        } else {
            System.out.println("El ArrayList no tiene nombres para eliminar.");
        }
    }
}