import java.util.*;

public class FractionalKnap {
    
    public static void main(String args[]){
        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        for(int i=0 ; i<val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = W , finalVal = 0;
        for(int i=ratio.length-1 ; i>=0 ; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){
                capacity -= wt[idx];
                finalVal += val[idx];
            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value:"+finalVal);
    }
}
