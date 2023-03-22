/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente 
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        float pago, cuota;
        char letra;
        String salir;
        
          
        

        System.out.println("Digite el tipo de socio: ");
        letra = entrada.next().toUpperCase().charAt(0);
        System.out.println(letra);
        
        while(letra != 'A' && letra != 'B' && letra != 'C'){
            System.out.println("Digito mal el tipo de socio, recuerde que los tipos son: A , B o C");
            System.out.println("Digite el tipo de socio: ");
            letra = entrada.next().toUpperCase().charAt(0);
            System.out.println(letra);
        }
        
        switch(letra){
                case 'A':
                    System.out.println("Digite el monto a pagar: ");
                    pago = entrada.nextFloat();
                    cuota = pago / 2;
                    System.out.println("El monto a pagar es de: "+cuota);
                    break;
                case 'B':
                    System.out.println("Digite el monto a pagar: ");
                    pago = entrada.nextFloat();
                    cuota = pago - pago * 35 / 100;
                    System.out.println("El monto a pagar es de: "+cuota);
                    break;
                case 'C':
                    System.out.println("Digite el monto a pagar: ");
                    pago = entrada.nextFloat();
                    cuota = pago;
                    System.out.println("El monto a pagar es de: "+cuota);
                    break;
                default:
                    while(letra != 'A' || letra != 'B' || letra != 'C'){
                        System.out.println("Digito un caracter incorrecto");
                        letra = entrada.next().toUpperCase().charAt(0);
                        System.out.println(letra);
                    }          
                }                        
    }
}