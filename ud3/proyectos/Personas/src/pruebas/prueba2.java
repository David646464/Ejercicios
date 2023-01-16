package pruebas;

public class prueba2 {
    public static Double Calculo_ecuacion_resta(int a, int b, int c,Double calculo) {
        

        if (Math.pow(b*b-(4*c*a),0.5) < 0){
            return null;

        }else

            calculo=  ((-b-(Math.pow(b*b-(4*c*a), 0.5)))/(2*a));
        
            return calculo;

    }
    public static Double Calculo_ecuacion_suma(int a, int b, int c,Double calculo) {

        if (Math.pow(b*b-(4*c*a),0.5) < 0){
            return null;

        }else

            calculo=  ((-b+(Math.pow(b*b-(4*c*a), 0.5)))/(2*a));
        
            return calculo;

    }
    
}
