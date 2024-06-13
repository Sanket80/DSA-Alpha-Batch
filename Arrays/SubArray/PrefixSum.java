import java.util.*;

public class PrefixSum {
    
    public static void SubArraySum(int arr[]){
        int prefixsum[] = new int[arr.length];
        prefixsum[0] = arr[0];
        int current_sum = 0,max_sum = Integer.MIN_VALUE;
        for(int i=1; i<arr.length ; i++){
            prefixsum[i] = prefixsum[i-1]+arr[i];
        }

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                int start = i, end = j;
                current_sum = start == 0? prefixsum[end] : prefixsum[end] - prefixsum[start-1];
                if(current_sum > max_sum){
                    max_sum = current_sum;
                }
            }
        }

        System.out.println("Maximum Sum: "+max_sum);
    }

    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        SubArraySum(arr);
    }
}
