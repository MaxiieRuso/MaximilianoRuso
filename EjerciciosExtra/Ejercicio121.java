
package snapshot.ejercicios.EjerciciosExtra;

import java.util.Scanner;

//Lo hicieron los compas!!!
public class Ejercicio121 {
    public static void main(String[] args) {
        
        int num, N;
        String codi, codj, codk;

        for (int i = 0; i < 10; i++) {
            codi = Integer.toString(i);
            if (codi.equals("3")) {
                codi = "E";
            }

            for (int j = 0; j < 10; j++) {
                codj = Integer.toString(j);

                if (codj.equals("3")) {
                    codj = "E";

                }
                for (int k = 0; k < 10; k++) {
                    codk = Integer.toString(k);

                    if (codk.equals("3")) {
                        codk = "E";
                        System.out.println(codi + "-" + codj + "-" + codk);
                    } else {
                        System.out.println(codi + "-" + codj + "-" + codk);
                    }

                }
            }
        
    }
    }
}