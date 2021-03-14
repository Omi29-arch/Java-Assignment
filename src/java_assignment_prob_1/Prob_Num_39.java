
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_39 {
    public static void main(String[] args){
    //binary num to octal number and vice-versa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int binary = scan.nextInt();
        System.out.print("Octal level of "+binary+" is : ");
        System.out.println(Integer.toOctalString(binary));

        System.out.print("Enter octal number : ");
        String octal = scan.next();
        System.out.print("Binary level of "+octal+" is :");
        System.out.println(Integer.parseInt(octal,8));
    }
    
    
}
