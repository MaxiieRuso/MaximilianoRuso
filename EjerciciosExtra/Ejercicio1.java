/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas, dias, minutos;
        
        System.out.println("Digite el tiempo en minutos: ");
        minutos = entrada.nextInt();
        
        horas = minutos / 60;
        dias = 0;
        do{
            if(horas >=24){
                horas = horas - 24;
                dias++;
            }
        }while(horas > 24);
        
        System.out.println("equivale a "+dias+" dias Y "+horas+" horas");
        
        
        
    }
}
