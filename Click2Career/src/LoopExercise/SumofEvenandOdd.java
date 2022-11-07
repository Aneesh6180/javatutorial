package LoopExercise;

//Write a program that reads a range of numbers as input, and iterates
//        it then prints the sum of the even and odd  integers.

import java.util.Scanner;
public class SumofEvenandOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        char choice;
        int even = 0;
        int odd = 0;

        do {
            System.out.println("Enter any Number");
            num = sc.nextInt();


            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            System.out.print(" continue y/n? ");

            choice = sc.next().charAt(0);
        }

        while (choice == 'y' || choice == 'y') ;
        System.out.println("Sum of even number" + even);
        System.out.println("sum of odd number" + odd);
    }
}

