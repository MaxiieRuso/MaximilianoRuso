/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int filas=4,columnas=4;
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                if(i>0 && i<filas-1 && j>0 && j<columnas-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }   
            }
            System.out.println(" ");
        }
        
    }
}
