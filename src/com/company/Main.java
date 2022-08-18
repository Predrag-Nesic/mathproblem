package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*This is just a simple code that describes a simple, yet imposible, 3x + 1 problem.
        It shows how many iterations would it take to get to the infinite loop of 1 and 4 for the entered number;
        For example, initial number is 5, if it is odd it multiplies by 3 and 1 is added. If it is even, it is than divided by 2.
        So, 5 multiplied by 3 is 15, add 1, and the result is 16. That is one iteration.
        16 is even, divide by 2, and the result is 8. That is the second iteration.
        8 is even, divide by 2, result: 4. Third iteration.
        4 divided by 2 is 2. Fourth iteration.
        2 divided by 2 is 1. Fifth iteration.
        So it takes 5 iterations to get to 1. 1 is odd, if we continue with the function we stumble upon an infinite loop.
        1 is odd, multiplied by 3 is 3, add 1, and the result is 4.
        4 divided by 2 is 2.
        2 divided by 2 is 1... And so on.
         */
        Scanner scan = new Scanner(System.in);
        int n;

        while (true) {
            try {
                int counter = 0;
                System.out.println("Enter a positive integer");
                n = Integer.parseInt(String.valueOf(scan.nextInt()));
                while (n <= 0) {
                    System.out.println("Enter a positive integer");
                    n = Integer.parseInt(String.valueOf(scan.nextInt()));
                }

                int y = n;
                int max = n;

                while (n != 1) {
                    if (n % 2 == 1) {
                        n = 3 * n + 1;
                        if(n > max) {
                            max = n;
                        }
                        counter++;
                    } else {
                        n = n / 2;
                        counter++;
                    }
                }
                System.out.println("For the number " + y + ", the 3x+1 function iterates " + counter +
                        " times until it reaches the value of 1 \n" +
                        "The maximum value of iterations is: " + max);
            } catch (InputMismatchException ex) {
                System.err.println("The entered is not an integer: " + ex);
            }
        }
    }
}