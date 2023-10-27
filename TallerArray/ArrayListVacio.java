//Escribe un programa que verifique si un ArrayList está vacío o no.
import java.util.ArrayList;

public class ArrayListVacio {
    public static void main(String[] args) {
        ArrayList<String> miArrayList = new ArrayList<String>();

        // Verificar si el ArrayList está vacío
        if (miArrayList.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío. Contiene elementos.");
        }
    }
}