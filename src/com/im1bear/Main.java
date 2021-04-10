package com.im1bear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Number;
        long Dollar;
        long Euro;
        long GBP;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do? \n" +
                "1. Convert $ to €\n" +
                "2. Convert $ to Bitcoin\n" +
                "3. Convert € to Bitcoin\n" +
                "4. Convert GBP to €\n" +
                "5. Convert $ to GPB" +
                "6. Convert GBP to Bitcoin");
        System.out.println("Enter a Number: ");
        Number = scanner.nextInt();
        if (Number == 1) {
            // Option Nr. 1
            // Converting Dollar to Euros
            System.out.println("Enter how much you want to convert: ");
            Dollar = scanner.nextLong();
            System.out.println("Euros: "+ Dollar * 1.19);
        } else if (Number == 2) {
            // Option Nr. 2
            /*
            Converting Dollar into Bitcoin
            ( Not Always accurate )
             */
            System.out.println("Enter how much you want to convert: ");
            Dollar = scanner.nextLong();
            System.out.println("Bitcoin: " + Dollar * 0.000016);
        } else if (Number == 3) {
            // Option Nr. 3
            // Converting Euro to Bitcoin
            System.out.println("Enter how much you want to convert: ");
            Euro = scanner.nextLong();
            System.out.println("Bitcoin: " + Euro * 0.000020);
        } else if (Number == 4) {
            System.out.println("Enter how much you want to convert: ");

        }
    }
}
