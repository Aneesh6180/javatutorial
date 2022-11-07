package LoopExercise;

//Write a program that prompts the user to input a positive integer.
//        It should then print the  multiplication table of that number.


import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // number n for which we have to print the
        // multiplication table.
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();

        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of n.
            System.out.println(n + " * " + i + " = "
                    + n * i);
        }
    }
}

