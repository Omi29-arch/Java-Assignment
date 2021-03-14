
package java_assignment_prob_1;

import java.util.Scanner;


public class Prob_Num_48 {
    public static void main(String[] args){
    //to find transpose of a matrix;
        Scanner scan = new Scanner(System.in);
        int m[][] = new int[10][10];
        System.out.print("Enter the rows and colums : ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        for(int i=0; i<a; i++){
          for(int j=0; j<b; j++){
            m[i][j] = scan.nextInt();
          }
        }
        int transpose[][] = new int[10][10];
        for(int i=0; i<b; i++){
          for(int j=0; j<a; j++){
           transpose[j][i] = m[i][j];
          }
        }
        System.out.println("Transpose of the given number is : ");
        
        for(int i=0; i<a; i++){
           for(int j=0; j<b; j++){
            System.out.printf("%d\t", transpose[i][j]);
           }
           System.out.println();
        }
    }
    
}
