
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_49 {
    public static void main(String[] args){
    //to find the frequency of charecter in a string;
        int a[] = new int[26];
        Scanner scan = new Scanner (System.in);
        String str = scan.nextLine();
        for(int i=0; i<str.length(); i++){
          if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
             a[str.charAt(i)-65]++;
          }
          else if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
             a[str.charAt(i)-97]++;
          }
        }
        for(int i=0; i<26; i++){
            if(a[i] > 0)
          System.out.println((char)(i+65)+ " "+a[i]);
        }
    }
    
}
