
package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_50 {
    public static void main(String[] args){
    //to count the num of vowels and consonants in a sentence;
        Scanner scan = new Scanner(System.in);
         String str = scan.nextLine();
         str = str.toLowerCase();
         int vowels = 0, consonants = 0;
         
         for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels++;
            }
            else if(c >= 'a' && c <= 'z'){
               consonants++;
            }
            
         }
         System.out.println("Vowels : "+vowels);
         System.out.println("Consonants : "+consonants);
    }
    
}
