package ud4.ejercicos_sueltos;
import java.util.Scanner;

public class ejecicios_arrays_practica02 {
    public static void main(String[] args) {
        double[] tabla = new double[10];
        double suma=0;

        for (int i=0;i<10;i++){
            System.out.println("Dime un numero");
            Scanner sc = new Scanner(System.in);
            double numero = sc.nextDouble();
            tabla[i] =numero;

        }
        for (int a =0;a<tabla.length;a+=2){
            suma =suma + tabla[a];
        }
        double media= suma / 5;
        System.out.println("La media de los numeros pares de la tabla es: "+media);
        
    }
    
}
