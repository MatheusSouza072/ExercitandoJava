/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavacompleto.cp1;

import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Par || Impar");
        System.out.println("Enter an integer number:");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even!");
        } else {  
            System.out.println("odd");
        }
        // Que horas são
        System.out.println("Que horas são?");
        int time = sc.nextInt();
        if (time < 12) {
            System.out.println("good morning!");

        } else if (12 > time && time < 18) {
            System.out.println("good afternoon!");

        } else {
            System.out.println("good evening!");
        }
        
        */
        // Numero maior
        
        System.out.println("Digite 3 numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        if(n1 > n2 || n1 > n3) {
            System.out.println(n1 + "é o maior numero");
        }
        
        else if(n2 > n1 || n2 > n3) {
            System.out.println(n2 + "é o maior numero");
        }
        
        else {
            System.out.println(n3 + "é o maior numero");
        }
      
        
        System.out.println("ABCDE");
    }

}
