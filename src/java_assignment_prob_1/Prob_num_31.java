
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_num_31 {
    public static void main(String[] args){
    //to display factors of a number
        int n,i;
        Scanner scan= new Scanner(System.in);
        n = scan.nextInt();
        for(i=1; i<=n; i++){
            if(n%i==0){
               System.out.println(i);
            }
        }
            
        
    }
    
}
