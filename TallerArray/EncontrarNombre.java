//Verifica si el nombre "Carlos" está presente en el ArrayList "nombres".
import java.util.ArrayList;

public class EncontrarNombre {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luisa");
        nombres.add("María");

        String nombreBuscado = "Carlos";
        if (nombres.contains(nombreBuscado)) {
            System.out.println("El nombre " + nombreBuscado + " está presente en la lista de nombres.");
        } else {
            System.out.println("El nombre " + nombreBuscado + " no está presente en la lista de nombres.");
        }
    }
}





