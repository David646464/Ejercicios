package ud3.ejercicos_sueltos;

public class Contornos_ejemplo_break {

 
    public static void main(String[] args) {
        int cuenta; // la variable de control instrucción se usa cuando termina el ciclo
            for (cuenta = 1; cuenta <= 10; cuenta++) // itera 10 veces
            {
                if (cuenta == 5)
                break; // termina el ciclo si cuenta es 5
                System.out.printf("%d ", cuenta);
                System.out.printf("Salio del ciclo en cuenta = %d\n", cuenta);
            }
        } // fin de la clase PruebaBreak
    }
