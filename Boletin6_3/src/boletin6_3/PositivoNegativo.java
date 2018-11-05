/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
