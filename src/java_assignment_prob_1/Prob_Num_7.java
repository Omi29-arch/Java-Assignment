
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_7 {
    public static void main(String[] args){
    //to check whether a num is even or odd;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = scan.nextInt();
        
         if(a % 2 == 0){
             System.out.println("This number is Even ");
         }
         else{
             System.out.println("This number is Odd");
         }
    }
    
}
