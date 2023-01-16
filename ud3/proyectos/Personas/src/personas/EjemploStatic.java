
package personas;
import java.util.Scanner;

public class EjemploStatic {
    public static void main(String[] args){
       Double DIVISION = (double) (1/2);
        final double PI = 3.14;
        double Erre = 0;
        

        System.out.println("Introduce el valor de *r*: ");
        Scanner sc = new Scanner(System.in);
        Erre = sc.nextDouble();

        Double Volumen = DIVISION * PI * Math.pow(Erre, 3);



        /*
         * 10cm
         * 4188,8
         */
        System.out.println("=====================================");
        System.out.println(DIVISION);
        System.out.println(PI);
        System.out.println(Erre+"cm");
        System.out.println(Math.pow(Erre, 3));
        System.out.println(Volumen);
        System.out.println("=====================================");

        
        
        
    }
    
    
}
