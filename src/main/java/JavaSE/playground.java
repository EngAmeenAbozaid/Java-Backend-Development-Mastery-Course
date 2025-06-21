package JavaSE;

public class playground {
    public static void main(String[] args) {
        // main(); is the Executable method

//        if (args.length != 0) System.out.println(args[0]);
        
        // Single-line comment: forward slashes
        
        /*
        Multi-line comments
        */
        
        // * Java Output:
//        System.out.println("Enter your name: ");
        // receive name and store it
        // processing
        // result of processing
        
        System.out.println("-".repeat(20));
        // * Java Output Methods: print(); & println(); & printf();
        // print(): used to display data without line-break (new-line)
        System.out.print("I Love Coding");
        System.out.print("I am a Java Developer");
        System.out.println("\n+" + "-".repeat(20));
        
        // println(): used to display data with line-break (new-line)
        System.out.print("I Love Coding\n");
        System.out.print("I am a Java Developer\n");
        
        System.out.println("I Love Coding");
        System.out.println("I am a Java Developer");
        
        System.out.print("I am Ameen Abozaid \nI am working as a Senior Java Developer\n");
        
        
        // printf(): Formatted Output without line-break
        // System.out.printf("I am %s, I am %d years old\n",  age, name); // error-prone code
        System.out.println("\n+" + "-".repeat(20));
        /*
        * Syntax: %[flags][width/padding][.precision][specifier-character]
         % -> placeholder.
        *
        * - Supports format specifiers (specifier-character):
         - `%s` – String
         - `%d` – Integer
         - `%f` – Floating point number
         - `%c` – Character
         - `%b` – Boolean
         *
         *  - Precision: used withs the Floating-point (decimal) data
         %.nf --> n is referring to the number of digits after the decimal point.
         %.2f --> 2 digits after the decimal point.
         * - `%f` – Floating point number
         *
         *
         * - Flags:
         + -> Output a plus (print the number sign - or +)
         , -> Comma Grouping Separator
         ( --> Negative number are enclosed in parentheses ()
         space --> Display a minus if negative, space if positive.
         *
         *   - Width/Padding:
         0 -> Zero padding
         number -> Right justified padding
         negative number -> Left justified padding.
        * */
        
        String name = "Salma";
        int age = 26;
        char firstCharacter = 'S';
        double height = 74.1;
        boolean isMarried = false;
        
        System.out.printf("Hello %s, Your name start with (%c), You are %d years old, you are %f cm tall, Is you " +
                                  "Married: " +
                                  " %b\n",
                          name,
                          firstCharacter, age, height, isMarried);
        
        double price1 = 9.99;
        double price2 = 10.99;
        double price3 = -54.01;
        System.out.printf("Your heighten: %.4f \n", height);
        System.out.printf("The Care Price is: %,.9f\n", price1); // 9,000,000.990000000
        System.out.printf("The Care Price is: %,.9f\n", price2); //
        System.out.printf("The Care Price is: %,.9f\n", price3); //
        
        System.out.println("\n+" + "-".repeat(20));
        System.out.printf("The Care Price is: %+f\n", price1);
        System.out.printf("The Care Price is: %+f\n", price2);
        System.out.printf("The Care Price is: %+f\n", price3);
        
        System.out.println("\n+" + "-".repeat(20));
        System.out.printf("The Care Price is: %(f\n", price1);
        System.out.printf("The Care Price is: %(f\n", price2);
        System.out.printf("The Care Price is: %(f\n", price3);
        
        System.out.println("\n+" + "-".repeat(20));
        System.out.printf("The Care Price is: % f\n", price1);
        System.out.printf("The Care Price is: % f\n", price2);
        System.out.printf("The Care Price is: % f\n", price3);
        
        System.out.println("\n+" + "-".repeat(20));
        // Example Five: Width
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);
        
        System.out.printf("%07d\n", id1);
        System.out.printf("%07d\n", id2);
        System.out.printf("%07d\n", id3);
        System.out.printf("%07d\n", id4);
        
        System.out.printf("%7d\n", id1);
        System.out.printf("%7d\n", id2);
        System.out.printf("%7d\n", id3);
        System.out.printf("%7d\n", id4);
        
        System.out.printf("%-7d\n", id1);
        System.out.printf("%-7d\n", id2);
        System.out.printf("%-7d\n", id3);
        System.out.printf("%-7d\n", id4);
        // 00022
        System.out.println("\n+" + "-".repeat(20));
        
    }
    
    
    String expression = "System.out.println(\"Ahmed Ameen\";)";
    
}

// input data --> Processing () --> Output (Result)
// input data (username & password) --> processing authenticate() --> output (authorized)