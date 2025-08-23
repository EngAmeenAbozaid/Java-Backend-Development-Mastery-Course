package JavaSE.Chapter1_6;

import java.util.Arrays;

public class Chapter4 {
    public static void main(String[] args) {
        
        // Implicit/Automatic (Widening) Casting
        int num = 100;
        double result = num; // Implicit Casting
        System.out.println(result);
        
        
        // Explicit/Manual (Narrowing) Casting
        double price = 99.99;
        int i = (int) price; // Explicit Casting using (type)
        System.out.println(i);

        
        /*
        parse() & valueOf() methods
        -----------------------------------------------------------------------
            a. valueOf() method convert from many data types into String.
        -----------------------------------------------------------------------
                String.valueOf() ->
                Integer.valueOf();
                Double.valueOf()
                Character.valueOf();
        -----------------------------------------------------------------------
            b. parse() method convert the stringified data type into the equivalent corresponding data type.
        -----------------------------------------------------------------------
                Integer.parseInt("number"); --> Used to convert stringified number into Int.
                Double.parseDouble();

        
        
        -----------------------------------------------------------------------
            c. Some Conversion Matrix:
        -----------------------------------------------------------------------
             * String -> int
                Integer.parseInt(str1);
                Integer.parseInt(str1);
             * String -> boolean
                Boolean.parseBoolean(str1);
                Boolean.valueOf(str1);

             * String -> char[]
                str.toCharArray();
             * String to Boolean: Use Boolean.parseBoolean() or Boolean.valueOf().
             * String to Date: Use SimpleDateFormat.parse().
             
             
             * int -> long
             long num = 25; // Implicit/Automatic/Widening Casting
             Long obj = Long.valueOf(55);
             * int -> String
                 String.valueOf(10);
                 String data2 = 10 + "";
             * int -> char
                 type casting
                 Character.forDigit(intNumber, radix); // radix = 10, 16 determine the Numeric System Here, 10 and 16 are radix values for decimal and hexadecimal numbers respectively.
                 
                 
             * int -> long
             * int -> double
             
             
             
             * long -> int
                 Type Casting
                 Math.toIntExact(value1);
                 Long obj = 52341241L;      Long obj = 52341241L;
             
             
             
             * Double -> int
             
             
             
             * char -> String
                 Character.toString(ch);
                 String.valueOf(ch);
             * char[] -> String
                String.valueOf(ch);
                new String(ch);
             * char -> int
             int a = (int) 'a';         // int explicit casting
             'E' - '0'; // subtracting it with character 0
             Character.getNumericValue(99);
             Integer.parseInt(ch)
             
             
             * boolean -> int
             
             * boolean -> String
                String.valueOf(true)
                Boolean.toString(false);
                
    
             * Date to String: Use SimpleDateFormat.format().

         */
        
        // * ------------ Integer ------------
        // int -> long
        int age = 28;
        long myAge = age; // Implicit/Automatic/Widening Casting
        Long obj = Long.valueOf(age); // boxing
        
        
        // int to String
        int number = 10;
        String data = String.valueOf(number);
        String data2 = 10 + ""; // Concatenating Integer with String Implicitly Converting Integer into String.
        
        
        // int to char
        int unicodeOfB = 98; // UNICODE or ASCII Value of the letter b
        char b = (char) unicodeOfB;
        
        int num1 = 1;
        int num2 = 13;
        char a = Character.forDigit(num1, 10); // for decimal value (between 0-9)
        char d = Character.forDigit(num2, 16); // for hexadecimal value (between 0-15)
        System.out.println(a);    // 1
        System.out.println(d);    // d
        
        
        // * ------------ Character ------------
        // char -> int
        char aLetter = 'a';
        int unicodeOfA = (int) aLetter; // 97
        int unicodeOfC = Character.getNumericValue(99);
        int unicodeOfD = Integer.parseInt(String.valueOf('D'));
        int unicodeOfE = 'E' - '0'; // We can also convert the character into an integer by subtracting it with
        // character 0
        System.out.println(unicodeOfA);
        
        // char -> String
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);
        
