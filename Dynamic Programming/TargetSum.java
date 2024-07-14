import java.util.*;

public class TargetSum {
    
    public static boolean targetSum(int nums[], int target){
        int n=nums.length;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int i=0 ;i<n+1 ;i++){
            dp[i][0] = true;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<target+1; j++){
                int v = nums[i-1];
                if(v<=j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];
    }
    
    public static void main(String args[]){
        int nums[] = {4,2,7,1,3};
        int target = 10;
        System.out.println(targetSum(nums, target));
    }
}
