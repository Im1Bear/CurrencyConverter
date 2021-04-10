package com.im1bear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do? \n" +
                "1. Convert $ to €\n" +
                "2. Convert $ to Bitcoin\n" +
                "3. Convert € to Bitcoin\n" +
                "4. Convert GBP to €\n" +
                "5. Convert $ to GPB" +
                "6. Convert GBP to Bitcoin");
        int Number = scanner.nextInt();
        if (Number == 1) {
            System.out.println("Enter how much you want to convert: ");
            long Dollar = scanner.nextInt();
            System.out.println("Euros: "+ Dollar * 1.19);
        }
    }
}
