
package java_assignment_prob_1;

import java.util.Scanner;




public class Prob_Num_8 {
    public static void main(String[] args){
    //to check whether an alphabet is vowel or consonant;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter any Alphabet : ");
        char ch = scan.next().charAt(0);
       
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
           System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
    }
    
}
