package pruebas;

import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args){
        System.out.println("Introduce el valor de A");
        Scanner valor_a_entrada = new Scanner(System.in);
        int valor_a = valor_a_entrada.nextInt();

        System.out.println("Introduce el valor de B");
        Scanner valor_b_entrada = new Scanner(System.in);
        int valor_b = valor_b_entrada.nextInt();

        System.out.println("Introduce el valor de C");
        Scanner valor_c_entrada = new Scanner(System.in);
        int valor_c = valor_c_entrada.nextInt();

        Double valor_inicial= 0.0;


       
        System.out.println("Las soluciones son:");
        System.out.println(prueba2.Calculo_ecuacion_suma(valor_a,valor_b,valor_c,valor_inicial));
        System.out.println( prueba2.Calculo_ecuacion_resta(valor_a,valor_b,valor_c,valor_inicial));
    }

    

    
    
    
}