        // char array -> String
        char[] ch2 = {'a', 'e', 'i', 'o', 'u'};
//        String str = String.valueOf(ch2);
//        String str = new String(ch2);
        
        // String to char array
        String str3 = "This is great";
        
        char[] chars = str3.toCharArray();
        System.out.println(Arrays.toString(chars));
        
        // * ------------ Long ------------
        // long -> int:
        // Here, the higher data type long is converted into the lower data type int. Hence, this is called narrowing typecasting.
        // This process works fine when the value of the long variable is less than or equal to the maximum value of int (2147483647). However, if the value of the long variable is greater than the maximum int value, then there will be a loss in data.
        long myLong = 2322331L;
        int myLongConvertedIntoInt = (int) myLong; // Explicit Narrowing Typecasting
        int myLongConvertedIntoInt2 = Math.toIntExact(myLong);
        // 🚫 The toIntExact() method throws an exception if the returned int value is not within the range of the int data type.
        
        long value = 32147483648L; // value out of range of int
        int overFlow = Math.toIntExact(value); // ❌ throws the integer overflow exception
        
        // object of the Long class -> int
        Long obj2 = 52341241L;
        int intValue = obj2.intValue();
        
        // * ------------ String ------------
        // String -> Int
        String stringifiedNumber = "27";
        int parsedInt = Integer.parseInt(stringifiedNumber);
        int intNumber = Integer.valueOf(stringifiedNumber); // boxing
        
        // int num1 = Integer.parseInt(str1);
        
        
        // String -> Boolean
        String str1 = "true";
        String str2 = "false";
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.valueOf("Ahmeen"); // ❌ throws NumberFormatException
        
        
        // * ------------ Boolean ------------
        // boolean -> String
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        String stringValue1 = String.valueOf(booleanValue1);
        String stringValue2 = Boolean.toString(booleanValue2);
        
        // * ------------------------ Examples -------------------------
        // Example 1: Define primitive variables & demonstrate the widening and narrowing casting.
        // Implicit: automatic & Safe
        int missSalmaAge = 21;
        double accurateAge = missSalmaAge;
        System.out.println(accurateAge);
        
        // Explicit: manual & not safe
        // 1. Data loos
        double price3 = 33.5009;
        int priceAfterTax = (int) price3 - 2;
        System.out.println(priceAfterTax);
        // Un-expected behavior
        // Long -> Int may cause overflow
        long myLong2 = 9223372036854775807L;
        System.out.println(myLong2);
        int myInt = (int) myLong2; // overflow issue
        System.out.println(myInt);
        
        int total = myInt * 10;
        System.out.println(total);
        
        // Exception: Compiler Error
        Long object1 = 52341241L;
        // int variable2 = (int) object1; // Error-prone Code: java: incompatible types: java.lang.Long cannot be
        // converted to int
        // System.out.println(variable2);
        
        
        // Example 2:
        // average = summation/n  & percentage = (part/total) * 100.0f
        // Mohamed total score: 465 from 500
        // A: 100 & B: 90 & C: 80 & D: 75 & E: 120
        // What is the percentage of Each module?
        // What is the average score?
        
        //        // Order of Operators
        // * execution from left to write -> () -> * / % -> - + -> =
        // * Arithmetic Operators

//        int age = 16;
//        boolean isAllowed = false;
//
//        if (age >= 18) isAllowed = true;
//        else isAllowed = false;
//
//        System.out.println("Is Mohamed allowed to do this action? " + isAllowed);
        
        // x + y = z addition
        // x - y = z subtraction
        // 5 > 4

//        int zahraAge = 30;
//        int mohamedAge = 11;
//
//
//        int summation = zahraAge + mohamedAge;
//        int Subtraction = zahraAge - mohamedAge;
//        double division = (double) zahraAge / mohamedAge;
//        System.out.println(division); // 3
//        System.out.println("Summation = " + summation);
//        System.out.println("Subtraction = " + Subtraction);
//        System.out.println("Summation = " + zahraAge + mohamedAge); // concatenation
//        System.out.println("Summation = " + (zahraAge + mohamedAge));
//
//        System.out.println(20.0 / 0.0);
//
//        // 10 % 5 = 0
//        // 11 % 5 = 1
//        // 27 % 3 = 0
//        // 30 % 3 = 0
//        // 32 % 3 = 2
//
//        // Even & odd
//        // ? % 2
//        // 10 % 2 = 0 --> Even زجي
//        // 11 % 2 = 1 --> Odd فردي
//

//
//        int total = 10 * 50 + 6 - 73 + (2422/2);
//        // total = 500 + 6 - 73 + 1211;
//
//        int num1 = 54325;
//        int num2 = 5432223;
        
