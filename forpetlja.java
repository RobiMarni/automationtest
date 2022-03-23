package chapter2;

import java.util.Scanner;

public class forpetlja {
    public static void main(String[] args) {

        //Find the average of each students test score
    int numberOfStudents = 24;
    int numberOfTests =4;
Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<numberOfStudents; i++)
        {
            double total = 0;
            for(int j=0; j<numberOfTests; j++)
            {
                System.out.println("Enter the score for Test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
           double average = total/numberOfTests;
            System.out.println("the test average for student#" + (i+1) + " is " + average);
        }

    }
}