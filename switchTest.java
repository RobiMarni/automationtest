package chapter2;

import java.util.Scanner;

public class switchTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch(grade)
        {
            case  "A":
            message = "90-100";
            break;
            case  "B":
            message = "80-90";
            break;
            case "C":
                message = "70-80";
                break;
            default:
                    message = "Error";
                break;
        }
        System.out.println(message);
    }
}
