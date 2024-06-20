import java.util.*;

public class Occurance {

    public static int firstocc(int arr[] , int i , int key){
        if(i == arr.length){
            System.out.println("Key not Found!");
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstocc(arr, i+1, key);
    }

    public static int lastocc(int arr[], int i , int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastocc(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstocc(arr, 0, 5));
        System.out.println(lastocc(arr, 0, 5));
    }
}
