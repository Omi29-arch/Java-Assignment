
package java_assignment_prob_1;

public class Prob_Num_35 {
    public static void main(String[] args){
    //to find Factorial of a number using recursion;
        System.out.println(factorial(10));
    }
    public static int factorial(int n){
       if(n == 1){
          return 1;
       }
       else{
          return n * factorial(n - 1);
       }
    }
    
}
