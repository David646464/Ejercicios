

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.parser.Entity;

public class wordle {

        static Palabra[] contactos = new Palabra[0];
    public static void main(String[] args) {
     
        imprimirMenu();
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        if (opcion == 1 ){
            jugar();

        }
        if (opcion== 2 ){
            anhadirPalabra();
        }
      
    }
    
    public static void imprimirMenu(){
        System.out.println("================");
        System.out.println("|     MENU     |");
        System.out.println("================");
        System.out.println("|    Jugar     |");
        System.out.println("|      1       |");
        System.out.println("|Añadir palabra|");
        System.out.println("|      2       |");
        System.out.println("================");
    }
    static void jugar(){
        

    }
    public static void anhadirPalabra(){
        
       
        
    }
    static void exportarAgenda(){
        // 1. Generar String JSON a partir del contenido de la agenda.
        Gson gson = new Gson();
        String json = gson.toJson(contactos);

        System.out.println(json);
        // 2. Escribe el string en un fichero de texto
        writeStringToFile(json, "agenda.json");
    }
    static void importarPalabras(){
        // 1. Leer el fichero de texto agenda.json a un String
        String json = readFileToString("palabras.json");

        // 2. Cargar el contenido del String/Json en el array de personas.
        Gson gson = new Gson();
        contactos = gson.fromJson(json, Palabra[].class);
    }
    public static void writeStringToFile(String str, String filePath) {
        try {
          // Creamos un objeto FileWriter que nos permitirá escribir en el fichero
          FileWriter writer = new FileWriter(filePath);
    
          // Escribimos el String en el fichero
          writer.write(str);
    
          // Cerramos el fichero
          writer.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);
        
            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);
        
            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }
        
            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            //e.printStackTrace();
        }
    
        // Devolvemos el contenido del fichero como un String
        return fileContent.toString();
    }

    
}
