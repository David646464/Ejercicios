package ud4.ejercicos_sueltos;
public class ejercicios_arrays_practica05 {
    public static void main(String[] args) {
        int numeros[]={-1,2,3,4,5,0,0,0,-2,-5};
        int negativos =0;
        int positivos =0;
        int ceros =0;

        for(int i =0;i<numeros.length;i++){
            if (numeros[i]==0){
                ceros++;
            }
            if (numeros[i]<0){
                negativos++;
            }
            if (numeros[i]>0){
                positivos++;
            }
        }
        System.out.println("Hay "+ negativos+" negativos,"+positivos+" positivos,"+ceros+" ceros");
    }
}
