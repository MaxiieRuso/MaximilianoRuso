/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nums,cont=0,numsPar=0,numsImpar=0,suma=0;
        
        do{
            System.out.println("Digite numeros: ");
            nums = entrada.nextInt();
            if(nums>0){
                if(nums%2==0){
   
                numsPar++;
                }else{
                    
                numsImpar++;
                }
                
            suma = suma + nums;
            }
            cont++;
        }while(nums%5!=0);
         
        System.out.println("La cantidad de numeros digitados fue de: "+cont);
        System.out.println("La suma de los numeros digitados fue de: "+suma);
        System.out.println("La cantidad de numeros Pares es de: "+numsPar);
        System.out.println("La cantiadd de numeros IMPARES es de: "+numsImpar);
        
    }
}

