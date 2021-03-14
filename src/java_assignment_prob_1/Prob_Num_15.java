
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_15 {
    public static void main(String[] args){
    //to find factorial of a number. 
        int n, fact=1;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
           fact = fact * i;
        }
        System.out.println(fact);
    }
    
}