        // Scanner -> Input handling
//        System.out.println(); // output
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter Your Name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name + "!");
//
//        System.out.println("Enter your Age: ");
//        int age = scanner.nextInt();
//        System.out.println("Your age is " + age);
//
//        System.out.println("Enter the first number: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Enter the second number: ");
//        int number2 = scanner.nextInt();
//        System.out.println("Enter the operation like: + - / * %  ");
//        String operation = scanner.next();
//        Integer result = null;
//        if (operation.equals("+")) {
//            result = number1 + number2;
//        }
//        if (operation.equals("-")) {
//            result = number1 - number2;
//        }
//
//        System.out.println("The result: " + result);
        System.out.println("-".repeat(10));
        // * Assignment Operates =
//        double salary = 99999.99;
//        System.out.println(salary); // 99999.99
//
//        double raise = 1000.9;
////        salary = salary + raise;
//        salary += raise;
//        double deduction = 2000.0;
//        salary -= deduction; // salary = salary - deduction
//        System.out.println(salary); // 101000.89
        
        
        // Example:
//        double salary = 1000;
//        salary += 200; // salary = salary + 200;
//        System.out.println(salary); // 1200
//        salary -= 150; // salary = salary - 150
//        System.out.println(salary); // 1050
//        salary += salary * 10 / 100;
//        System.out.println(salary); // 1155.0
//        salary -= salary * 5 / 100;
//        System.out.println("Total Salary: " + salary);
//
//        // Reset Salary
//        double originalSalary = 1000;
//        double fixedIncrement = 200;
//        double fixedDeduction = 150;
//
//        double totalSalary = originalSalary + fixedIncrement - fixedDeduction;
//        double rateIncrement = totalSalary * 10 / 100;
//        totalSalary += rateIncrement;
//        double rateDeduction = totalSalary * 5 / 100;
//        totalSalary -= rateDeduction;
//        System.out.println("Total Salary: " + totalSalary);
//
//
//        System.out.println("-".repeat(10));
//        // comparison operator ==
////        System.out.println(1 == 1);
//        double ZahraSalary = 999999999.9;
//        double AmeenSalary = 199999.9;
//
//        System.out.println(ZahraSalary == AmeenSalary); // false
//        System.out.println(ZahraSalary != AmeenSalary); // true
//        System.out.println(ZahraSalary > AmeenSalary); // true
//        System.out.println(ZahraSalary >= AmeenSalary); // true
//        System.out.println(ZahraSalary < AmeenSalary); // false
//        System.out.println(ZahraSalary <= AmeenSalary); // false
//
//        // Used in the conditional statements: if, else
//        if (ZahraSalary != AmeenSalary) {
//            // Do specific business logic
//            // Adjustment the ameen salary
//            AmeenSalary = ZahraSalary;
//        }
        System.out.println("-".repeat(10));
        // * Logical Operator
        // and &&           or ||           not !
        // true && true -> true
        // true && false -> false
        // false && false -> false
        
        // true || false -> true
        // false || true -> true
        // false || false -> false
        
        // !ture -> false
        // !false -> ture
        
        int age1 = 5;
        boolean hasID = true;
        
        // AND
        if (age1 >= 18 && hasID) {
            System.out.println("Allowed to enter.");
        } else {
            System.out.println("Not allowed to enter.");
        }

//        // OR
        if (age1 < 18 || !hasID) {
            System.out.println("Not allowed.");
        }
//        // NOT
//        boolean isMember = false;
//        System.out.println("Is guest: " + !isMember);  // true
//
        
        
    }
}
