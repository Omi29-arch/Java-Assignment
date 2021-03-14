
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_22 {
    public static void main(String[] args){
    //to reverse a number
        int re=0, reminder=0,num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        
        while(num >= 1){
             reminder = num%10;
             re = re*10+reminder;
             num = num/10;
        }
        System.out.println(re);
    }
    
}
