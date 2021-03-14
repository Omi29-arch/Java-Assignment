
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_11 {
       public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
           System.out.print("Enter a year = ");
           int year = scan.nextInt();
           if(year%4 == 0 && year%100 !=0){
               System.out.println("Leap Year.");
           }
           else{
              System.out.println("Not Leap Year.");
           }
           
       }   
}
