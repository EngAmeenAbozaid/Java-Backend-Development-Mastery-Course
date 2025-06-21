package JavaSE;

/**
 * - Output Methods: print(), println(), printf()
 * - Input Handling: Scanner
 */
public class Session2 {
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
        
        System.out.println("-".repeat(20));
        /*
        c. printf() --> Formated-Text & without line-brake, so we use `\n` at the end of the formated text. It is a method used to format output.
        
        Syntax: %[flags][width][.precision][specifier-character]
        % -> placeholder.
         
         - Supports format specifiers:
            - `%s` – String
            - `%d` – Integer
            - `%f` – Floating point number
            - `%c` – Character
            - `%b` – Boolean
        */
        
        // Example One:
        String name = "Ameen";
        int age = 30;
        System.out.printf(
                "My name is %s and I am %d years old.\n", name, age); // My name is Ahmed and I am 25 years old.
        
        System.out.printf("Price: %.2f\n", 12.4567); // 2 decimal places -> output: Price: 12.46
        System.out.println("-".repeat(20));
        
        // Example Two:
        String name2 = "Ameen";
        int age2 = 30;
        char firstLetter = 'A';
        double height = 60.5;
        boolean isEmployed = true;
        
        //System.out.printf("Hello %s", name2); // without line break `\n`
        System.out.printf("Hello %s\n", name2); // with a line break `\n`
        System.out.printf("Your name starts with %c \n", firstLetter);
        System.out.printf("You are %d years old.\n", age2);
        System.out.printf(
                "You are %f inches tall.\n",
                height
        ); // 6 digits printed after the decimal, You are 60.500000 inches tall.
        System.out.printf("Employed: %b\n", isEmployed);
        
        // You can insert multiple variables at the same line:-
        System.out.printf("%s is %d years old.\n", name2, age2);
        
        
        System.out.println("-".repeat(20));
    }
}
