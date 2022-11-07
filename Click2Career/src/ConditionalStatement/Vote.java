package ConditionalStatement;

//WAP to check if a person is eligible to cast a vote or not.
import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age= sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for vote");
        }else {
            System.out.println("you are not eligible for vote");
        }
    }
}

