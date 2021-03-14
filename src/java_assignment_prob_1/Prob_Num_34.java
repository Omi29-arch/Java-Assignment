
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_34 {
    public static int SumOfNumbers(int input){
    
        if(input<=1){
            return input;
        }
        else{
            return input + SumOfNumbers(input-1);
        }
    }
    public static void main(String[] args){
    //to find the sum of natural numbers using recursion'
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input<0){
           System.out.println("Invalid number");
        }
        else{
           int result = SumOfNumbers(input);
           System.out.println("Sum of Numbers "+input+ " is "+result);
        }
    }
    
}
