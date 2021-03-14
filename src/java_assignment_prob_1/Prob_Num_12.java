
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_12 {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = scan.nextInt();
        
        if(a > 0){
           System.out.println("The number is Positive.");
        }
        else{
         System.out.println("The number is Negative.");
        }
    }
    
}
