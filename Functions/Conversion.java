package Functions;
import java.util.*;

public class Conversion {

    public static void binToDec(int n){
        int binNo = n;
        int pow = 0;
        int dec = 0;
        while (n>0) {
            int lastDig = n%10;
            dec = dec + (lastDig * (int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("Conversion of " + binNo + " to " + dec);        
    }

    public static void DectoBin(int n){
        int DeciNo = n;
        int pow = 0;
        int bin =0 ;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem* (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Conversion of " + DeciNo + " to " + bin);        
    }
    public static void main(String args[]){
        binToDec(1011);
        DectoBin(111);
    }
}
