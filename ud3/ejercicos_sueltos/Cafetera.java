package ud3.ejercicos_sueltos;
public class Cafetera {
    private int capacidad;
    private int cantidadActual;




    public Cafetera(int capacidad,int cantidadActual){
        this.capacidad = 1000;
        this.cantidadActual = 0;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera(){
        cantidadActual=capacidad;
    }
    public String servirTaza(int capacidadTaza){
        String solucion = "Cafe servido";
        if (cantidadActual < capacidadTaza) {
            
                cantidadActual = 0;
                solucion = "Cafe servido";
            }
        if (cantidadActual ==0)  {            
           System.out.println("No queda cafe");
           solucion = "NO servido";
        }
        if (cantidadActual > capacidadTaza) {
            cantidadActual = cantidadActual-capacidadTaza;
            solucion = "Cafe servido";

        }
        return solucion;

    }
   public void  vaciarCafetera(){
    cantidadActual=0;
   }
   public void agregarCafe(int cantidad){
    if (cantidadActual+cantidad>capacidad){
        cantidadActual=capacidad;

    }else
        cantidadActual= cantidadActual+cantidad;

   }
   public void mostrar(){
    System.out.println(cantidadActual);
    System.out.println(capacidad);
   }
}
    

    
