//fredy fazbear

import java.util.Scanner;

public class holam {

    public static void main(String args[]) {

        for (var contador = 0; contador < 19; contador++) {
            if (contador % 2 != 0) {
                continue;
            }
            System.out.println("contador = " + contador);
        }

        //var contador = 0;
        //while (contador < 3) {
        //        System.out.println("contador = " + contador);
        //     contador++;
        // }
        /*var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);
        System.out.println("contador = " + contador);*/
    }
}
