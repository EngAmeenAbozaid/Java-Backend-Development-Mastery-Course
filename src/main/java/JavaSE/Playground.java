package JavaSE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Playground {
    int age = 10;
    
    public static void main(String[] args) {
        System.out.println("-".repeat(10));
        int age = 22;
        System.out.println("Allah with");
        
        String myName = "Ameen";
        String myName2 = new String("Ameen"); //

        
        
        
        System.out.println("-".repeat(10));
    }
    
    public static int maxProfit(int[] prices, int fee) {
        // Write your code here
        int n = prices.length;
        int lowestStockPrice = Integer.MAX_VALUE;
        int hightestStockPrice = 0;
        int maxProfit = 0;
        for (int price : prices) {
            if (price > hightestStockPrice) hightestStockPrice = price;
            if (price < lowestStockPrice) lowestStockPrice = price;
            
            int profit = 0;
            for (int i = 1; i <= 12; i++) {
                profit = price - i;
                if (profit > maxProfit) maxProfit = profit;
            }
            System.out.println(Arrays.toString(prices));
            System.out.println(hightestStockPrice);
            System.out.println(lowestStockPrice);
            System.out.println(n);
            System.out.println(maxProfit);
            
            
        }
        if (maxProfit == 0) return lowestStockPrice;
        else return maxProfit;
    }
}

// input data --> Processing () --> Output (Result)
// input data (username & password) --> processing authenticate() --> output (authorized)