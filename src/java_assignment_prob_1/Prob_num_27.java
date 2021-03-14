package java_assignment_prob_1;

import java.util.Scanner;

public class Prob_num_27 {
    public static void main(String[] args){

    //to check Armstrong number;
    int num = 153 , count = 0;
    int temp = num;
    int r, sum=0;
    Scanner scan = new Scanner(System.in);
    num = scan.nextInt();

    while(num>0){
      r = num % 10;
      num = num /10;
      sum = sum + r*r*r;
    }
    if(temp == sum){
       System.out.println("Armstriog number");
    }
    else{
       System.out.println("Not an Armstrong number");
    }

    

    }

}
