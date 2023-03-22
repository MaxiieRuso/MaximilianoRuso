/*Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int correctas=0,incorrectas=0;
        String primerLetra, ultimaLetra,frase;
        
        do{
            System.out.println("Digite una frase");
            frase = entrada.nextLine();
            primerLetra = frase.toUpperCase().substring(0,1);
            ultimaLetra = frase.toUpperCase().substring(frase.length()-1,frase.length());
            
            if(frase.length()<=5){
                if(primerLetra.equals("X") && (ultimaLetra.equals("O"))){
                    correctas++;
                }else{
                    incorrectas++;
                }
            }else{
                incorrectas++;
            }
        }while(!"&&&&&".equals(frase));
        
        
        System.out.println("La cantidad de frases correctas es de "+correctas);
        System.out.println("La cantidad de frases incorrectas es de "+incorrectas);
        
    }
}
