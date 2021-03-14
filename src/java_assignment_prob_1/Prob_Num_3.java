
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_3 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        float num1, num2, mul;

        System.out.print("Enter the first number : ");
        num1 = scan.nextFloat();
        
        System.out.print("Enter the second number : ");
        num2 = scan.nextFloat();
        
        mul = num1 * num2;
        
        System.out.println("Multiple = "+mul);
        
        
        
    }
    
}
