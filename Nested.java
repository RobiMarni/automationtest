package chapter2;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        //dupla petlja

        double plata = 3000;
        double radnoIskustvo = 2.5;
        System.out.print("Plata:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        System.out.print("radno iskustvo:");
        double m = input.nextDouble();
        double povecanjePlate = 0;

        if(m > radnoIskustvo)
        {
            if (n < plata) {
                n = n + 500;
                System.out.println("Na osnovu radnog iskustva nova plata je: " + n);
            }
            else
            {
                System.out.println("Nema povećanja");
            }
        }
        else
        {
            System.out.println("poy");
        }




    }
}
