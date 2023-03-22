/*Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.

*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n, m,cont=0,conteo=0;
        float edad,suma=0,media;
        
        System.out.println("Digite la cantidad de familias: ");
        n = entrada.nextInt();
        
        do{
            for(int i=0;i<n;i++){
                System.out.println("Cuantos hijos tiene la familia Nro "+(i+1)+" ?");
                m = entrada.nextInt();
                for(int j=0;j<m;j++){
                    System.out.println("Que edad tiene el hijo numero "+(j+1)+"?");
                    edad = entrada.nextFloat();
                    suma = suma + edad;
                    cont++;
                }
            }
            conteo++;
        }while(n < conteo);
        
        media = suma/cont;
        
        System.out.println("La media de edad de todos los hijos de todas las familias es de "+media);
    }
}
