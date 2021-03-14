
package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_19 {
    public static void main(String[] args){
    //to find LCM of two numbers;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int g=0;
        for(int i=1; i<=a; i++){
           if(a%i==0 && b%i==0){
              g = i;
           }
        }
        int lcm = a*b/g;
        System.out.println("LCM = "+lcm);
    }
}
