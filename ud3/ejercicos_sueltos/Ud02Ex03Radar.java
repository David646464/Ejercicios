package ud3.ejercicos_sueltos;
import java.util.Scanner;


public class Ud02Ex03Radar {
    public static void main(String[] args) {  
        Scanner sc;

        System.out.println("Introduce la distancia en km: ");
        sc = new Scanner(System.in);
        double distancia = sc.nextDouble();

        System.out.println("Introduce el tiempo en s: ");
        sc = new Scanner(System.in);
        double tempo = sc.nextDouble();

        System.out.println("Introduce el limite: ");
        sc = new Scanner(System.in);
        double limite = sc.nextDouble();


        if (excesoVelocidade(distancia, tempo, limite) == 0){
            System.out.println("Velocidad dentro del limite");
        }else{
            System.out.println("Infracción por exceso de velocidad. La multa es de:"+multaInfraccion(limite, excesoVelocidade(distancia, tempo, limite))+" euros");
        }
             
    }

    public static double excesoVelocidade(double distancia, double tempo, double limite){
        if (distancia/(tempo/3600) < limite ) {
            return 0;
        } else{
        return (distancia/(tempo/3600)-limite);
        }
    }

    public static double multaInfraccion(double limite, double exceso){
        if (limite <=50) {
            if (exceso == 0 ) {
                return 0;
            }else if (exceso>0 && exceso<=20){
                return 100;
            }else if (exceso>20 && exceso<=30){
                return 300;
            }else if (exceso>30 && exceso<=40){
                return 400;
            }else if (exceso>40 && exceso<=50){
                return 500;
            }else{
                return 600;
            }
        } else{
            if (exceso == 0 ) {
                return 0;
            }else if (exceso>0 && exceso<=30){
                return 100;
            }else if (exceso>30 && exceso<=50){
                return 300;
            }else if (exceso>50 && exceso<=60){
                return 400;
            }else if (exceso>60 && exceso<=70){
                return 500;
            }else{
                return 600;
            }
        }
    
    }
}
