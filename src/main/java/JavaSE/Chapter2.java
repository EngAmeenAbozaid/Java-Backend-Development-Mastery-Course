package JavaSE;

/**
 * * 📦 Variables & Data Types:
 * - Storing Data: What is variable?
 * - Declaring, Initializing & Printing Variables
 * - Declaring & Initializing Multiple Variables on One Line
 * - Variable Naming Conventions & Best Practices
 * - Variable Scopes: Class/Static, Instance, Local, and Block Scope
 * - Primitive Types: int, float, char, boolean, etc.
 * - Personal Search: Constants (final) & var Keyword
 * - Output Methods: print(), println(), printf()
 */
public class Chapter2 {
    public static void main(String[] args) {
        
        // * --------------------------------------------------------
        // * Declaring, Initializing & Printing Variables:
        /*
         * What is a Java variable?
         * A reusable container for storing data values
         * A name that refers to a memory location
         *
         * Syntax:
         *  1. Declaring: <type> <name>;
         *  2. Initializing: <name> = <value>;
         *  3. Declaring & Initializing: <type> <name> = <value>;
         * --------------------------------------------------------
         */
        String name; // Declaring (define) Variable:
        // This tells the compiler to reserve memory space for a String variable named `name`.
        name = "Ahmed"; // Variable Initializing (Assigning Value to it).
        int age = 30; // Declaring & Initializing variable.
        
        age = 40; // Updating variable value.
        
        // Printing Variable Values
        System.out.println(age);                      // prints just the value
        System.out.println("Age is: " + age);         // prints a message + value
        System.out.printf("Age is: %d\n", age);       // formatted output
        
        //* Declaring & Initializing Multiple Variables on One Line
        int width = 10, height = 20, depth = 30;
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
        
        System.out.println("-".repeat(20));
        //* Variable Naming Conventions & Best Practices
        // Use meaningful and descriptive name
        int userAge = 21;
        String studentName = "Salma";
        // Start with a letter (not numbers) or _ or $
        int _configCount = 2;
        String $IP = "127.0.0.1";
        // Numbers can be used in middle or at the end of the name
        int age5;
        int last3DaysCount;
        // int 1age = 5; // error
        
        // Use camelCase
        boolean isMarried = false;
        // ! Don't use Java Reversed Keyword  (int, class, public, etc.)
        // String int = 5; // error
        
        // Note: We're always trying to write expressive and descriptive code. So, Avoid misleading and complex code.
        System.out.println("-".repeat(20));
        
        /*
         * --------------------------------------------------------
         * Variable Scope: النطاق
         * Scope defines where a variable can be accessed or used within the program.
         *    🧭 Scope = Where a variable is declared + where it can be accessed (visible) within the code.
         
         * 🔍 Types of Variable Scope in Java:
         *      Local Scope:
                    Declared inside a method or block ({})
                    Only accessible within that block
                    ❌ Cannot be accessed outside
          *     Instance Scope (Object Scope)
                    Declared inside a class but outside any method
                    Each object has its own copy
                    Accessible by all methods in the class using this.variable
          *      Class Scope (Static Scope)
                    Declared with static keyword inside a class
                    Shared among all instances of the class
                    Accessed directly by class name (e.g., ClassName.variable)
          *      Block Scope (e.g., inside loops, if/else)
                    Limited to the {} block where it’s declared
                    Exists only during the execution of that block
          * --------------------------------------------------------
         */
        class ScopeExample {
            static int classLevel = 100; // Class/Static Scope: Declared with static keyword. Shared among all instances.
            
            int instanceLevel = 50;      // Instance Scope: Declared inside a class, outside any method. Accessible through object.
            
            public void showScope() {
                int localVar = 10;       // Local Scope: Declared inside a method/block. Accessible only within it.
                
                if (true) {
                    int blockVar = 5;    // Block Scope: Declared inside {} blocks like loops or conditionals.
                    System.out.println(blockVar);
                    
                    // The blockVar it will be removed from the memory after finishing execution of the `if` block.
                }
                
                // blockVar is NOT accessible here → Error
            }
        }
        System.out.println("-".repeat(20));
        
        
        /*
           * --------------------------------------------------------
          * Java Primitive Data Types
          Simple data stored directly on the memory stack.
            1. Numbers:
                 a. Integers: Whole Numbers (byte, short, int, long)
                 b. Floating-Point: Decimal Numbers (float, double)
            2. Boolean (True, False)
            3. char (A, B)
        
         * Java Non-Primitive (Reference/Object) Data Types
         Complex data composed of primitive types & methods inside an object.
            Collection Classes: List, Set, Vector, Stack, Dictionary
            User-Defined Classes/interfaces/enums.
            Predefined Classes: String, Array, Object, Wrapper Classes
            * --------------------------------------------------------
         */
        System.out.println("-".repeat(20));
        // 1. Number Types:
        // a. Byte: 1 byte size == 8 bit --> 2^7.
        System.out.println(Byte.MAX_VALUE); // 127
        System.out.println(Byte.MIN_VALUE); // -128
        byte myByte = 100;
        byte myByte2 = 'C'; // output: 67
        // byte myByte = 1000; // Error: out of range
        
        // b. Short: 2 bytes size == 16 bit --> 2^15
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        short myShort = 32767;
        
        // c. Integer: 4 byte size == 32 --> 2^31
        // Uses as a Default of the Integer Numbers
        System.out.println(Integer.MAX_VALUE); // 2,147,483,647
        System.out.println(Integer.MIN_VALUE); // -2,147,483,648
        int myInteger = 5;
        
        // d. Log: 8 bytes size == 64 bit --> 2^63
        System.out.println(Long.MAX_VALUE); // 9,223,372,036,854,775,807
        System.out.println(Long.MIN_VALUE); // -9,223,372,036,854,775,808
        long myLong = Long.MAX_VALUE;
        long myLong2 = 222222222222L; // Capital 'L' or small 'l' indicate java that is a Long value.
        
        // e. Float size: 4 bytes & precision: ~6-7 decimal digits
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Float.MIN_EXPONENT);
        System.out.println(Float.MIN_NORMAL);
//        float myFloat = 99999999999999999999999999999999999999.14f;
        float myFloat = 0.02f;
        
