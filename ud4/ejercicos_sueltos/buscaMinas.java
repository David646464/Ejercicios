package ud4.ejercicos_sueltos;
import java.util.Scanner;
public class buscaMinas {
    public static void main(String[] args) {
        int filas =0;
        int columnas =0;
        int topeMinas =0;
        boolean vida =true;
        int minasrestantes =10;

        System.out.println("Dime el número de filas:");
        Scanner fi = new Scanner(System.in);
        filas = fi.nextInt();

        System.out.println("Dime el número de columnas:");
        Scanner col = new Scanner(System.in);
        columnas = col.nextInt();

        System.out.println("Dime la dificultad que quieres:");
        System.out.println("1 para facil");
        System.out.println("2 para normal");
        System.out.println("3 para dificil");
        Scanner dif = new Scanner(System.in);
        int dificultad = dif.nextInt();


       
        Boolean[][] tableroMinas = new Boolean[filas][columnas];
        String[][] tableroJuego = new String[filas][columnas];
       establecerTableroJuegovacio(tableroJuego, filas, columnas);
            
        topeMinas = establecerDificultad(dificultad,topeMinas,filas,columnas);
        
        establecerMinas(tableroMinas,filas,columnas,topeMinas,minasrestantes);

        
        //imprimirTableroMinas(tableroMinas,filas,columnas);//
        imprimirTableroJuego(tableroJuego,filas,columnas);
        
        minasrestantes=topeMinas;
        while(vida==true && minasrestantes!=0){
            System.out.println("Que acción quieres hacer?");
            System.out.println("1 Colocar banderin de mina");
            System.out.println("2 Desvelar cuadrado");
            Scanner ac = new Scanner(System.in);
            int accion = ac.nextInt();
            if (accion==1){
                System.out.println("Dime la posición de donde quieres colocar la bandera");
                System.out.println("Fila");
                Scanner def = new Scanner(System.in);
                int colocarBanderinFila = def.nextInt();
                System.out.println("Columna");
                Scanner dec = new Scanner(System.in);
                int colocarBanderinColumna = dec.nextInt();
                minasrestantes=ponerBanderin(tableroMinas,tableroJuego,colocarBanderinFila,colocarBanderinColumna,minasrestantes);
            }
            if (accion==2){
                System.out.println("Dime la posición de donde quieres desvelar");
                System.out.println("Fila");
                Scanner def = new Scanner(System.in);
                int desvelarCuadradoFila = def.nextInt();
                System.out.println("Columna");
                Scanner dec = new Scanner(System.in);
                int desvelarCuadradoColumna = dec.nextInt();
                if (desvelarCuadradoFV(tableroMinas,tableroJuego,desvelarCuadradoFila,desvelarCuadradoColumna,vida)==true){
                    desvelarCuadrado(tableroMinas,tableroJuego,desvelarCuadradoFila,desvelarCuadradoColumna,vida,filas,columnas);
                }else{
                    vida=desvelarCuadradoFV(tableroMinas,tableroJuego,desvelarCuadradoFila,desvelarCuadradoColumna,vida);
                }
            }
            imprimirTableroJuego(tableroJuego, filas, columnas);
        }
        if (vida==false){
            imprimirTableroMinas(tableroMinas, filas, columnas);
            System.out.println("Perdistes");
        }
        if (minasrestantes==0){
            System.out.println("Ganastes");
        }
        
    }

    

    
    public static void establecerMinas(Boolean[][] tableroMinas,int filas, int columnas,int topeMinas,int minasrestantes){
        int indicador =0;
        int numeroIndicadorAnterior=0;

        for (int i =0; i< filas;i++){
            for(int a =0; a<columnas;a++){
                int numeroIndicador = (int) (Math.random() * 2)+1;
                if (numeroIndicador==numeroIndicadorAnterior && numeroIndicador==2){
                    numeroIndicador=1;
                }
                if (numeroIndicador==1){
                    tableroMinas[i][a]=false;

                }
                if (numeroIndicador==2){

                    if (indicador < topeMinas+1)
                        indicador++;
                        tableroMinas[i][a]=true;
                    if (indicador==topeMinas+1)
                    tableroMinas[i][a]=false;

                }
                numeroIndicadorAnterior=numeroIndicador;

            }
        }
        System.out.println("Número de minas: "+ (indicador-1));
        minasrestantes = indicador;
    
       
    }
    public static void imprimirTableroMinas(Boolean[][] tableroMinas, int filas, int columnas){
        for (int i =0; i< filas;i++){
            for(int a =0; a<columnas;a++){
               
                System.out.print(tableroMinas[i][a]+" ");
                
                 
                 
            }
            System.out.println(" ");
        }
    }

