/*
 *primer comentario para el segundo commit
b
 */
package boletin6_3;

import java.util.Scanner;

/**
 * @since @version @see @author mrebelladofernandez
 */
public class PositivoNegativo {

    Scanner res = new Scanner(System.in);
    double num1;

    public void tecleaNumero() {
        System.out.println("Inserte o numero:");
        num1 = res.nextDouble();
        if (num1 > 0) {
            System.out.println("+");
        } else if (num1 < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }

}
