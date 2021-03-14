
package java_assignment_prob_1;

public class Prob_Num_42 {
    public static void main(String[] args){
    //to calculate Avarage using arrays;
        int[] num = {120,150,170,190,220,250};
        double avg;
        int sum = 0;
        for(int i=0; i<num.length; i++){
           sum = sum+num[i];
        }
        avg = sum/num.length;
        System.out.println("The Average of given numbers : "+avg);
     }
    
}
