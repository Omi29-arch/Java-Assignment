
package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_43 {
    public static void main(String[] args){
    //to find largest element of an arrays
        int num[], size, large;
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        
        num = new int[size];
        
        for(int i=0; i<num.length; i++){
           num[i] = scan.nextInt();
        }
        large = num[0];
        for(int i=1; i<num.length; i++){
           if(large<num[i]){
              large = num[i];
           }
        }
        System.out.println(+large);
    }
    
}
