package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(20);

        //Printing the random number to verify that my code works
        System.out.println(x);

        //Reading user input
        Scanner Rdm = new Scanner(System.in);
        int RNumber;
        do {
            System.out.println("Enter your number: ");
            RNumber = Rdm.nextInt();

            if (RNumber == x) {
                System.out.println("Good Jooob!!! You guessed it.");
            } else if (RNumber > x) {
                System.out.println("You guessed higher. Try again.");
            } else if (RNumber < x) {
                System.out.println("You guessed lower. Try again.");
            }
        } while (x != RNumber);
    }
}
