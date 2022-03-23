package chapter2;

import java.util.Scanner;

public class Adjective {

    public static void main(String[] args) {

        System.out.print("Unesi prvi broj:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("Unesi drugi broj:");
        double m = scanner.nextDouble();

        double x = n + m;

        System.out.println(" Prvi broj je " + n + " Drugi broj je " + m + " Rezultat je:" + x );


    }
}
