/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.

*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Digite un numero del 1 al 10");
        num = entrada.nextInt();
        
        switch(num){
                case 1 -> System.out.println("I");
                case 2 -> System.out.println("II");
                case 3 -> System.out.println("III");
                case 4 -> System.out.println("IV");
                case 5 -> System.out.println("V");
                case 6 -> System.out.println("VI");
                case 7 -> System.out.println("VII");
                case 8 -> System.out.println("VIII");
                case 9 -> System.out.println("IX");
                case 10 -> System.out.println("X");
                default -> System.out.println("El numero es menor a 0 o mayor a 10");   
    }
    }
}
