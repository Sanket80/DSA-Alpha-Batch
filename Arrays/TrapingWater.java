import java.util.*;

public class TrapingWater {
    
    public static void TrappedWater(int arr[]){
        int left_max[] = new int[arr.length];
        int right_max[] = new int[arr.length];
        int trapped_water = 0;

        left_max[0] = arr[0];
        for(int i=1; i<left_max.length ; i++){
            if(left_max[i-1] > arr[i]){
                left_max[i] = left_max[i-1];
            }else{
                left_max[i] = arr[i];
            }
        }

        right_max[right_max.length-1] = arr[arr.length-1];
        for(int i=arr.length-2 ; i>=0 ; i--){
            if(right_max[i+1] > arr[i]){
                right_max[i] = right_max[i+1];
            }else{
                right_max[i] = arr[i];
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            trapped_water += Math.min(left_max[i], right_max[i]) - arr[i];
        }
        System.out.println("Trapped Water: "+trapped_water);
    }

    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        TrappedWater(arr);
    }
}
