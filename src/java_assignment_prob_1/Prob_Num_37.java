
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_37 {
    public static void main(String[] args){
    //to convert binary num to decimal;
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        int decimal = 0;
        int x = 1;
        int rem, num;
        while(binary != 0){
           rem = binary % 10;
           decimal = decimal + rem*x;
           binary = binary / 10;
           x = x*2;
        }
        System.out.println(decimal);
    }
    
}
