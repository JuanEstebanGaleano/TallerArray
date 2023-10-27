//Escribe un programa que recorra un ArrayList de números y muestre cada número.
import java.util.ArrayList;

public class RecorrerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(8);
        numeros.add(21);
        numeros.add(3);

        System.out.println("Números en el ArrayList:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

