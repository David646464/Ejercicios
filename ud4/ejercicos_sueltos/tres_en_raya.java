package ud4.ejercicos_sueltos;
import java.util.Scanner;



public class tres_en_raya {
    public static void main(String[] args) {
        String[][] tabla = new String[3][3];
        boolean indice = true;
        int marca =0;

        for(int i =0;i < 3;i++){
                    for (int a =0; a<3;a++){
                        tabla[i][a]=" ";
                    }
                }

        imprimirMenu();
        
        /*entrada del while */
       while(indice){

        /*Enunciado */
        imprimirTabla(tabla);
        System.out.println("Introduce el tipo de marca que quieres poner:");
        System.out.println("1 para poner 'X' y poner 2 para 'O'");
        Scanner sc = new Scanner(System.in);
         marca = sc.nextInt();
        System.out.println("Introduce el tipo de marca que quieres poner:");
        System.out.println("introduce el numero segun la posición que deseas.Las posiciones son las siguientes:");
        imprimirPosiciones();
        Scanner pc = new Scanner(System.in);
        int posicion = pc.nextInt();

        modificarTabla(posicion,tabla,marca);
        /*Analizar la tabla */
        for (int c =0;c< 3;c++){
            if (tabla[c][0]==tabla[c][1] && tabla[c][0]==tabla[c][2] && tabla[c][2]!=" "){
                indice = false;
            }

             if (tabla[0][c]==tabla[1][c] && tabla[0][c]==tabla[2][c] && " "!=tabla[2][c]){
                indice = false;
            }
            if (tabla[0][0]==tabla[1][1] && tabla[0][0]==tabla[2][2] && " "!=tabla[2][2]){
                indice =false;
                    }
            if (tabla[2][0]==tabla[1][1] && tabla[2][0]==tabla[0][2] && " "!=tabla[0][2]){
                indice =false;
            }
            if (tabla[0][0]!=" " && tabla[0][1]!=" " && tabla[0][2]!=" " && tabla[1][0]!=" " && tabla[1][1]!=" " && tabla[1][2]!=" " && tabla[2][0]!=" " && tabla[2][1]!=" " && tabla[2][2]!=" " ){
                indice =false;
            }

        }
        
        
       }
       /*Salida del while */

       /*Declaración del ganador o empate */
       
       
       for (int c =0;c< 3;c++){
        /*ganador X */
        if (tabla[c][0]==tabla[c][1] && tabla[c][0]==tabla[c][2] && tabla[c][2]=="X"){
            System.out.println("Gana X");
            break;
        } else if (tabla[0][c]==tabla[1][c] && tabla[0][c]==tabla[2][c] && "X"==tabla[2][c]){
            System.out.println("Gana X");
            break;
        }else if (tabla[0][0]==tabla[1][1] && tabla[0][0]==tabla[2][2] && "X"==tabla[2][2]){
            System.out.println("Gana X");
            break;
        }else if (tabla[2][0]==tabla[1][1] && tabla[2][0]==tabla[0][2] && "X"==tabla[0][2]){
            System.out.println("Gana X");
            break;
        /*ganador X */
        }else if (tabla[c][0]==tabla[c][1] && tabla[c][0]==tabla[c][2] && tabla[c][2]=="O"){
            System.out.println("Gana O");
            break;
        }else if (tabla[0][c]==tabla[1][c] && tabla[0][c]==tabla[2][c] && "O"==tabla[2][c]){
            System.out.println("Gana O");
            break;
        }else if (tabla[0][0]==tabla[1][1] && tabla[0][0]==tabla[2][2] && "O"==tabla[2][2]){
            System.out.println("Gana O");
            break;
        }else if (tabla[2][0]==tabla[1][1] && tabla[2][0]==tabla[0][2] && "O"==tabla[0][2]){
            System.out.println("Gana O");
            break;
            /*Empate */
        }else
            System.out.println("Empate");
            break;
        
    }


    imprimirTabla(tabla);
}
   

    public static void imprimirTabla(String t [][]){
        System.out.println("=======");
        System.out.println("|"+t[0][0]+"|"+t[0][1]+"|"+t[0][2]+"|");
        System.out.println("=======");
        System.out.println("|"+t[1][0]+"|"+t[1][1]+"|"+t[1][2]+"|");
        System.out.println("=======");
        System.out.println("|"+t[2][0]+"|"+t[2][1]+"|"+t[2][2]+"|");
        System.out.println("=======");
    }  
    
    public static void imprimirMenu(){
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("Introduce los datos solicitados para poder poner tu marca");
        System.out.println("");
        System.out.println("El primero que conecte tres gana");
    }
    public static void imprimirPosiciones(){
        System.out.println("=======");
        System.out.println("|"+"1"+"|"+"2"+"|"+"3"+"|");
        System.out.println("=======");
        System.out.println("|"+"4"+"|"+"5"+"|"+"6"+"|");
        System.out.println("=======");
        System.out.println("|"+"7"+"|"+"8"+"|"+"9"+"|");
        System.out.println("=======");
    }
    public static void modificarTabla(int p, String tabla[][],int marca){



        if (marca == 1){
            if (p==1){
                tabla[0][0]="X";
            }
            if (p==2){
                tabla[0][1]="X";
            }
            if (p==3){
                tabla[0][2]="X";
            }
            if (p==4){
                tabla[1][0]="X";
            }
            if (p==5){
                tabla[1][1]="X";
            }
            if (p==6){
                tabla[1][2]="X";
            }
            if (p==7){
                tabla[2][0]="X";
            }
            if (p==8){
                tabla[2][1]="X";
            }
            if (p==9){
                tabla[2][2]="X";
            }
        
        }
        if (marca == 2){
            if (p==1){
                tabla[0][0]="O";
            }
            if (p==2){
                tabla[0][1]="O";
            }
            if (p==3){
                tabla[0][2]="O";
            }
            if (p==4){
                tabla[1][0]="O";
            }
            if (p==5){
                tabla[1][1]="O";
            }
            if (p==6){
                tabla[1][2]="O";
            }
            if (p==7){
                tabla[2][0]="O";
            }
            if (p==8){
                tabla[2][1]="O";
            }
            if (p==9){
                tabla[2][2]="O";
            }
        }
    }
}
