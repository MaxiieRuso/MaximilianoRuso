/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c,d, aux;
        
        System.out.println("Digite el valor de A:");
        a = entrada.nextInt();
        System.out.println("Digite el valor de B:");
        b = entrada.nextInt();
        System.out.println("Digite el valor de C:");
        c = entrada.nextInt();
        System.out.println("Digite el valor de D:");
        d = entrada.nextInt();
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        /* Este lo hice yo
        if(aux == b){
            b = c;
            if(b == c){
                c = a;
                if(c == a){
                    a = d;
                    if(a == d){
                        d = aux;
                    }
                }
            }
        }
        */
        System.out.println("El valor de A es de: "+a);
        System.out.println("El valor de B es de: "+b);
        System.out.println("El valor de C es de: "+c);
        System.out.println("El valor de D es de: "+d);
        
    }
}
