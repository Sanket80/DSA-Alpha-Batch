import java.util.*;

public class LongestSubsequence {

    public static int LCA(String str1, String str2, int n, int m){
        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0 ; j<m+1 ; j++){
                dp[i][j] = -1;
            }
        }
        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = LCA(str1, str2, n-1, m-1)+1;
        }else{
            int ans1 = LCA(str1, str2, n-1, m);
            int ans2 = LCA(str1, str2, n, m-1);
            return dp[n][m] = Math.max(ans1, ans2);
        }
        return dp[n][m];
    }

    public static void main(String args[]){
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(LCA(str1, str2, str1.length(), str2.length()));
    }
}
