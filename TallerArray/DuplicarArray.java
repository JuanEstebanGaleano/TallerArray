//Duplica todos los elementos de un ArrayList de números enteros.

import java.util.ArrayList;

public class DuplicarArray {
    public static void main(String[] args) {
         ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(20);
        
        for (int i = 0; i < numeros.size(); i++) {
            int elemento = numeros.get(i);
            numeros.set(i, elemento * 2);
        }
                System.out.println("ArrayList con elementos duplicados: " + numeros);
    }
}
