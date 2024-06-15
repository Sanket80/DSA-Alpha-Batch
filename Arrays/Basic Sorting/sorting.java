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

    public static void SelectionSort(int arr[]){
        int min_index;
        for(int i=0 ; i<arr.length-1 ; i++){
            min_index = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
