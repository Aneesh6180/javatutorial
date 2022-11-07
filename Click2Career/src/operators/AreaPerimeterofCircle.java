package operators;

//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;
public class AreaPerimeterofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}


