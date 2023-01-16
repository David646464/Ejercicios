package ClaseEdu;

import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args) {
        int Información;


        Scanner sc = new Scanner(System.in); 

        /*&& != >= <= ==  y el true o false EXPLICAR */
        Información =  sc.nextInt();
        if (Información == 0 || Información < 4){
            System.out.println("La entrada es menor que 0");
        }else if (Información >0){
            System.out.println("La entrada es mayor que 0");

        }else {
            System.out.println("La entrada es 0");
        }
        
    }
    
}
