
package java_assignment_prob_1;

import java.util.Scanner;




public class Prob_Num_10 {
    public static void main(String[] args){
     //to find all roots of a Quadratic Equation;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = scan.nextDouble();
        
        System.out.print("Enter b : ");
        double b= scan.nextDouble();
        
        System.out.print("Enter c : ");
        double c = scan.nextDouble();
        
        double determinant = b*b - 4*a*c;
        
        if(determinant > 0){
            double root1 = (-b + Math.sqrt(determinant))/(2*a);
            double root2 = (-b - Math.sqrt(determinant))/(2*a);
            System.out.println("Root1 = "+root1);
            System.out.println("Root2 = "+root2);
        }
        else if(determinant == 0){
            double root = -b / (2*a);
            System.out.println("Root1 = "+root+ "= Root2");
        }
        else{
             double real = -b / (2*a);
             double img = Math.sqrt(-determinant) / (2*a);
             System.out.println("Root1: " + real + " + i" +img);
             System.out.println("Root1: " + real + " - i" +img);
    }
        
    }
}   