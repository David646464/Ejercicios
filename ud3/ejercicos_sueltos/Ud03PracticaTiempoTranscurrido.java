package ud3.ejercicos_sueltos;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.math.MathContext;



public class Ud03PracticaTiempoTranscurrido {
    public static void main(String[] args) {
        LocalTime horaActual;
        LocalTime horaAnterior;
        final int MIN_SEGUNDOS = 5;
        final int MAX_SEGUNDOS = 30;
        int tiempo;
        int SC = 0 ;

        tiempo = (int)(Math.random() * (MAX_SEGUNDOS - MIN_SEGUNDOS + 1) + MIN_SEGUNDOS);
        
        System.out.print("Apreta enter cuando pase " + tiempo + " segundos");


        horaAnterior = LocalTime.now();
        int segundoInicial = horaAnterior.getSecond();
        int minutoInicial = horaAnterior.getMinute();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
       

        horaActual = LocalTime.now();
        int segundoFinal = horaActual.getSecond();
        int minutoFinal = horaActual.getMinute();
        int tiempoRestoMinutos = (minutoFinal-minutoInicial);
        int tiempoRestoSegundos = 0;

        if (tiempoRestoMinutos == 0){
            tiempoRestoSegundos = (segundoFinal-segundoInicial);
        }else {
            tiempoRestoSegundos = (((segundoFinal+60-segundoInicial)-segundoInicial)+ 60 * (tiempoRestoMinutos - 1));
        }
        


        System.out.println(segundoFinal);
        System.out.println(segundoInicial);
        System.out.println(tiempoRestoSegundos);
        System.out.println(tiempo);

        if (tiempoRestoSegundos > tiempo){
            System.out.println("Te pasaste del tiempo unos " + (tiempoRestoSegundos-tiempo) + " segundos");
            System.out.print("Tiempo final: "+ tiempoRestoSegundos+" segundos");

        }else if (tiempoRestoSegundos < tiempo){
            System.out.println("Te quedaste corto con el tiempo unos " + (tiempo - tiempoRestoSegundos) + " segundos");
            System.out.print("Tiempo final: "+tiempoRestoSegundos+" segundos");
        }else {
            System.out.println("Acertastes con el tiempo");
            System.out.print("Tiempo final: "+ tiempoRestoSegundos+" segundos");
            
        }
        
    }
    
}
