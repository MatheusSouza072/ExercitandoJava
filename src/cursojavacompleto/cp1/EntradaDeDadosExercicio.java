/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavacompleto.cp1;

import java.util.Scanner;

public class EntradaDeDadosExercicio {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = s.next();

        s.nextLine();

        System.out.println("How many bedrooms are there in your house?");
        int qntQuartos = s.nextInt();
        s.nextLine();

        System.out.println("Enter product price:");
        double preco = s.nextDouble();
        
        s.nextLine();
        
        System.out.printf("Enter your last name age and height (same line):");
        String lastName = s.next();
        int age = s.nextInt();
        double height = s.nextDouble();
        
        System.out.println(fullName);
        System.out.println(qntQuartos);
        System.out.println(preco);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(height);
        
        
              

    }
}
