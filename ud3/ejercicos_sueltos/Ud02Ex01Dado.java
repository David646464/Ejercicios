package ud3.ejercicos_sueltos;
public class Ud02Ex01Dado {
    public static void main (String[] args) {
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
        }

        System.out.println("Lanzando un Dado " + NUM_LANZAMIENTOS);
        System.out.println("\nRESULTADOS");
        System.out.println("Ha salido 1: " + cara1 + " veces (" + cara1  * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Ha salido 2: " + cara2 + " veces (" + cara2  * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Ha salido 3: " + cara3 + " veces (" + cara3  * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Ha salido 4: " + cara4 + " veces (" + cara4  * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Ha salido 5: " + cara5 + " veces (" + cara5  * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Ha salido 6: " + cara6 + " veces (" + cara6  * 100.0 / NUM_LANZAMIENTOS + "%)");
    }
}