/*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.

*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, num, suma;
        
        suma = 0;
        
        System.out.println("Digite un numero positivo Limite");
        limite = entrada.nextInt();
        
        if(limite > 0){
            do{
                System.out.println("Introduzca un numero");
                num = entrada.nextInt();
                suma = suma + num;
                if(suma >= limite){
                    break;
                }
            }while(suma <=limite);
            System.out.println("Llegaste al limite del valor!");
        }else{
            System.out.println("Incorrecto, el valor limite debe ser POSITIVO");
        }
        
        
        
        
        
        
    }
}
