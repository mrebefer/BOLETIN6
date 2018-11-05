
package boletin6_1;

import java.util.Scanner;


public class Numero {
    Scanner res=new Scanner(System.in);
    
    public void positivoNegativo(){
        System.out.println("Inserte número:");
        int num1;
        num1=res.nextInt();
        
        if(num1>0){
            System.out.println("é positivo");
        }
        else{
            System.out.println("error");
        }
    }
}
