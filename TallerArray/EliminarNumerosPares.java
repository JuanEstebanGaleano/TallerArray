
//Dado un ArrayList de números enteros, eliminar todos los números que sean pares.
import java.util.ArrayList;

public class EliminarNumerosPares {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(8);
        numeros.add(21);
        numeros.add(3);

        ArrayList<Integer> copiaNumeros = new ArrayList<>(numeros);

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                copiaNumeros.remove(Integer.valueOf(numero));
            }
        }

        numeros.clear();
        numeros.addAll(copiaNumeros);

        // Imprimir el ArrayList después de eliminar los números pares
        System.out.println("ArrayList después de eliminar números pares: " + numeros);
    }
}