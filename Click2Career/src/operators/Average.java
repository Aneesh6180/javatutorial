package operators;

//Write a java program to find the average of 5 numbers.

import java.util.Scanner;

public class Average{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = sc.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = sc.nextInt();


        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);
    }
}