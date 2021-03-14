
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_23 {
    public static void main(String[] args){
    //to calculate the power of a number;
        int power, num, result=1;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        power = scan.nextInt();
        
        while(power > 0){
            result = result * num;
            power--;
        }
        System.out.println(result);
    }
    
}
