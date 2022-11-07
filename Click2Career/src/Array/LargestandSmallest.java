package Array;

//WAP to find the largest and smallest element in the array.

public class LargestandSmallest {

    public static void main(String[] args) {

        int numbers[] = new int[]{3,4,6,7,9};

        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largetst)
                largetst = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);
    }
}