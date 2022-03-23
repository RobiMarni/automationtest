package chapter2;

import java.util.Scanner;

public class TestIF {
    public static void main(String[] args) {
// ako ima više od 10 prodaja
        int salary = 1000;
        int bonus = 250;
        int quote = 10;

       System.out.println("How many salary a week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();


        System.out.println("Damages: ");
        int damage = scanner.nextInt();


        if (sales > quote && damage < 2)
        {
            salary = salary + bonus;

        }

        System.out.println("The employees's pay is $" + salary);



    }
}
