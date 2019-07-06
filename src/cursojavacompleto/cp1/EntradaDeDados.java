/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavacompleto.cp1;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gender = sc.next().charAt(0);

        
        String s = sc.next();
        char letter = s.charAt(0);
        int digit = Integer.parseInt(s.substring(1)); 
        
        System.out.println(letter);
        System.out.println(digit);
        
        sc.close();
    }

}
