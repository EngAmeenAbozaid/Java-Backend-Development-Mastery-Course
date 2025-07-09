package JavaSE;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Java Primitive Types vs Reference Types.
 *<p>
 * Reference Types & Wrapper Classes.
 *<p>
 * The Secret Life of Letters: ASCII & Java Characters.
 *<p>
 * String Basics.
 *<p>
 * String Creation Ways: String literal vs String Object.
 *<p>
 * String Methods.
 *<p>
 * Special Characters & Escape Sequences.
 */
public class Session3 {
    public static void main(String[] args) {
        
        /*
         ** Java Non-Primitive (Reference/Object) Data Types
         Complex data composed of primitive types & methods inside an object.
             * Collection Classes: List, Set, Vector, Stack, Dictionary
             * User-Defined Classes/interfaces/enums.
             * Predefined Classes: String, Array, Object, Wrapper Classes
         */
        
        // * Java Primitive Types vs Reference Types -> In Notion
        // * Wrapper Classes: Object/Reference versions of primitive types.
        // int -> Integer & long -> Long & boolean -> Boolean
        Integer myInt = null; // null -> means variable defined no object yet.
        System.out.println(myInt);
        
        
        /*
         ? In Java you can't use The empty variables (not initialized variables), It will result in ❌ Compile-time error: variable s might not have been initialized
         So, The solution is initializing the variable with default value if primitive DT, or assign null if
         reference DT.
        */
        
        int age;
        // System.out.println(age); // ❌ Compile-time error: variable s might not have been initialized
        age = 0; // Set the default number of the data type instead. (String -> "" & int -> 0 & float -> 0.0)
        Integer myAge; // Not Initialized Reference Variable.
        // System.out.println(myAge); // ❌ Compile-time error: Variable 'myAge' not have been initialized
        myAge = null; // Set the null value
        
        
        // * The Secret Life of Letters: ASCII & Unicode & Java Characters
        char A = 'A';
        int ascii = (int) A;
        System.out.println();
        System.out.println("ASCII of A is: " + ascii);  // Output: 65
        
        // Looping through Alphabet
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.printf("%c : %d\n", ch, (int) ch);
        }
        
        /*
         * String: a sequence of characters enclosed in double quotes
            Used to store text-based data.
            implements the `CharSequence` Interface
         */
        
        String greeting = "Hello World";
        char[] charArray = greeting.toCharArray();
        System.out.println(greeting);
        System.out.println(Arrays.toString(charArray)); // Output: [H, e, l, l, o,  , W, o, r, l, d]
        System.out.println(charArray[0]); // H -> you can retrieve one element from the charArray
        System.out.println("----".repeat(8));
        
        /*
        String -> Sequence of Arrays -> Sequence fo bytes
        Let's analyse each of them:
        1. Text (String): is stream of characters (letters series or letter chain) and symbols.
        2. Computer understand binary language (01000001)
        
        text (as a stream of character `A`) ----  What is happened here? 🤔  ----> binary (01000001)
        
        ASCII:
        It is a character encoding (changing data format) stander.
        It uses 7 bits to represents 128 characters, including uppercase & lowercase letters, numbers, punctuation marks, and
        control character
        
         * String Creation Ways:
            1. String Literal
                - Stored In String Pool (Special Area inside Heap Memory).
                - If another String Literal with the same content created, will reference the same object in the
                 String Pool.
                - Best Performance and more memory-efficiency
            2. String Object: using the `new` keyword
                - Creates a new object in Heap memory outside the String Pool
                - Even if the same content exists in the pool, it forces new memory allocation
         */
        
        // String Literal and String Object
        String str1 = "Java"; // String Literal -> Saved in the java pool.
        String str2 = "Java"; // String Literal -> Reference the same value `Java` which stored in the java Pool.
        String str3 = new String("Java"); // String Object
        String str4 = new String("Java"); // String Object
        
        System.out.println(str1 == str2); // output: true -> The same reference
        System.out.println(str1 == str3); // output: false -> different reference & same content
        System.out.println(str3 == str4); // output: false -> different reference & same content
        
