package operators;

//Write a java program to find if the triangle is equilateral or not.
import java.util.Scanner;
public class EqualorNot {
    private static Scanner sc;

    public static void main(String[] args) {

        double side1, side2, side3;
        sc = new Scanner(System.in);

        System.out.println("Please Enter Three sides of Triangle ");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        side3 = sc.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It is an Equilateral Triangle");
        } else {
            System.out.println("It is not Equilateral");
        }
    }
}
