package JavaSE;

import java.util.Arrays;

public class Chapter6 {
    public static void main(String[] args) {
        System.out.println("-".repeat(10));
        // Function: reusable named block of code, take data parameters (input) & performing processing & return output.
        // Method Arguments: list of values passed to the method when calling/invoking it.
        // Method Parameters: List of input method variables.
        // Method Signature: the definition of the method (method name & return types & number and types of the
        // method parameter list).
        Name:
        {
            System.out.println("My Name is Ahmed Ameen");
            System.out.println("I love Java");
        } // Named Block of code
        
        int[] prices = {2, 4, 654, 8, 9};
        maxProfit(prices, 1);
        maxProfit(prices, 3);
        maxProfit(prices, 31);
        maxProfit(prices, 15);
        maxProfit(prices, 71);
        
        
        String[] students = {"Mohamed", "Salma", "Zahra", "Alaa", "Omar"};
        getStudentByIndex(students, 1); // call/invoke method
        getStudentByIndex(students, 2); // call/invoke method
        getStudentByIndex(students, 4); // call/invoke method
        
        int studentIndex = getStudentIndexByName(students, "Salma");
        int studentIndex2 = getStudentIndexByName(students, "Omar");
        System.out.println(studentIndex);
        System.out.println(studentIndex2);
        
    }
    
    // Inputs: students & index
    // Outputs: Name
    static void getStudentByIndex(String[] students, int index) {
        System.out.println(students[index - 1]);
    }
    
    // Input: Students & Student Name
    // Output: Student Index
    static int getStudentIndexByName(String[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == name) return i;
        }
        return 0;
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
    
    public static double maxProfit(int[] prices, double fee) {
        return 0.0;
    }
    
    double maxProfit(double prices) {
        // Do logic Here
        return 0.0;
    }
    
    String myMethod(int parameter) {
        // inputest
        // Processing
        return "Ahmed"; // outputs
    }
}
