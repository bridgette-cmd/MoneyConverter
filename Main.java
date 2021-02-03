package com.company;
// Arthur: Bridget (No lastname)
// Date Created: January 20th 2021
// Program Used: Java IntelliJ Idea
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double amount, dollar, pound, choiceFrom, choiceTo, euro, yen, ringgit, rupee;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Which currency would you like to convert?");
        System.out.println("1:Dollar \t2:Pound \t3:Euro");
        choiceFrom = sc.nextInt();

        System.out.println("To what currency?");
        System.out.println("1:Dollar \t2:Pound \t3:Euro");
        choiceTo = sc.nextInt();

        System.out.println("How much money do you want to convert?");
        amount = sc.nextFloat();

        // Conversion code
        // From Dollar to Pound
        if(choiceFrom == 1 && choiceTo == 2) {
            pound = amount * 0.78;
            System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
        }
        // From Dollar to Euro
        else if(choiceFrom == 1 && choiceTo == 3) {
            euro = amount * 0.87;
            System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
        }
        // From Pound to Dollar
        else if(choiceFrom == 2 && choiceTo == 1) {
            dollar = amount * 1.26;
            System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
        }
        // From Pound to Euro
        else if(choiceFrom == 2 && choiceTo == 3) {
            euro = amount * 1.10;
            System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
        }
        // From Euro to Dollar
        else if(choiceFrom == 3 && choiceTo == 1) {
            dollar = amount * 1.14;
            System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
        }
        // From Euro to Pound
        else if(choiceFrom == 3 && choiceTo == 2) {
            pound = amount * 0.90;
            System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
        }
        else {
            System.out.println("Invalid input");
        }

        System.out.println("Thank you for using Bridget's Services. \nSee you again soon!");

    }

}
