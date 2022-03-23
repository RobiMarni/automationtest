package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]) {

        System.out.println("working hours: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("pay rate:");
        double rate = scanner.nextDouble();
        scanner.close();


        System.out.println("Proba");
        System.out.println("proba 2");


        double grossPay = hours * rate;

        System.out.println("Plata: " + grossPay);
    }
}
