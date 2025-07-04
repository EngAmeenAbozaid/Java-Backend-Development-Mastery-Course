package JavaSE;

/**
 * - Output Methods: print(), println(), printf()
 */
public class Session3 {
    public static void main(String[] args) {
        
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
        String name = "Ameen";
        int age = 30;
        System.out.printf(
                "My name is %s and I am %d years old.\n", name, age); // My name is Ahmed and I am 25 years old.
        
        System.out.printf("Price: %.2f\n", 12.4567); // 2 decimal places -> output: Price: 12.46
        System.out.println("-".repeat(20));
        
        // Example Two: Specifiers
        String name2 = "Ameen";
        int age2 = 30;
        char firstLetter = 'A';
        double height = 60.5;
        boolean isEmployed = true;
        
        //System.out.printf("Hello %s", name2); // without line break `\n`
        System.out.printf("Hello %s\n", name2); // with a line break `\n`
        System.out.printf("Your name starts with %c \n", firstLetter);
        System.out.printf("You are %d years old.\n", age2);
        System.out.printf("You are %f inches tall.\n",
                          height
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
        
        //* Reference/Object DTs: String, Array, List, Set, Stack, Vector, Dictionary, user-defined classes
        
        // * Wrapper Classes
        // * Java Primitive Types vs Reference Types
        // * Clean Code principles.
    }
}
