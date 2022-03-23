package chapter2;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("12");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1 )
        {
            System.out.println("Invalid entry: Must be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = rate * hoursWorked;
        System.out.println("Gross pay $" + gross);
    }
}
