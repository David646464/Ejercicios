package ud3.ejercicos_sueltos;
import java.time.LocalTime;

public class HoraFeliz {
    public static void main (String[] args) {
        LocalTime horaActual;
        int minutos = 0;
        int hora =0;
    for(int o = 1 ; o <= 30 ; o++) {

            hora =(int) (Math.random() * 24);
            minutos =(int) (Math.random() * 60);
            System.out.println("=========================================");
            System.out.println("hora: "+hora);
            System.out.println("minutos: "+minutos);
            System.out.println("=========================================");
        
       

        horaActual = LocalTime.now();
        int horasActual = horaActual.getHour();
        int minutosActual = horaActual.getMinute();
        System.out.println("La hora feliz empieza a las "+hora+":"+minutos+" y termina a las "+(1+hora) +":"+minutos);
        System.out.println("Tu hora es: "+horasActual+":"+minutosActual);
        if (minutosActual<minutos){
            if (horasActual<hora){
                System.out.println("Te faltan "+ (hora-horasActual)+" horas y "+(minutos-minutosActual));
               
            }else
            System.out.println("Te pasastes "+ (horasActual-hora)+" horas y "+(minutos-minutosActual));

        }else if (minutosActual>minutos){
            if (horasActual>hora){
                System.out.println("Te pasastes "+ (horasActual-hora)+" horas y "+(minutosActual-minutos));
               


            }else
            System.out.println("Te faltan "+ (hora-horasActual)+" horas y "+(minutosActual-minutos));
               

        }else{
        System.out.println("Estas en la hora feliz");
        }

    }
    }
    
}
