package LoopExercise;

//Write a promptogram that prompts the user to input a positive integer.
//        It should then output a  message indicating whether the number is a prime number.


import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args) {
        int num;
        int count = 2;
        boolean prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
        System.out.println();
        if (num % count == 1) {
            System.out.println(num + " is a prime number");
            System.out.print("The last number that divides into " + count);
        } else {

            System.out.println(num + " is  not a prime number");
            System.out.println();
        }
    }
}


