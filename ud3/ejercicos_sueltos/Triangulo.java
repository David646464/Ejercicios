package ud3.ejercicos_sueltos;
import java.util.Scanner;
import java.net.SocketPermission;
import java.util.InputMismatchException;

public class Triangulo {
    public static void main (String[] args) {
        Boolean Salida = true;
        int pisos_final = 0;
        int asteriscos=0;
        
        System.out.println("Altura del triángulo (1-20)");
        try { 
        Scanner pisos = new Scanner(System.in);
        pisos_final = pisos.nextInt();
        if (pisos_final > 0 )
            if(pisos_final < 21)
                Salida = false;
        }catch(InputMismatchException ex) {
            System.out.println("  ");
        }

        
        while (Salida) {
            try { 
                
                Scanner sc = new Scanner(System.in);
                System.out.println("Por favor introduce un número entero entre 1 y 20: ");
                pisos_final = sc.nextInt();
                if (pisos_final > 0 )
                    if(pisos_final < 21)
                        Salida = false;
            } catch (InputMismatchException ex) {
                System.out.println("  ");
            }
        }


    int contador = 0;
    int contador_de_lineas = 1;
    for(int i = 1; i <= pisos_final; i++) {
        
        contador +=1;
        for(int o = 20 - contador; o >= 1; o--) {
            System.out.print(" ");
        }
        for(int a = 1; a <= contador_de_lineas; a++) {

            System.out.print("*");
            asteriscos ++;
        }
        contador_de_lineas +=2;
        for(int o = 20 - contador; o >= 1; o--) {
            System.out.print(" ");
        }
        System.out.println("");
    }
    System.out.println("Numero de asteriscos: "+asteriscos);
    } 
}
