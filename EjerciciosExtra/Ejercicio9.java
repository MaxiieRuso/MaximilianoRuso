/*Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
¿Aún no lo entendiste? Recomendamos googlear división con restas
sucesivas.

*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2,cont=0;
        
        System.out.println("Digite un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite un numero: ");
        num2 = entrada.nextInt();
        
        if(num1>1 && num2>1 && num1>num2){
            do{
                num1 = num1-num2;
                cont++;
            }while(num1>=num2);
            System.out.println("El cociente es de: "+cont+" Y el residuo fue de: "+num1);
        }else{
            System.out.println("el primer numero es inferior al numero dos!");
        }
        
    }
}
