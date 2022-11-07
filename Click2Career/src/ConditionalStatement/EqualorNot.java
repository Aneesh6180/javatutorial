package ConditionalStatement;

//Write a java program to accept two integers and check whether they are equal or not.

import java.util.Scanner;
public class EqualorNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter Two Integer");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b)
            System.out.println("They are Equal");
        else
            System.out.println("They are not Equal");
    }
}