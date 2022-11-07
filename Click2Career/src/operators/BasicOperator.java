package operators;

//Write a java program to take two number input from the user and display its sum,product,
// difference,quotient and remainder.
import java.util.Scanner;
public class BasicOperator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number");
        int firstInt = sc.nextInt();
        System.out.print("Enter 2nd number");
        int secondInt = sc.nextInt();
        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Quotient of two integers: %d%n", firstInt / secondInt);
        System.out.printf("Remainder of two integers: %d%n", firstInt % secondInt);


    }

}

