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

    public static void main(String args[]){
        OddEven(10);
        OddEven(16);
        OddEven(7);
    }
}
