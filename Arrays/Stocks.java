import java.util.*;

public class Stocks {
    
    public static void calcProfit(int stock_price[]){
        int buying_price = Integer.MAX_VALUE , selling_price;
        int profit = 0;

        for(int i=0 ; i<stock_price.length ; i++){
            buying_price = Math.min(buying_price, stock_price[i]);
            profit = Math.max(profit,(stock_price[i] - buying_price));
        }
        System.out.println("Maximum Profit: "+profit);
    }

    public static void main(String args[]){
        int stock_price[] = {10,3,8,2,1};
        calcProfit(stock_price);
    }
}
