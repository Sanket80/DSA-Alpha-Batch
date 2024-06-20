import java.util.*;

public class fibonacci {
    
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fibo(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        if(n==1 || n==0){
            return n;
        }
        for(int i=2 ; i<=n ; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public static void main(String args[]){
        System.out.println(fib(6));
        System.out.println(fibo(6));
    }
}
