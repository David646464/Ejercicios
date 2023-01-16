public class Palabra {
    private String palabra;
    private int NumVecesAparecida;
    private int  aciertos;
    private int NumVecesUtilizada;

    
    public Palabra(String palabra, int numVecesAparecida, int aciertos, int numVecesUtilizada) {
        this.palabra = palabra;
        NumVecesAparecida = numVecesAparecida;
        this.aciertos = aciertos;
        NumVecesUtilizada = numVecesUtilizada;
    }



    
    public Palabra() {
    }




    @Override
    public String toString() {
        return "Palabra [palabra=" + palabra + "]";
    }
    
    public  void  estadisticas(){
       System.out.println("[palabra=" + palabra + "]"+"[numVecesAparecida=" + NumVecesAparecida + "]"+"[aciertos=" + aciertos + "]"+"[NumVecesUtilizada=" + NumVecesUtilizada + "]");

    }


    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public int getNumVecesAparecida() {
        return NumVecesAparecida;
    }
    public void setNumVecesAparecida(int numVecesAparecida) {
        NumVecesAparecida = numVecesAparecida;
    }
    public int getAciertos() {
        return aciertos;
    }
    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }
    public int getNumVecesUtilizada() {
        return NumVecesUtilizada;
    }
    public void setNumVecesUtilizada(int numVecesUtilizada) {
        NumVecesUtilizada = numVecesUtilizada;
    }




    public void add(String string) {
    }
   
    
}

