package ConditionalStatement;


//WAP to take marks in 5 subjects of the student ,
//        The marks must not be less than 0 and also must not be greater than 100
//        . Calculate the total scored by the student and find his/her grade

import java.util.Scanner;
public class FindngGrade {
    public static void main(String[] args) {
        float sub_1, sub_2, sub_3, sub_4, sub_5;
        float total, average, percentage;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects:\n");
        sub_1= sc.nextInt();
        sub_2= sc.nextInt();
        sub_3= sc.nextInt();
        sub_4= sc.nextInt();
        sub_5= sc.nextInt();
        // Calculate total, average and percentage
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        average = (float)(total / 5.0);
        percentage = (float)((total / 500.0) * 100);
        // It will calculate the Grade
        if (average >= 90)
            grade = 'A';
        else if (average >= 80 && average < 90)
            grade = 'B';
        else if (average >= 70 && average < 80)
            grade = 'C';
        else if (average >= 60 && average < 70)
            grade = 'D';
        else
            grade = 'E';
        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
    }
}



