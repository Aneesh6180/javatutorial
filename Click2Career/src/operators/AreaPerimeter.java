package operators;

//Write a Java program to print the area and perimeter of a square.

import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Side Length of Square: ");
        float s = scan.nextFloat();

        float a = s * s;
        float p = 4 * s;
        System.out.println("\nArea = " + a);
        System.out.println("\nPerimeter = " + p);
    }
}

