package ConditionalStatement;

//Write a java program to check if the input number is even or odd.

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println(n+" is an EVEN no");
        }
        else{
            System.out.println(n+" is an ODD no");
        }
    }

}

