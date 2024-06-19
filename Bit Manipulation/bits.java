import java.util.*;

public class bits {
    
    public static void OddEven(int n){
        int BitMask = 1;
        if((n & BitMask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int GetIthBit(int n, int i){
        int BitMask = 1<<i;
        if((n & BitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String args[]){
        System.out.println(GetIthBit(15, 2));
    }
}
