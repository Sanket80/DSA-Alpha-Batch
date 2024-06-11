import java.util.*;

public class Reverse {
    
    public static void reverse(int numbers[]){
        int start = 0, end = numbers.length-1;
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--; 
        }
    }

    public static void main(String args[]){
        int numbers[] = {2, 5, 7, 8,9,56};

        reverse(numbers);
        System.out.print("Reversed Array: ");
        for(int i=0 ; i<numbers.length ; i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