        // f. Double size: 8 bytes & precision: ~15 decimal digits
        // Use double as the default for decimal numbers.
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Double.MIN_NORMAL);
        double myDouble = 0.02d;
        double myDouble2 = 0.02; // without `d` because the double is the default decimal number
        double price = 19.99;
        double gpa = 3.8;
        double temperature = -12.5;
        
        // Assignment: Search on `BigDecimal`
        
        // 2. Character
        // Represents a single 16-bit Unicode character
        // Declared using single quotes ''
        char grade = 'A'; // Characters are internally stored as numeric Unicode values (e.g., 'A' = 65)
        char symbol = '!';
        char currency = '$';
        
        // 3. Boolean 1 bit size
        // Stores only two values: true or false
        // Used for conditions, logic, and flags
        boolean isActive = true;
        boolean forSale = false;
        boolean moreThan1000 = (myInteger > 1000); // Expression Treated as a (evaluated to) boolean.
        
        if (forSale) { // condition
            // do something here
        }
        
        // * Non-Primitive Data Types:
        // 1. String: Store Text-Based Data
        String food = "pizza";
        String emil = "ameen.abozaid@ameenco.org";
        
        
        // void: void getNumber() {}; This Data type for void methods (method doesn't return any value)
        
        
        // ******* Tricky Points *******
        // Storing Char in String
        String firstLetter = "A";
        // Storing int in String
        String phone = "+201020304050";
        // Storing small int into Long variable.
        long id = 2; // Overkill & Oversize 🤔
        // Storing int in double
        double bookPrice = 22; // output: 22.0
        System.out.println("-".repeat(20));
        
        
        /*
        * --------------------------------------------------------
        * Personal Search: Constants (final) & var Keyword
            A constant is immutable/unchangeable variable -> A variable whose value cannot be changed after it is assigned.
        
        * 🧠 Why Use `final`?
            - Improves readability and intent.
            - Prevents accidental changes to critical values.
            - Useful for fixed configuration or magic numbers.
        * --------------------------------------------------------
         */
        final int MAX_USERS = 100;
        // MAX_USERS = 40; // ❌ Compilation error!
        
        final double PI = 3.14159;
        System.out.println("Pi = " + PI);
        // PI = 3.14; // ❌ Compilation error!
        
        final int MAX_ATTEMPTS = 3;
        
        /*
        * --------------------------------------------------------
        * ✅ What is `var`?
            `var` is a `local variable type inference` keyword — the compiler infers/guess the data type based on the
            * value assigned.
        
        * ⚠️ Rules:
            - Only allowed for `local variables` (inside methods).
            - Must **initialize** at declaration — no `var x;` without a value!
            - Can't be used with null values.
            - Can't be used for method parameters, class fields, or return types.
            
            
        * 🧠 When to Use `var`:
            - Makes code concise.
            - Useful when the type is obvious from the right-hand side.
            - **Not recommended** when the type is unclear — can reduce readability.
        
        * var can use with anonymous classes
         * --------------------------------------------------------
         */
        var price4 = 15.99;          // inferred as double
        var myName = "Amine";        // inferred as String
        var isAvailable = true;      // inferred as boolean
        // var data;                 // ❌ Error: Cannot use 'var' without initialization
        
        // `var` keyword maks code less verbose:
        // SimpleRemoteStatelessSessionProxyFactoryBean bean = new SimpleRemoteStatelessSessionProxyFactoryBean();
        // var bean = new SimpleRemoteStatelessSessionProxyFactoryBean();
        
        // * Output Methods: Method used to send or showing message to the user.
        // a. print() -> Plain-Text without line break (new line)
        System.out.print("Ameen");
        System.out.print("Abozaid"); // output: AmeenAbozaid
        
        // b. println() -> Plain-Text with line break (new line)
        System.out.println("Ameen");
        System.out.println("Abozaid");
        /*
          Output:
            Ameen
            Abozaid
        */
        
        // * Formatting Output:-
        /*
           c. printf() --> Formated-Text & without line-brake, so we use `\n` at the end of the formated text. It is a method used to format output.
             
             Syntax: %[flags][width/padding][.precision][specifier-character]
             % -> placeholder.
             
                 - Supports format specifiers (specifier-character):
                 - `%s` – String
                 - `%d` – Integer
                 - `%f` – Floating point number
                 - `%c` – Character
                 - `%b` – Boolean
                 
                 - Precision:
                     %.nf --> n is referring to the number of digits after the decimal point.
                     %.2f --> 2 digits after the decimal point.
                 
                 - Flags:
                     + -> Output a plus (print the number sign - or +)
                     , -> Comma Grouping Separator
                     ( --> Negative number are enclosed in parentheses ()
                     space --> Display a minus if negative, space if positive.
                 
                 - Width/Padding:
                     0 -> Zero padding
                     number -> Right justified padding
                     negative number -> Left justified padding.
         */
        
        // Example One: Illustrate the `output formatting` concept
        String name3 = "Ameen";
        int age3 = 30;
        System.out.printf(
                "My name is %s and I am %d years old.\n", name3, age3); // My name is Ahmed and I am 25 years old.
        
        System.out.printf("Price: %.2f\n", 12.4567); // 2 decimal places -> output: Price: 12.46
        System.out.println("-".repeat(20));
        
        // Example Two: Specifiers
        String name2 = "Ameen";
        int age2 = 30;
        char firstLetter2 = 'A';
        double height2 = 60.5;
        boolean isEmployed = true;
        
        //System.out.printf("Hello %s", name2); // without line break `\n`
        System.out.printf("Hello %s\n", name2); // with a line break `\n`
        System.out.printf("Your name starts with %c \n", firstLetter2);
        System.out.printf("You are %d years old.\n", age2);
        System.out.printf("You are %f inches tall.\n",
                          height2
        ); // 6 digits printed after the decimal, You are 60.500000 inches tall.
        System.out.printf("Employed: %b\n", isEmployed);
        
        // You can insert multiple variables at the same line:-
        System.out.printf("%s is %d years old.\n", name2, age2);
        
        // Example Three: Precisions
        double price1 = 9.99;
        double price2 = 10.99;
        double price3 = -54.01;
        
        System.out.printf("%f\n", price1);
        System.out.printf("%f\n", price2);
        System.out.printf("%f\n", price3);
        
        System.out.printf("%.1f\n", price1); // 10.0 -> Automatically round the output.
        System.out.printf("%.1f\n", price2); // 11.0
        System.out.printf("%.1f\n", price3); // -54.0
        
        // Example Four: Flags
        System.out.printf("%+.2f\n", price1); // -54.0
        System.out.printf("%+.2f\n", price2); // +9.99
        System.out.printf("%+.2f\n", price3); // +10.99
        
        price1 = 9000.99;
        price2 = 1000.99;
        price3 = -54000.01;
        
        // Comma Separated Numbers
        System.out.printf("%,.2f\n", price1); // 9,000.99
        System.out.printf("%,.2f\n", price2); // 1,000.99
        System.out.printf("%,.2f\n", price3); // -54,000.01
        
        // Negative enclosed in ()
        System.out.printf("%(.2f\n", price1); // 9,000.99
        System.out.printf("%(.2f\n", price2); // 1,000.99
        System.out.printf("%(.2f\n", price3); // (54000.01)
        
        // Space:
        System.out.printf("% .2f\n", price1); //  9,000.99
        System.out.printf("% .2f\n", price2); //  1,000.99
        System.out.printf("% .2f\n", price3); // -54000.01
        
        // Example Five: Width
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        
        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);
        
        // Zero Padding:
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        
        // Right Justified Padding:
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        
        // Negative Justified Padding:
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
        System.out.println("-".repeat(20));
        
    }
}
