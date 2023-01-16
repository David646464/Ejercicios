package ud4.ejercicos_sueltos;
import java.util.Scanner;

public class ejercicios_arrays_practica01 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Scanner sc1 = new Scanner(System.in); 

        double numero =0;
        int numero_de_numeros =0;
        double suma =0;
       


        System.out.println("Cuantos valores quieres introducir?Dimelo escrito en numeros");
        numero_de_numeros =  sc1.nextInt();

        double[] tabla = new double[numero_de_numeros];
        
        System.out.println("Dime los numeros 1 por uno y escribe (-1) para terminar de introducir numeros");

        for(int i=0;i<tabla.length;i++){
            System.out.println("Dime un número");
            numero =  sc.nextDouble();
            tabla[i] = numero;
            
        }
        for (int a =0;a<tabla.length;a++){
                suma =suma + tabla[a];
        }
        double media= suma / tabla.length;

        System.out.println("la media es: "+media);
    }
    
}