    public static void establecerTableroJuegovacio(String[][] tableroJuego, int filas, int columnas) {

        for (int i =0; i< filas;i++){
            for(int a =0; a<columnas;a++){
               
                tableroJuego[i][a]="-";
                 
                 
            }
           
        }
        
    }
    public static void  imprimirTableroJuego(String[][] tableroJuego, int filas, int columnas) {
        for (int i =0; i< filas;i++){
            for(int a =0; a<columnas;a++){
               
                System.out.print(tableroJuego[i][a]+" ");
                
                 
                 
            }
            System.out.println(" ");
        }
    }
    public static int establecerDificultad(int dificultad,int topeMinas,int filas, int columnas) {
        /*15% facil
         * 30% normal
         * 45% dificil
         */
        int totalDeCuadros = filas * columnas;
        if (dificultad==1){
           topeMinas =totalDeCuadros  *15/ 100;
           System.out.println(totalDeCuadros/100);
          
         }
         if (dificultad==2){
            topeMinas =totalDeCuadros  *30/ 100;
            
         }
         if (dificultad==3){
            topeMinas =totalDeCuadros  *45/ 100;
            
         }
         System.out.println(topeMinas);
         return topeMinas;
    }
    public static int ponerBanderin(Boolean[][] tableroMinas, String[][] tableroJuego, int colocarBanderinFila, int colocarBanderinColumna, int minasrestantes){

        tableroJuego[colocarBanderinFila][colocarBanderinColumna]="M";
        if (tableroMinas[colocarBanderinFila][colocarBanderinColumna]==true){
            
            minasrestantes=restarMinas(minasrestantes);;
        }
        return minasrestantes;


    }
    public static int  restarMinas(int minasrestantes) {
        return minasrestantes-1;
        
    }
    private static boolean desvelarCuadradoFV(Boolean[][] tableroMinas, String[][] tableroJuego, int desvelarCuadradoFila,int desvelarCuadradoColumna, boolean vida) {
        
        if (tableroMinas[desvelarCuadradoFila][desvelarCuadradoColumna]==true){
            vida=false;

        }
        return vida;
    }
    private static void desvelarCuadrado(Boolean[][] tableroMinas, String[][] tableroJuego, int desvelarCuadradoFila,int desvelarCuadradoColumna, boolean vida, int filas,int columna) {
        int numero =0;
        if (tableroMinas[desvelarCuadradoFila][desvelarCuadradoColumna]==false){
            /*1 2 3
             *4 X 5 
             *6 7 8 
             */
            
            
            if (desvelarCuadradoFila != 0  ){
                if (desvelarCuadradoColumna != 0 ){
                    /*cuadrado 1 */
                   
                        if (tableroMinas[desvelarCuadradoFila-1][desvelarCuadradoColumna-1]==true){
                            numero++;
                            
                        }
                    
                    
            
                }
                /*cuadrado 2 */
                
                    if (tableroMinas[desvelarCuadradoFila-1][desvelarCuadradoColumna]==true){
                        numero++;
                    }
                
                
                if ( desvelarCuadradoColumna!=columna-1 ){    
                /*cuadrado 3 */
                
                    if (tableroMinas[desvelarCuadradoFila-1][desvelarCuadradoColumna+1]==true){
                        numero++;
                    }
                
                
                }
            }
            if (desvelarCuadradoColumna != 0 && desvelarCuadradoColumna!=filas ){   
                /*cuadrado 4 */
               
                    if (tableroMinas[desvelarCuadradoFila][desvelarCuadradoColumna-1]==true){
                        numero++;
                    }
                
                
            }
            if ( desvelarCuadradoColumna!=columna-1 ){   
                /*cuadrado 5 */
                
                    if (tableroMinas[desvelarCuadradoFila][desvelarCuadradoColumna+1]==true){
                        numero++;
                    }
                
                
            }
            if ( desvelarCuadradoFila!=filas-1 ){
                if (desvelarCuadradoColumna != 0  ){   
                    /*cuadrado 6 */
                   
                        if (tableroMinas[desvelarCuadradoFila+1][desvelarCuadradoColumna-1]==true){
                            numero++;
                        }
                    
                   
                }
                /*cuadrado 7 */
                
                    if (tableroMinas[desvelarCuadradoFila+1][desvelarCuadradoColumna]==true){
                        numero++;
                    }
                
                
                if ( desvelarCuadradoColumna!=columna-1 ){   
                    /*cuadrado 8 */
                   
                        if (tableroMinas[desvelarCuadradoFila+1][desvelarCuadradoColumna+1]==true){
                            numero++;
                        }
                    
                    
                }    
            }
            
        }
        
        String cantidadMinasCercanas="0";
        if (numero==0){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="0";
        }
        if (numero==1){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="1";
        }
        if (numero==2){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="2";
        }
        if (numero==3){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="3";
        }
        if (numero==4){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="4";
        }
        if (numero==5){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="5";
        }
        if (numero==6){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="6";
        }
        if (numero==7){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="7";
        }
        if (numero==8){
            tableroJuego[desvelarCuadradoFila][desvelarCuadradoColumna]="8";
        }


       
        
    }
    
}
