
package java_assignment_prob_1;


public class Prob_Num_45 {
    public static void main(String[] args){
    //add to matrix using Multi-dimentional arrays;
        int rows=2, colums=3;
        int a[][] = {
                     {1,2,3},
                     {7,8,9}
                    };
        int b[][] = {
                      {4,5,6},
                      {1,2,4}
                    };
        int[][] sum = new int[rows][colums];
        
        for(int i=0; i<rows; i++){
           for(int j=0; j<colums; j++){
               sum[i][j] = a[i][j] + b[i][j];
           }
        }
        System.out.println("The sum of two matrix are : ");
        
        for(int[] row: sum){
           for(int colum: row){
             System.out.println(colum + "\t");
           }
           System.out.println();
        }
    }
    
}
