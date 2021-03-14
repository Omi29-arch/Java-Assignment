package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_Num_25 {

    public static void main(String[] args) {
        //to check whether a num is prime or not;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }

}
