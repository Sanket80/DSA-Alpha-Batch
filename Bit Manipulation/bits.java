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

    public static int setIthBit(int n, int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }

    public static int clearIthBit(int n, int i){
        int BitMask = ~(1<<i);
        return n & BitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 1){
           return setIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static int clearlastIthBits(int n, int i){
        int BitMask = ((~0)<<i);
        return n & BitMask;
    }

    public static int clearBitsinRange(int n, int i, int j){
        int a = (~0) << (j+1);
        int b = (1<<i) -1;
        int BitMask = a | b;
        return n & BitMask;
    }

    public static void main(String args[]){
        System.out.println(clearBitsinRange(15, 1, 2));
    }
}
