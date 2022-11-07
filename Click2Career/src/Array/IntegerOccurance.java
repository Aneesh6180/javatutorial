package Array;
// Find the occurrence of an integer in the array.

import java.util.Scanner;
public class IntegerOccurance {
    private static Scanner sc;

    public static void main(String[] args) {
        int Size, i, num, occr = 0;

        sc = new Scanner(System.in);

        System.out.print("Please Enter the size = ");
        Size = sc.nextInt();

        int[] arr = new int[Size];

        System.out.format("Enter the %d elements : ", Size);
        i = 0;
        while( i < Size)
        {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Please Enter the Array Item to Know = ");
        num = sc.nextInt();

        i = 0;
        while( i < arr.length)
        {
            if(arr[i] == num)
            {
                occr++;
            }
            i++;
        }

        System.out.println(num + " Occurred " + occr + " Times.");
    }
}

