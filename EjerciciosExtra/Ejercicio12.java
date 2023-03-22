/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String

*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2, num3;
        char letra='E';
        String n1,n2,n3;
        //Echo por mi!!!
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                num1 = (int) (Math.random()*10);
                num2 = (int) (Math.random()*10);
                num3 = (int) (Math.random()*10);
                
                if(num1==3 && num2==3 && num3==3){
                    System.out.println(letra+" - "+letra+" - "+letra);
                }else if(num1==3 && num2==3){
                    System.out.println(letra+" - "+letra+" - "+num3);
                }else if(num1==3 && num3==3){
                    System.out.println(letra+" - "+num2+" - "+letra);
                }else if(num2==3 && num3==3){
                    System.out.println(num1+" - "+letra+" - "+letra);
                }else if(num1==3){
                    System.out.println(letra+" - "+num2+" - "+num3);   
                }else if(num2==3){
                    System.out.println(num1+" - "+letra+" - "+num3);
                }else if(num3==3){
                    System.out.println(num1+" - "+num2+" - "+letra);
                }else{
                    System.out.println(num1+" - "+num2+" - "+num3);
                }
            }
            System.out.println("*********");
        }
        
        /* // El correcto !! No entiendo el signo ? y el :
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                String digito1 = (i == 3) ? "E" : String.valueOf(i);
                String digito2 = (j == 3) ? "E" : String.valueOf(j);
                String digito3 = (k == 3) ? "E" : String.valueOf(k);
                System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
        */
    }
}
