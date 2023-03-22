/*Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2,res, resp; 

        
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        
        System.out.println("El PRIMER numero es: "+num1);
        System.out.println("El Segundo numero es: "+num1);
        
        res = num1 * num2;
        System.out.println("Adivine el resultado de esta multiplicacion: ");
        
        do{
            
            System.out.println(num1+" * "+num2+" = ");
            System.out.println("Digite el resultado: ");
            resp = entrada.nextInt();
            if(resp != res){
                System.out.println("Incorrecto!, Vuelva a digitar otro resultado: ");
            }
        }while(resp != res);
        
        if(resp == res){
                System.out.println("Correcto! El resultado es de: "+res+" .Bien Echo!");
            }
    }
}
