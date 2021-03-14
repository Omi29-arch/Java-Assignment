
package java_assignment_prob_1;


public class Prob_Num_46 {
    public static void main(String[] args){
    //multiply two matrix using multi-dimentional arrays;
        int a[][] = {
                      {1,2,3},
                      {4,5,6}
                    };
        int b[][] = {
                      {7,8}, 
                      {9,10},
                      {11,12}
                    };
        int sum=0;
        int r[][] = new int[2][2];
        for(int i=0; i<2; i++){
          for(int j=0; j<2; j++){
              for(int k=0; k<3; k++){
                 sum = sum + a[i][k]*b[k][j]; 
              }
              r[i][j] = sum;
              sum=0;
          }
        }
        for(int[] i:r){
           for(int j : i){
              System.out.print(+j+ " ");
           }
           System.out.println();
        }
    }
    
}
