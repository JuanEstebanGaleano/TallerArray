//Dado un ArrayList de números, muestra el tercer elemento de la lista.

import java.util.ArrayList;

public class MostrarElTercerNumero {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        if (numeros.size() >= 3) {
            int tercerElemento = numeros.get(2);
            System.out.println("El tercer elemento es: " + tercerElemento);
        } else {
            System.out.println("El ArrayList no tiene al menos 3 elementos.");
        }
    }
}