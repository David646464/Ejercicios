package ClaseEdu;
import java.util.Scanner;

public class gg {
    public static void main(String[] args) {
        System.out.println("Introduce el valor de A");
        Scanner ValorA_Scanner = new Scanner(System.in); 
        int Valor_A =  ValorA_Scanner.nextInt();
        System.out.println("Introduce el valor de B");
        Scanner ValorB_Scanner = new Scanner(System.in); 
        int Valor_B =  ValorB_Scanner.nextInt();
        System.out.println("Introduce el valor de C");
        Scanner ValorC_Scanner = new Scanner(System.in); 
        int Valor_C =  ValorC_Scanner.nextInt();

        double calculo_dentro_raiz = (((int) Math.pow(Valor_B, 2))-(4*Valor_A*Valor_C));

        if (calculo_dentro_raiz < 0){
            System.out.println("No tiene solución");
        }else{
            double solucion_cuando_menos =((-Valor_B)-((int) Math.pow(calculo_dentro_raiz, (1/2))))/(2*Valor_A);
            double solucion_cuando_mas =((-Valor_B)+((int) Math.pow(calculo_dentro_raiz, (1/2))))/(2*Valor_A);
            
            System.out.println("Las soluciones son:");
            System.out.println(solucion_cuando_mas+" y "+solucion_cuando_menos);
        }
    }
    
}
