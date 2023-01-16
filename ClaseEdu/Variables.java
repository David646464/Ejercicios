package ClaseEdu;
import java.math.BigDecimal;

public class Variables {
    public static void main(String[] args) {
        // Declaración de variables
        
        int varInt; 
        double varDouble;
        boolean varBoolean;
        char varChar;

        // Inicialización de variables
       
        varInt = 2147483647; 
        
        varDouble = 2.456456546;
        varBoolean = false;
        varChar = 'A';

        
        System.out.println("La variable varInt tiene el valor " + varInt);
        System.out.println("La variable varDouble tiene el valor " + varDouble);
        System.out.println("La variable varBoolean tiene el valor " + varBoolean);
        System.out.println("La variable varChar tiene el valor " + varChar);

        System.out.println("IMPRIMIENDO VARIABLES INCREMENTADAS EN 1 (++)");
       
        varInt++; 
        varDouble++;
        varChar++;
        System.out.println("La variable varInt tiene el valor " + varInt);
        System.out.println("La variable varDouble tiene el valor " + varDouble);
        System.out.println("La variable varBoolean tiene el valor " + varBoolean);
        System.out.println("La variable varChar tiene el valor " + varChar);
      
        /*System.out.println("La variable varInt++ " + varInt);
        System.out.println("La variable varDouble++ " + varDouble);
        System.out.println("La variable varBoolean no se puede incrementar.");
        System.out.println("La variable varChar++ " + varChar);        

        System.out.println("PROBLEMAS DE PRECISIÓN");
        double unCentimo = 0.01;
        double suma = unCentimo + unCentimo + unCentimo + unCentimo + unCentimo + unCentimo;
        System.out.println("Suma de 6 céntimos: " + suma);
        System.out.println("SOLUCIÓN CON LA CLASE BigDecimal");

        BigDecimal unCentimoPreciso, sumaPrecisa;
        unCentimoPreciso = BigDecimal.valueOf(0.01);
        sumaPrecisa = new BigDecimal(0);
        sumaPrecisa = sumaPrecisa.add(unCentimoPreciso).add(unCentimoPreciso).add(unCentimoPreciso);
        sumaPrecisa = sumaPrecisa.add(unCentimoPreciso).add(unCentimoPreciso).add(unCentimoPreciso);
        System.out.println(sumaPrecisa);*/



    }
    
}
