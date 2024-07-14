import java.util.*;

public class ZeroOneKnap {

    public static int KnapSack(int val[], int wt[], int cap){
        int n = val.length;
        int dp[][] = new int[n+1][cap+1];

        for(int i=0 ;i<dp.length ; i++){
            dp[i][0] = 0;
        }
        for(int j=0 ;j<dp[0].length ;j++){
            dp[0][j] = 0;
        }

        for(int i=1 ; i<(n+1); i++){
            for(int j=1; j<cap+1; j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w<=j){
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][cap];
    }
    
    public static void main(String args[]){
        int val[] = {14,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int cap = 7;
        System.out.println(KnapSack(val, wt, cap));
    }
}
