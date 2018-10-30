package boletin6_2;

import java.util.Scanner;

public class DousNumeros {

    short num1, num2;

    public void maiorIgual() {
        Scanner res = new Scanner(System.in);
        System.out.println("Inserte o primeiro numero:");
        num1 = res.nextShort();
        System.out.println("Inserte o segundo numero:");
        num2 = res.nextShort();

        if (num1 >= num2) {

            System.out.println("a resta de " + num1 + "-" + num2 + "=" + (num1 - num2));

        }
        System.out.println("a suma dos dous numeros é :" + (num1 + num2));
    }
}
