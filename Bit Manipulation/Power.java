import java.util.*;

public class Power {
    
    public static boolean isPower2(int n){
        if((n & (n-1)) == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        System.out.println(isPower2(64));
    }
}
