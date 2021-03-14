
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_num_16 {
    public static void main(String[] args){
    //Genarate multiple table;
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" * " +i+ " = " +(num*i));
        }
    }
    
}
