package ConditionalStatement;

//WAP to take two input coordinates x and y from  the user and find in which quadrant does the coordinate lie.
//        +x +y  Q1
//        -x  +y  Q2
//        -x   -y  Q3
//        +x  -y  Q4

import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x= sc.nextInt();
        y= sc.nextInt();
        if( x > 0 && y> 0)
            System.out.println("lies in first quadrant");
        else if( x < 0 && y > 0)
            System.out.println("lies in second quadrant");
        else if( x < 0 && y < 0)
            System.out.println("lies in third quadrant");
        else if( x > 0 && y < 0)
            System.out.println("lies in fourth quadrant");

    }
}
