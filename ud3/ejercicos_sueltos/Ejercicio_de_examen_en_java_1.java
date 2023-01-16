package ud3.ejercicos_sueltos;
class Ejercicio_de_examen_en_java_1 {
    
    public static void main (String[] args) {
        
        final int NUM_LANZAMIENTOS = 1000;

        int caras1, caras2, caras3, caras4, caras5, caras6;

        caras1 = caras2 = caras3 = caras4 = caras5 = caras6 = 0;

        for (int i = 1; i <= NUM_LANZAMIENTOS; i++) {
            int valorDado = (int) (Math.random() * 6) + 1;
            switch (valorDado) {
                case 1:
                    caras1++;
                    break;
                case 2:
                    caras2++;
                    break;
                case 3:
                    caras3++;
                    break;
                case 4:
                    caras4++;
                    break;
                case 5:
                    caras5++;
                    break;
                case 6:
                    caras6++;
                    break;
            }
        }

        System.out.println("Lanzando un dado " + NUM_LANZAMIENTOS + "veces");
        System.out.println("\nRESULTADOS:");
        System.out.println("Números 1: " + caras1 + " veces (" + caras1 * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Números 2: " + caras2 + " veces (" + caras2 * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Números 3: " + caras3 + " veces (" + caras3 * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Números 4: " + caras4 + " veces (" + caras4 * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Números 5: " + caras5 + " veces (" + caras5 * 100.0 / NUM_LANZAMIENTOS + "%)");
        System.out.println("Números 6: " + caras6 + " veces (" + caras6 * 100.0 / NUM_LANZAMIENTOS + "%)");
    
        
    }
}
    

