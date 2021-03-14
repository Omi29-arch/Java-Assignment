package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_9 {

    public static void main(String[] args) {
                                             //to find the largest among three numbers;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int x = scan.nextInt();
        System.out.print("Enter the 2nd number : ");
        int y = scan.nextInt();
        System.out.print("Enter the 3rd number : ");
        int z = scan.nextInt();

        if (x > y && x > z) {
            System.out.println("The largest number is = " + x);
        } else if (y > x && y > z) {
            System.out.println("The largest number is = " + y);
        } else {
            System.out.println("The largest number is = " + z);
        }
    }
}
