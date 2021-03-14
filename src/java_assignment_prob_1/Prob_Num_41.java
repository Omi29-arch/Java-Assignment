
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_41 {
    public static void main(String[] args){
    //tocalculate the power using recursion;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = scan.nextInt();
        System.out.print("Enter the power : ");
        int b = scan.nextInt();
        
        int result = power(a,b);   
  }
    public static int power(int a, int b){
    
        if(b == 0){
           return 1;
        }
        else{
           return a * power(a,b-1);
        }
    }
}
