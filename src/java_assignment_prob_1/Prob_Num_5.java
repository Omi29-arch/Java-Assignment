
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_5 {
    public static void main(String[] args){
     //java program to compute Quotient and remainder. 
        Scanner scan = new Scanner(System.in);
        int quotient, reminder;
        System.out.print("Enter a 1st number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter a 2nd number : ");
        int num2 = scan.nextInt();
        quotient = num1 / num2;
        reminder = num1 % num2;
        System.out.println("Quotient = "+quotient);
        System.out.println("Reminder = "+reminder);
    }
    
}
