import java.util.*;

public class BinarySearch {
    
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while (start<=end) {
            int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,7,8,9,15};
        int key = 8;

        int index = binarySearch(numbers, key);
        if(index == -1){
            System.out.println("Number not found!");
        }else{
            System.out.println("Number found at index:"+index);
        }
    }
}
