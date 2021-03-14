package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_18 {

    public static void main(String[] args) {
        //to find GCD of two numbers;
        int n1, n2, gcd = 1;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextInt();

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
