package PS;

import java.util.Scanner;

public class MaxProfit {
    
    public static int maxProfit(int[] prices, int n) {
        if (n == 0) return 0;
        
        int minPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        
        for (int i = 1; i < n; i++) {
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        // If no profit is possible, return the lowest price of the day
        return (maxProfit <= 0) ? minPrice : maxProfit;
    }
    
    public static void main(String[] args) {
        // Read input values from stdin
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        
        // Call maxProfit and display the result
        int result = maxProfit(prices, n); // ✅ Fixed: passed `n`
        System.out.println(result);
    }
}