/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import java.util.Scanner;

/**
 *
 * @author mrebelladofernandez
 */
public class NumerosDistintos {
    Scanner res=new Scanner(System.in);
    
    public void TresNumeros(){
        
        int num1,num2,num3;
        System.out.println("Inserte o primeiro número");
        num1=res.nextInt();
        
        System.out.println("Inserte o segundo número");
        num2=res.nextInt();
        
        System.out.println("Inserte o terceiro número");
        num3=res.nextInt();
        
        if (num2<num1 && num1>num3){
            System.out.println(num1+" é máis maior que "+num2+" e "+num3);
        }
       
        else if(num1<num2 && num2>num3){
            System.out.println(num2+" é máis maior que "+num1+" e "+num3);
        }
        
        else if(num1<num3 && num3>num2){
            System.out.println(num3+" é máis maior que "+num1+" e "+num2);
        }
        
        else{
            System.out.println("Os numeros introducidos teñen que ser diferentes entre si");
        }
    }
    
}
