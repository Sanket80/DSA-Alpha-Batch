import java.util.*;

public class NextGreater {
    
    public static void nextgreater(int arr[], int greaterElement[]){
        Stack<Integer> s = new Stack<>();
    
        for(int i = arr.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                greaterElement[i] = -1;
            }else{
                greaterElement[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int greaterElement[] = new int[arr.length];
        nextgreater(arr, greaterElement);

        for(int i=0 ; i<greaterElement.length ; i++){
            System.out.print(greaterElement[i]+" ");
        }
    }
}
