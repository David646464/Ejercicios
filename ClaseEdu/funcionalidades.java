package ClaseEdu;
import java.time.LocalTime;

public class funcionalidades {
    public static void main(String[] args) {
        
    
    /*Math */

    /*random */
    int Numero = (int) (Math.random() * 6) + 1;

    /*pow */
    int NumeroElevadoA_2 = (int) Math.pow(Numero, 2);


    /*switch y break*/
    final int NUM_LANZAMIENTOS = 1000;

    int cara1, cara2, cara3, cara4, cara5, cara6;

    cara1 = cara2 = cara3 = cara4 = cara5 = cara6 = 0;

    for(int i = 1; i <= NUM_LANZAMIENTOS; i++) {
        int valorDado =(int) (Math.random() * 6)+1;
        switch (valorDado) {
            case 1:cara1++; break;
            case 2:cara2++; break;
            case 3:cara3++; break;
            case 4:cara4++; break;
            case 5:cara5++; break;
            case 6:cara6++; break; 
        }
        System.out.print(cara1);
        System.out.print(cara2);
        System.out.print(cara3);
        System.out.print(cara4);
        System.out.print(cara5);
        System.out.print(cara6);
    }

    
    /*Local.time */
    LocalTime horaActual;
    horaActual = LocalTime.now();
    int horasActual = horaActual.getHour();
    int minutosActual = horaActual.getMinute();
    System.out.println(horasActual+":"+minutosActual);
}
    
}
