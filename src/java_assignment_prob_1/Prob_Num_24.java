
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_24 {
    public static void main(String[] args){
    //to check whether a num is palindrome or not;
    int num=123, rev=0;
    int temp=num;
        
        
        while(num > 0){
            rev = rev*10;
            rev = rev + (num%10);
            num = num / 10;
           
        }
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
