
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2, Add;
        System.out.print("Enter the first number : ");
        num1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        num2 = scan.nextInt();
        Add = num1 + num2;
        System.out.print("ADD = "+Add);
    }
    
}
