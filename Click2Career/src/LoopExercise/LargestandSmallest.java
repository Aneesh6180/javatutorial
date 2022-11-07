package LoopExercise;

//Write a program to enter the numbers till the user wants and at the end
//        the program should  display the largest and smallest numbers entered.

import java.util.Scanner;
public class LargestandSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char choice;

        do
        {
            System.out.print("Enter the number ");
            num = sc.nextInt();

            if(num > max)
            {
                max = num;
            }

            if(num < min)
            {
                min = num;
            }

            System.out.print(" continue y/n? ");
            choice = sc.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
