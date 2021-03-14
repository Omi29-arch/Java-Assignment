
package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_37b {
    public static void main(String[] args){
    //decimal to binary vice-versa;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        int decimal = scan.nextInt();
        System.out.print("Binary equivalent of "+decimal+" is : ");
        System.out.println(Integer.toBinaryString(decimal));

        System.out.print("Enter Binary number : ");
        String binary = scan.next();
        System.out.print("Decimal equavalent of "+binary+" is :");
        System.out.println(Integer.parseInt(binary,2));
    }
    
}
