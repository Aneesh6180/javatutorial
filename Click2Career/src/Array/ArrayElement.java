package Array;
//WAP to create an integer array of size 10 , read the array elements
//        from the user and display the array elements.

import java.util.Scanner;

public class ArrayElement{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArr[] = new int[10];
        for(int i = 0; i < 10; i++)
            intArr[i] = sc.nextInt();
        for(int i = 0; i < 10; i++)
            System.out.println(intArr[i]);
    }
}
