
package cuentas;


public class CuentaCorriente {

    
    String dni;
    String titular;
    double saldo;
    
    static boolean trasferencia(CuentaCorriente cc, CuentaCorriente cd, int importe) {
        boolean Resultado = true;
        
        if (cc.saldo >= importe){
            cc.saldo -= importe;
            cd.saldo += importe; 
        }else
            Resultado = false;
 
        return Resultado;
    }
    
    boolean trasnferir(CuentaCorriente cd, double importe){
        boolean resultado = true;
        
        return resultado;
    }
    
    
    CuentaCorriente(String dni, String titular, int saldo){
        this.dni = dni;
        this.titular = titular;
        this.saldo = 0;
    }

    void mostrar(){
        System.out.print("Titular: " + titular);
        System.out.println("\tDNI: " + dni);
        System.out.println("saldo: " + saldo + "€");
        System.out.println("");
    }
    
    void ingresarDinero(double importe){
        saldo += importe;
    }
    
    boolean sacarDinero(double importe){
        boolean retiradaOk = false;
        
        if (saldo >= importe) {
            saldo -= importe;
            retiradaOk = true;
        } else {            
            retiradaOk = false;
        }
        
        return retiradaOk;
    }
    

    
}
