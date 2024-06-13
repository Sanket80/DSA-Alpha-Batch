import java.util.*;

public class Kadane {
    
    public static void KadaneAlgo(int arr[]){
        int current_sum = 0, max_sum = Integer.MIN_VALUE, max_no = Integer.MIN_VALUE;
        int neg_nos = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < 0){
                neg_nos++;
            }
        }
        if(neg_nos == arr.length){
            for(int i=0 ; i<arr.length ; i++){
                if(arr[i] > max_no){
                    max_no = arr[i];
                }
            }
            System.out.println("Max Sum:"+max_no);
        }
        else{
            for(int i=0 ; i<arr.length ; i++){
                current_sum += arr[i];
                if(current_sum < 0){
                    current_sum = 0;
                }
                max_sum = Math.max(current_sum, max_sum);
            }
            System.out.println("Max Sum:"+max_sum);
        }
        
    }

    public static void main(String args[]){
        //int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {-1,-2,-3,-4};
        KadaneAlgo(arr);
    }
}
