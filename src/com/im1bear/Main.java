/*
        The Market Changes everyday so this Converter will not be useful
        for every Day at work/school/home
*/
package com.im1bear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Number;
        long Dollar;
        long Euro;
        double Bitcoin;
        long GBP;

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                What do you want to do?\s
                1. Convert Dollar ($) to Euro (€)
                2. Convert Dollar ($) to Bitcoin (₿)
                3. Convert € to Bitcoin (₿)
                4. Convert GBP to €
                5. Convert GBP to $
                6. Convert GBP to Bitcoin (₿)""");
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
            // Option Nr. 4
            // Converting British Pound to Euro
            System.out.println("Enter how much you want to convert: ");
            GBP = scanner.nextLong();
            System.out.println("Euro: " + 1.15 * GBP);
        } else if (Number == 5) {
            // Option Nr. 5
            // Converting GBP to Bitcoin
            System.out.println("Enter how much you want to convert: ");
            GBP = scanner.nextLong();
            System.out.println("Dollar: " + GBP * 1.37);
        } else if (Number == 6) {
            // Option Nr. 6
            // Converting GBP to Bitcoin
            Bitcoin = 0.000023;
            System.out.println("Enter how much you want to convert: ");
            GBP = scanner.nextLong();
            System.out.println("Bitcoin: " + GBP * Bitcoin);
        }
    }
}
