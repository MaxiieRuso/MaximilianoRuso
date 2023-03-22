/*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase,letra;
        
        System.out.println("Digite una frase o palabra");
        frase = entrada.nextLine();
        
        letra = "A";
        
        if(frase.substring(0,1).equals(letra)){
            System.out.println("Correcto! Su primer letra de la frase o palabra es "+letra);
        }else{
            letra = frase.substring(0,1);
            System.out.println("Incorrecto! La primer letra de su palabra o frase es "+letra);
        }
            
        
    }
}
