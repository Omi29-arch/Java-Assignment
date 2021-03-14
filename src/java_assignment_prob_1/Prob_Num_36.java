
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_36 {
    public static int gcdRe(int num1,int num2){
       if(num2==0){
          return num1;
       }
       else{
         return gcdRe(num2,num1%num2);
       }
    }
    public static void main(String[] args){
    //to find G.C.D using recursion;
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(gcdRe(num1,num2));
    }
    
}
