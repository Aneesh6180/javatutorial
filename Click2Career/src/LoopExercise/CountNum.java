package LoopExercise;


//Write a program to enter the numbers till the user wants and at the end
//        it should display the  count of positive, negative and zeros entered.

import java.util.Scanner;
public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;
        do {
            System.out.print("Enter the number ");
            num = sc.nextInt();

            if (num > 0) {
                countPositive++;
            } else if (num < 0) {
                countNegative++;
            } else {
                countZero++;
            }

            System.out.print(" continue y/n? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}