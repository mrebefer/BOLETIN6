/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;

import java.util.Scanner;

/**
 *
 * @author mrebelladofernandez
 */
public class NomePeso {

    Scanner res = new Scanner(System.in);

    public void CompararPeso() {

        String nomePersoa1, nomePersoa2;
        int pesoPersoa1, pesoPersoa2;

        System.out.println("Inserte nome da primeira persoa: ");
        //sout String-> es necesario limpiar el buffer.
        nomePersoa1 = res.nextLine();           //limpiando buffer.

        System.out.println("Inserte peso desa persoa: ");
        pesoPersoa1 = res.nextInt();

        System.out.println("Inserte nome da segunda persoa: ");
        nomePersoa2 = res.nextLine();       //limpiando buffer.

        System.out.println("Inserte peso desa persoa: ");
        pesoPersoa2 = res.nextInt();

        if (pesoPersoa1 > pesoPersoa2) {
            System.out.println("Pesa máis " + nomePersoa1 + " que " + nomePersoa2 + " cunha diferenza de " + (pesoPersoa1 - pesoPersoa2));
        } 
        else if (pesoPersoa1 < pesoPersoa2) {
            System.out.println("Pesa máis " + nomePersoa2 + " que " + nomePersoa1 + " cunha diferenza de " + (pesoPersoa2 - pesoPersoa1));
        } 
        else {
            System.out.println("O peso das duas persoas son iguais.");
        }
    }
}
