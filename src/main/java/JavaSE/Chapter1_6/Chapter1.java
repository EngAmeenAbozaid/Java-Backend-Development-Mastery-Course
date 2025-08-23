package JavaSE.Chapter1_6;

/**
 * Session Topics:
 * - Java first class.
 * - Java Hello World 💪🔥
 * - How Java Works - Compilation & Execution.
 * - JDK, JRE and JVM.
 * - Java main() method.
 * - main() Signature.
 * - args what? why? (String [] args, String args [], String ...args -> VarArgs)
 * - main() method is the entry point of execution, JVM searching for it.
 * <p>
 * - Comments: Single-line, Multi-line
 * <p>
 * <p>
 * Assignments:
 * - Write program that shows your name, age, your phone price.
 * - Search: Can we overload the main() method?
 */


public class Chapter1 {
    /**
     * Java's main() method is the starting point (entry point) from where the JVM starts the execution of a Java program.
     * The main method can contain code to execute or call other methods, and it can be placed in any class that's
     * part of a program.
     *
     * @param args Array of Command-line Arguments passed to the program at the runtime. The `args` it is not fixed and
     *             the user can use any name in place of it.
     */
    public static void main(String[] args) { // Change the name of `args`
        // Create Playground Class
        
        // Hello World 🔥
        System.out.println("I Love Java Development");
        
        // Print command-line arguments
        for (String s : args) {
            System.out.println(s);
        }
        
        // inline/single-line Comment
        /*
            Multi-line Comment
        */
        
        
        // return 0; // Error
        

    }
    
}


