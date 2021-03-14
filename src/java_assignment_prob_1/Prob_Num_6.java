
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_6 {
    public static void main(String[] args){
    //java program to swap two numbers;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st value : ");
        int a = scan.nextInt();
        System.out.print("Enter the 2nd value : ");
        int b = scan.nextInt();
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    } 
    
}
