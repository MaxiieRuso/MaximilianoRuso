/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int numPers,contMenor=0,contMayor=0;
        float promedio=0, altura;
        
        System.out.println("Digite el numero de personas: ");
        numPers = entrada.nextInt();
        
        
        for(int i=0;i<numPers;i++){
            System.out.println("Digite la altura de la persona "+(i+1));
            altura = entrada.nextFloat();
            if(altura < 1.60){
                contMenor++;
            }else{
                contMayor++;
            }
            promedio = promedio + altura;
        }
        
        promedio = promedio / numPers;
        
        System.out.println("El promedio de personas menor a 1.60m es de: "+contMenor);
        System.out.println("El promedio de personas mayor a 1.60m es de: "+contMayor);
        System.out.println("El promedio de altura de todas las personas es de: "+promedio);
    }
}

