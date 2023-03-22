/*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.

*/
package snapshot.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, suma, resta, mult, div,opc;
        char resp;
        boolean salir=true;
        
        System.out.println("Digite el primer numero positivo: ");
        num1 = entrada.nextInt();
        
        //HASTA QUE NUM1 SEA POSITIVO
        while(num1 < 0){
            System.out.println("Digite el primer numero positivo: ");
            num1 = entrada.nextInt();
        }
        //HASTA QUE NUM2 SEA POSITIVO   
        do{
        System.out.println("Digite el SEGUNDO numero positivo: ");
        num2 = entrada.nextInt();
        }while(num2<0);
        
        //MENU DE OPCIONES   
        do{
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("Digite una de las Opciones");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1 : 
                    suma = num1 + num2;
                    System.out.println("La suma de los numeros es: "+suma);
                    break;
                case 2 : 
                    resta = num1 - num2;
                    System.out.println("La resta de los numeros es: "+resta);
                    break;
                case 3 : 
                    mult = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es: "+mult);
                    break;
                case 4 : 
                    div = num1 / num2;
                    System.out.println("La division de los numeros es: "+div);
                    break;
                case 5 : 
                    do{
                        System.out.println("Seguro quiere salir del programa (S/N)?");
                        resp = entrada.next().toUpperCase().charAt(0);
                        switch (resp) {
                        case 'S' -> salir = false;
                        case 'N' -> salir = true;
                        default -> System.out.println("Digito un caracter incorrecto");
                            }
                    }while(resp != 'S' && resp != 'N');
                    break;
                default :
                    System.out.println("Digito una opcion incorrecta!");
            }
            System.out.println("");
            
        }while(salir); // nunca poner salir = true o salir = false, porque  sino no sale del bucle
    }
}


