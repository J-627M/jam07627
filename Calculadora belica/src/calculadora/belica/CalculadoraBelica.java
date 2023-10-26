package calculadora.belica;

import java.util.Scanner;

public class CalculadoraBelica {

    public static void main(String[] args) {

        System.out.println("calculadora");

        System.out.println("Ingresa el primer numero: ");
        Scanner consola = new Scanner(System.in);
        var n1 = consola.nextDouble();

        System.out.println("Ingresa el segundo numero: ");
        var n2 = consola.nextDouble();

        System.out.println("Que operacion quieres realizar?");
        System.out.println("1: Suma");
        System.out.println("2: resta");
        System.out.println("3: multiplicacion");
        System.out.println("4: division");

        var oP = consola.nextInt();
        double resultado = 0;

        switch (oP) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = n1 / n2;
                break;
                       
        }
        System.out.println("resultado = " + resultado);

    }

}
