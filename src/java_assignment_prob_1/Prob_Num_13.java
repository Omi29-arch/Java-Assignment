package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value : ");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("The charecter is Alphabet.");
        } else {
            System.out.println("The charecter is not Alphabet.");
        }
    }
}
