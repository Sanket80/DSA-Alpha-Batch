public class CatalanNo {

    public static int CatlanRec(int n){
        int dp[] = new int[n+1];
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int ans = 0;
        for(int i=0 ; i<n ;i++){
            dp[n] = ans += CatlanRec(i)*CatlanRec(n-i-1);
        }
        return ans = dp[n];
    }

    public static int CatalanTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n ;i++){
            for(int j=0 ; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
 
    public static void main(String args[]){
        int n = 4;
        System.out.println(CatlanRec(n));
        System.out.println(CatalanTab(n));
    }
}
