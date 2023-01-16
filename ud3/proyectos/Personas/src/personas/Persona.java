
package personas;

public class Persona {
    private String nombre;
    private String apellidos;
    private double peso; // En kg
    private int estatura; // En cm
    private byte edad;
    private String dni;
    
    static String hoy ="lunes";
    
    public void setPeso(double Kg) {
        if (Kg < 0)
            peso = 0;
        else
            peso = Kg;
        
    }
    
    public double getPeso() {
        return peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        if (estatura < 0)
            this.estatura = 0;
        else
            this.estatura = estatura;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public double imc() {
        return peso/ Math.pow((estatura/100.0),2);
    }

    public static boolean dniValido(int numeroDni, char letraDni) {
        char letraCorrecta = ' ';
        
        switch (numeroDni % 23){
            case 0: letraCorrecta = 'T';break;
            case 1: letraCorrecta = 'R';break;
            case 2: letraCorrecta = 'W';break;
            case 3: letraCorrecta = 'A';break;
            case 4: letraCorrecta = 'G';break;
            case 5: letraCorrecta = 'M';break;
            case 6: letraCorrecta = 'Y';break;
            case 7: letraCorrecta = 'F';break;
            case 8: letraCorrecta = 'P';break;
            case 9: letraCorrecta = 'D';break;
            case 10: letraCorrecta = 'X';break;
            case 11: letraCorrecta = 'B';break;
            case 12: letraCorrecta = 'N';break;
            case 13: letraCorrecta = 'J';break;
            case 14: letraCorrecta = 'Z';break;
            case 15: letraCorrecta = 'S';break;
            case 16: letraCorrecta = 'Q';break;
            case 17: letraCorrecta = 'V';break;
            case 18: letraCorrecta = 'H';break;
            case 19: letraCorrecta = 'L';break;
            case 20: letraCorrecta = 'C';break;
            case 21: letraCorrecta = 'K';break;
            case 22: letraCorrecta = 'E';break;
            
        }
        if (letraCorrecta == letraDni) {
            return true;
        }
        
    return false;
    }
    
    public void mostrar(){
        System.out.println(nombre + " " + apellidos);
        System.out.println("Peso: " + peso + " kilos");
        System.out.println("Estatura: " + estatura + " cm");
    }
}
