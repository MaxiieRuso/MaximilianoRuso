/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char letra;
        
        System.out.println("Digite una letra: ");
        letra = entrada.next().toLowerCase().charAt(0);
        //      ESTA ES UNA MANERA!!!
        switch(letra){
            case 'a':
                System.out.println("Digito una vocal");
                break;
            case 'e':
                System.out.println("Digito una vocal");
                break;
            case 'i':
                System.out.println("Digito una vocal");
                break;
            case 'o':
                System.out.println("Digito una vocal");
                break;
            case 'u':
                System.out.println("Digito una vocal");
                break;   
            default:
                System.out.println("No es una letra vocal");
                break;
            }
        //********************************************************
        //              ESTA ES OTRA MANERA
        //Con el equals() solo se puede comparar dos variables! variable1.equals(variable2)
        
    }
}
