
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_38 {
    public static void main(String[] args){
    //to convert octal number to decimal and vice - versa
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Octal number : ");
        int octal = scan.nextInt();
        System.out.print("Decimal level of "+octal+" is : ");
        System.out.println(Integer.toOctalString(octal));

        System.out.print("Enter decimal number : ");
        String decimal = scan.next();
        System.out.print("Octal level of "+decimal+" is :");
        System.out.println(Integer.parseInt(decimal,8));
    }
    
}
