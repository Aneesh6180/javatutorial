package ConditionalStatement;

//WAP to take the person’s height in feet and convert it into centimeters and display it.
import java.util.Scanner;
public class HeightConversion {
    // Function to perform conversion
    static double HeightConversion(int feet)
    {
        double centimeter;
        centimeter  = 30.48 * feet;
        System.out.printf("Value in Centimeter is: %.2f \n", centimeter);
        return 0;
    }
    public static void main(String args [])
    {
        int feet = 20;
        HeightConversion(feet);
    }
}

