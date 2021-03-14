package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_32 {

    public static void main(String[] args) {
        //to make a simple calculation using switch....case
        int a, b, choice, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = scan.nextInt();
        System.out.println("Enter the first number : ");
        b = scan.nextInt();
        System.out.println("Option...... ");
        System.out.println("1). Addition ");
        System.out.println("2). Substration ");
        System.out.println("3). Multiply ");
        System.out.println("4). Division ");
        System.out.println("5). Modulus");
        System.out.println("Select your option........ ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                result = (a + b);
                System.out.println("Sum = " + result);
                break;
            case 2:
                result = (a - b);
                System.out.println("Subtraction = " + result);
                break;
            case 3:
                result = (a * b);
                System.out.println("Multiply = " + result);
                break;
            case 4:
                result = (a / b);
                System.out.println("Division = " + result);
                break;
            case 5:
                result = (a % b);
                System.out.println("Modulus = " + result);
                break;
            default:
                System.out.println("Invalid input.....");
        }
    }

}
