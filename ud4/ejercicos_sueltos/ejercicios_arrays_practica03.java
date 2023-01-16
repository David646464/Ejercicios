package ud4.ejercicos_sueltos;
import java.util.Scanner;

public class ejercicios_arrays_practica03 {
    public static void main(String[] args) {
        /*Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo. 
        Mostar los alumnos con notas superiores a la media.*/

        double suma =0;


        System.out.println("Dime el número de alumnos totales");
        Scanner num = new Scanner(System.in);
        int Num_Alumnos = num.nextInt();
        String[] lista_alumnos = new String[Num_Alumnos];
        double[] lista_notas = new double[Num_Alumnos];

        for (int i =0;i<lista_alumnos.length;i++){
            System.out.println("Nombre alumno");

            Scanner al = new Scanner(System.in);
            String alumno = al.nextLine();

            System.out.println("Nota alumno");
            Scanner sc = new Scanner(System.in);
            double nota = sc.nextDouble();

            lista_alumnos[i] =alumno;
            lista_notas[i]=nota;
            
        }
        for (int a =0;a<lista_alumnos.length;a++){
            suma =suma + lista_notas[a];
        }

        double media = suma/lista_alumnos.length;
        System.out.println("La media del grupo es: "+ media);
        System.out.println("Los alumnos que sobrepasas la media son:");
        for (int s =0;s<lista_alumnos.length;s++){
            if (lista_notas[s]>media){
                System.out.println(lista_alumnos[s]+"--->"+lista_notas[s]);
            }
        }

       
    }
}
