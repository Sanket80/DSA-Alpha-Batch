public class Tiling {
    
    public static int NoOfways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = NoOfways(n-1);
        int fnm2 = NoOfways(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(NoOfways(4));
    }
}
