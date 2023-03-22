/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n, numMayor=0,numMenor=1000000000,cont=0,nums;
        float promedio = 0;
        
        System.out.println("Digite la cantidad de numero que ingresara: ");
        n = entrada.nextInt();
        //Con El Metodo WHILE
        /*
        while(cont<n){
            System.out.println("Digite un numero: ");
            nums = entrada.nextInt();
            
                if(nums >= numMayor){
                    numMayor = nums;
                }
                if(nums <= numMenor){
                    numMenor = nums;
                }
                cont++;
                promedio = promedio + nums;
                
        }
        
        promedio = promedio / n;
        
        System.out.println("El numero MAYOR es: "+numMayor); 
        System.out.println("El numero MENOR es: "+numMenor);
        System.out.println("El promedio de todos los numeros es de: "+promedio);*/
        
        //Con El Metodo Do While
    
        do{
            System.out.println("Digite un numero: ");
            nums = entrada.nextInt();
            if(nums > 0){
                if(nums >= numMayor){
                numMayor = nums;
                }
                if(nums <= numMenor){
                numMenor = nums;
                }
                promedio = promedio + nums;
                }    
            cont++;
            }while(cont < n);
           
        promedio = promedio / n;
        
        System.out.println("El numero MAYOR es: "+numMayor);
        System.out.println("El numero MENOR es: "+numMenor);
        System.out.println("El promedio de todos los numeros es de: "+promedio);
        }

    }

