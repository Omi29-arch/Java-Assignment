
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_17 {
    public static void main(String[] args){
     //to display fibonacci series;
        int a=0, b=1,n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=1; i<n; i++){
             int sum = a + b;
             System.out.print(sum+" ");
             a = b;
             b = sum;
        }
    }
    
}