        str3 = str3.intern(); // Explicitly add the string object into the string pool
        str4 = str4.intern(); // Explicitly add the string object into the string pool
        System.out.println(str3 == str4); // output: true -> str.intern()
        
        
        /*
          One of the most advantages of the Reference Data Types, that they have a useful methods.
          String Methods:
          * Retrieval:
              * length() -> Returns the length of the string
              * indexOf() -> Returns the index of the character/substring
              * lastIndexOf()
              * charAt() -> Returns the character at the given index
              * valueOf() -> Returns the string representation of a value
              * codePointAt() ->
              * describeConstable() -> Return Optional of the content
              * lines() -> Returns a stream of lines extracted from this string, separated by line terminators (\n, \r, \r\r).
              * matches(regex)

          
          * Formatting:
              * format() -> Returns a formatted string
              * toLowerCase() -> Converts characters in the string to lower case
              * toUpperCase() -> Converts characters in the string to upper case
              * concat() -> Concatenates two strings and returns it
              * replace() -> Replace all matching characters/text in the string
              * replaceFirst() -> Replace the first matching substring
              * replaceAll() -> Replace all substrings matching the regex pattern
              * split(regex) -> Splits the string at specified string(regex)
              * join() -> Joins the given strings using the delimiter
              * substring() -> Returns a substring from the given string
              * subSequence() -> Returns a subsequence from the string
              * trim() -> Removes any leading and trailing whitespace
              * strip()
              * stripIndent()
              * stripLeading()
              * stripTrailing()
              * repeat()
              * toString()
         
          * Search or Checking:
              * equals() -> Compares two strings
              * matches() -> checks whether the string matches the given regex
              * equalsIgnoreCase() -> Compares two strings ignoring case differences
              * compareTo() -> Compares two strings in the dictionary order
              * compareToIgnoreCase() -> Compares two strings ignoring case differences
              * contains() -> Checks whether the string contains a substring
              * startsWith() -> Checks if the string begins with the given string
              * endsWith() -> Checks if the string ends with the given string
              * isEmpty() -> Checks whether a string is empty or not
              * isBlank()
              * contentEquals() -> Checks whether the string is equal to charSequence.
               (Compare the text content regardless the type of the object from which they instantiated)


          * Memory:
              * getBytes() -> Encodes the string into a sequences of bytes
              * hashCode() -> Returns a hash code for the string.
               A hashcode is a number (object's memory address) generated from any object.
               Note: For two strings to be equal, their hash code also must be equal.
              * intern() -> Using .intern() to add a string object in string constant pool.
               Returns a canonical representation of the string (Make Two Strings Objects with the same content have
               the same memory address).
              * toCharArray() -> Converts the string to a char array
         */
        
        
        String name = "     Ahmed       ";
        String name2 = "Ameen";
        
        System.out.println(name.length());          // return the number of the characters in the string.
        // Transformations
        System.out.println(name.toLowerCase());     // Convert all characters to uppercase
        System.out.println(name.toLowerCase());     // Convert all characters to lowercase
        System.out.println(name.trim());            // Removes leading and trailing whitespace
        // Trim() vs Strip()
        System.out.println(
                name.strip());         // does not modify the original string; instead, it returns a new string with the leading and trailing whitespace removed
        System.out.println(name.stripIndent());   // Remove the indentation
        System.out.println(name.stripLeading());  // Remove the Leading Space (Starting white spaces)
        System.out.println(name.stripTrailing()); // Remove the Trailing Spaces (Ending white spaces)
        
        System.out.println(name.replace(" ", "-"));
        String s = "apple,banana,orange";
        String[] parts = s.split(","); // parts will be {"apple", "banana", "orange"}
        
        // Search & Checking
        System.out.println(name.equals(name2));   // Compare the string content
        System.out.println(name.contains("me"));    // Checks if a string contains a sequence
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("A"));
        System.out.println(name.isEmpty());         // Checks if string is empty ("")
        System.out.println(name.isBlank());
        
        // Retrieval
        System.out.println(name.charAt(0));         // return the character at a specific index (position)
        System.out.println(name.substring(1, 1));
        System.out.println(name.indexOf("Ah"));
        System.out.println(name.lastIndexOf("Ah"));
        
        String hello = "Hello World\nI am Ameen\n I love programming!";
        System.out.println(hello.lines()
                                .collect(Collectors.toList())); // [Hello World, I am Ameen,  I love programming!]
        
        // * String Concatenation
        String firstName = "Ameen";
        String lastName = "Abozaid";
        String fullName = firstName + " " + lastName; // Works well for small and simple cases
        System.out.println(fullName);
        fullName = firstName.concat(" ")
                            .concat(lastName);
        System.out.println(fullName);
        
        // * String Formatting: printf() vs String.format()
        System.out.printf("Name: %s | Age: %d\n", "Ameen", 27);
        String formatted = String.format("Salary: $%.2f", 10234.5);
        System.out.println(formatted);
        
        
        // * Comparing Two Strings: equal(), contains(), matches(), compareTo(), contentEquals  -> Self-Study Task
        // * Special Characters & Escape Sequences -> Self-Study Task
        
    }
}
