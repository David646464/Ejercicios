package ud4.ejercicos_sueltos;

import java.util.Arrays;

public class ejercicios_arrays_practica04 {
    public static void main(String[] args) {
        int[] pares = new int[20];
        int i=0;
        for (int a=0;a <pares.length;a++){
           pares[a]=i;
           i+=2;
        }

        System.out.println("Los 20 primeros números pares son:"+Arrays.toString(pares));
    }
}