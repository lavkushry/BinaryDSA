package Array;
import java.util.*;
import java.io.*;
import java.lang.*;
//Program of Stock buy and Sell Geeks for Geeks
public class Stock_buy_and_Sell {

    static int Max_profit(int price[],int start,int end)
    {
        if(end <= start){
            return 0;
        }
        int profit=0;
        for (int i = start; i <end ; i++) {
            for (int j = i+1; j <end; j++) {
                if(price[j]>price[i])
                {
                    int curr_profit=price[i]-price[j]+ + Max_profit(price, start, i - 1) + Max_profit(price, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }

            }
        }
        return profit;
    }
    static int Max_profit_Efficient(int price[],int n){
        int profit=0;
        for (int i = 1; i <n ; i++) {
            if(price[i] > price[i-1])
            {
                profit+=(price[i]-price[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] price={1,5,3,5,8,12};
        int start=0;
        int end=5;

        System.out.println(Max_profit(price, 0, end));
        System.out.println(Max_profit_Efficient(price, 5));
    }
}
