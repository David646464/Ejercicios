
package personas;
import java.util.Scanner;

public class Personas {

    
    public static void main(String[] args) {
        
        
        // Declarar una variable
        Persona persona1,persona2,persona3;
        
        // Crear objeto
        persona1 = new Persona();
        persona2 = new Persona();
        persona3 = new Persona();

        
        persona1.setNombre("Pepe");
        persona1.setApellidos("Garcia");
        persona1.setPeso(80);
        persona1.setEstatura(180);
        
        persona2.setNombre("Manuel");
        persona2.setApellidos("Pereira");
        persona2.setPeso(120);
        persona2.setEstatura(160);
        
        persona3.setNombre("Maria");
        persona3.setApellidos("Gonzalez");
        persona3.setPeso(60);
        persona3.setEstatura(150);
        
        System.out.println(persona1.getNombre()+" "+persona1.getApellidos());
        System.out.println(persona2.getNombre()+" "+persona2.getApellidos());
        System.out.println(persona3.getNombre()+" "+persona3.getApellidos());
        System.out.println("Que persona quieres.Del 1 al 3");
        
        Scanner sc = new Scanner(System.in);
        int eleccion = sc.nextInt();
        
        
        if (eleccion == 1){
             persona1.mostrar();
             System.out.println("Su imc es igual a " + persona1.imc());
        }else  if (eleccion == 2){
             persona2.mostrar();
             System.out.println("Su imc es igual a " + persona2.imc());
        }else {
             persona3.mostrar();
             System.out.println("Su imc es igual a " + persona3.imc());
        }
     
    }   
    
    
}
