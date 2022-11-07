package operators;

//Write a program to take name input from the user and display Hello + name as output.

import java.util.Scanner;
public class StringAdd {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        System.out.println("Hello"+name);
    }
}

