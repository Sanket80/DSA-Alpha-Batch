
import java.util.*;

public class linearSearch {
    
    public static int linearsearch(int numbers[], int key){
        for(int i=0 ; i<numbers.length ; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {1,5,8,2,6,3};
        int key = 2;
        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.println("Number not found!");
        }else{
            System.out.println("Number found at index: "+index);
        }
    }
}
