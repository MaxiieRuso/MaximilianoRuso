/*Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        
        System.out.println("Digite una palabra o frase que tenga 8 digitos");
        frase = entrada.nextLine();
        
        if(frase.length()==8){
            System.out.println("Tu palabra o frase contiene 8 digitos, Bien Echo!");
        }else if (frase.length() < 8){
            System.out.println("Tu palabra o frase tiene MENOS de 8 digitos");
        }else {
            System.out.println("Tu palabra o frase tiene MAS de 8 digitos");
        }
        
        
    }
}
