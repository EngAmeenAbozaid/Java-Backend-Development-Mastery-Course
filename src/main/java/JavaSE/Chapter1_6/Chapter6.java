package JavaSE.Chapter1_6;

import java.util.Arrays;

public class Chapter6 {
    public static void main(String[] args) {
        System.out.println("--".repeat(20));
        greet();
        
        // Can i Write method here? So far no.
        
        // 2. Method Call/Invoke/Execution
        int result = addNumbers(1, 5);
        System.out.println("result: " + addNumbers(1, 9));
        System.out.println("result: " + result);
        System.out.println("result: " + addNumbers(2, 44, 5));
        
        int result2 = addNumbers(2, 6, 634, 572, 78, 8);
        int result3 = addNumbers(2, 6, 8, 10);
        int result4 = addNumbers(2, 6, 8);
        System.out.println("result2: " + result2);
        System.out.println("result2: " + result3);
        System.out.println("result2: " + result4);
        // Overloading: multiple method with the same name but different signature (method name + parameter list)
        // method signature (method name + parameter list) controls the uniqueness of the method.
        // Recursion: Method that call itself.
        
        System.out.println("--".repeat(20));
    }
    
    // 1. Method Definition
    public static int addNumbers(int n1, int n2) {
        // Methods take inputs -> Process It -> Return result (Output)
        System.out.println("Allah with me");
        if (n1 == 0 & n2 == 0) return 0; // Method used to end the execution earlier.
        return n1 + n2; // Method can have more than one return statement but with conditionally triggered using
        // control statements.
    }
    
    public static double addNumbers(int n1, double n2) {
        return (double) n1 + n2;
    }
    
    public static double addNumbers(double n1, int n2) {
        return n1 + n2;
    }
    
    public static int addNumbers(int... numbers) {
        System.out.println(Arrays.toString(numbers));
        // Receive multiple values using VarAgrs -> Array of parameters
        int result = 0;
        // loop on the array & accumulate values (+=).
        for (int number : numbers) {
            result += number;
        }
        // Return the addition result
        return result;
    }
    
    public static int addNumbers(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    
    // Method without input or output
    public static void greet() {
        System.out.println("Hello World! I am Ameen"); // Method body
        // int x = addNumbers(2,3); // You can reuse the method form anywhere
        return; // return used to ends the method execution
    }
}
