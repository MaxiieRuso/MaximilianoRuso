/*Crear un programa que dado un número determine si es par o impar.
*/
package snapshot.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Digite un numero: ");
        num = entrada.nextInt();
        
        if(num%2 == 0){
            System.out.println("Es un numero PAR");
        }else {
            System.out.println("Es un numero IMPAR");
        }
        
        
    }
}
