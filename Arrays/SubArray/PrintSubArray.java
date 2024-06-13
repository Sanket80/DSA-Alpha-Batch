import java.util.*;

public class PrintSubArray {
    
    public static void printsubarray(int arr[]){
        int ts =0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                int start = i,end = j;
                int current_sum = 0;
                for(int k=start ; k<=end ; k++){
                    System.out.print(arr[k]+",");
                    current_sum += arr[k];
                }
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum Sum of SubArrays: "+max_sum);
        System.out.println("Total Subarrays: "+ts);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printsubarray(arr);
    }
}
