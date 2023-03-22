/*Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num,cont=1;
        
        System.out.println("Digite un numero entero: ");
        num = entrada.nextInt();
        
        do{
            num = num/10;
            cont++;
        }while(num>10);
        
        System.out.println("La cantidad de digitos es de: "+cont);
    }
}
