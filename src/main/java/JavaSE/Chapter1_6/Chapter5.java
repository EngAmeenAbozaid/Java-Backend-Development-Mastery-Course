package JavaSE.Chapter1_6;

public class Chapter5 {
    
    public static void main(String[] args) {
        
        /**
         * * Control Flow
         * What is the meaning of flow?
         * The default execution flow of the code: Start by the main class -> main method
         * Execution line by line from top to bottom, every line start from the left to write.
         * </p>
         * * Controlling the flow of the coding execution is by routing the coding based on conditional statements &
         *  controlling the number of repeating the code block execution by using the looping mechanisms.
         */
        // 1. Conditional Statements
        System.out.println("-".repeat(10));
        int score = 85;
        // Example 1
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: c");
        } else if (score < 60 && score > 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Grade: Zero");
        }
        // Example 2
        checkScore(score);
        // Example 3
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }
        // Example 4
        String name = "Ahmed";
        switch (name) {
            case "Ahmed":
                System.out.println("Ahmed");
                break;
            case "Zahra":
                System.out.println("Zahra");
                break;
            case "Allaa":
                System.out.println("Allaa");
                break;
            case "Kamel":
                System.out.println("Kamel");
                break;
            default:
                System.out.println("Invalid name");
        }
        System.out.println("-".repeat(10));
        // 2. Loops
        Boolean isMarried = true;
        while (isMarried) {
            System.out.println("Married");
        } // Error: Infinity loop
//         Any loops must have 3 elements:
//         a. Start & condition & break
//         Use while loop to iterate many times when you don't know how many times the code will run
//         Loop over condition
//         check on the condition first: if ture do the logic else break.
        int counter = 1;
        while (counter <= 1000) {
            System.out.println(counter);
            counter++; // update, break or Step
        }
        
        boolean isServerDown = false;
        while (!isServerDown) {
            // Http request
            //check serviceStatus = true
            isServerDown = true;
        }
        // retrying policy
        
        // b. do while
        // Execute first then check the condition: if ture repeat, if not ture break.
        int counter2 = 1;
        do {
            System.out.println(counter2);
            counter2++;
        } while (counter2 <= 1000);
        
        // c. For loop
        // for (start; condition; update)
        // Used when the number of iteration is known
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        
        int[] numbers = {10, 6, 74, 32, 100, 19};
        System.out.println(numbers.length);
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(i);
        }
        
        // d. For-Each loop (Enhanced for)
        // Used to loop over the data of iterable data type.
        // for (dataType element: elements)
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    
    public static String checkScore(int score) {
        // Ternary Operator
        // condition ? trueBlock : falseBlock
        return score >= 90 ? "Grade A" : score >= 80 ? "Grade B" : score >= 70 ? "Grade C" : score < 60 && score > 0 ? "Grade: F" : "Grade: Zero";
        
    }
}
