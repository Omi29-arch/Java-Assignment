
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_21 {
    public static void main(String[] args){
    //to count Number of digits in an integer;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count=0;
        
        while(num > 0){
             num = num / 10;
             count++;
        }
        System.out.println("Number of Digits in an Integer = " +count);
    }
    
}
