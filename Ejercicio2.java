/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase, frase2;
        
        frase2 = "eureka";
        
        System.out.println("Digite un frase");
        frase = entrada.next();
        
        if(frase.equals(frase2)){
            System.out.println("Correcto! Lo lograste!");
        }else{
            System.out.println("Incorrecto!");
        }
        
        
        
    }
}
