import java.util.*;

public class sorting {

    public static void BubbleSort(int arr[]){
        int n = arr.length, temp;
        boolean swapped = false;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=0; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
        printArr(arr);
    }
}
