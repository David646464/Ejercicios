
package cuentas;


public class Ejemplo_cuentas {
    public static void main(String[] args){
        CuentaCorriente c1 = new CuentaCorriente("Pepe", "99999999Z", 100);
        CuentaCorriente c2 = new CuentaCorriente("Marta", "77777777Z", 50);
        
        
        c1.mostrar();
        c2.mostrar();
        
        if (CuentaCorriente.trasferencia(c1, c2, 75))
            System.out.println("Trasferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");
        
        if (c1.trasnferir(c2, 75))
            System.out.println("Trasferencia realizada!");
        else
            System.out.println("No hay suficiente saldo en la cuenta de origen");

           
        c1.mostrar();
        c2.mostrar();
        
       
    }
    
}
