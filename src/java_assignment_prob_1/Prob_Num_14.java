
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_14 {
    public static void main(String[] args){
    //to calculate the sum of Natural numbers.
        int n, sum=0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i=1; i<=n; i++){
          sum = sum + i;
        }
        System.out.println("The sum of natural numbers : "+sum);
    }
    
}
