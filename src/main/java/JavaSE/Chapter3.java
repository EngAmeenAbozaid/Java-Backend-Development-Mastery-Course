package JavaSE;

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
public class Chapter3 {
    public static void main(String[] args) {
        
        /*
         * * Java Non-Primitive (Reference/Object) Data Types
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
        Integer yourAge; // Not Initialized Reference Variable.
        // System.out.println(yourAge); // ❌ Compile-time error: Variable 'yourAge' not have been initialized
        yourAge = null; // Set the null value
        
        
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

              

          
          * Formatting & Manipulation:
              * format() -> Returns a formatted string
              * toLowerCase() -> Converts characters in the string to lower case
              * toUpperCase() -> Converts characters in the string to upper case
              * concat() -> Concatenates two strings and returns it
              * repeat()
              * toString()
              
              * replace() -> Replace all matching characters/text in the string
              * replaceFirst() -> Replace the first matching substring
              * replaceAll() -> Replace all substrings matching the regex pattern
              
              * join() -> Joins the given strings using the delimiter
              * split(regex) -> Splits the string at specified string(regex)
              * substring() -> Returns a substring from the given string
              * subSequence() -> Returns a subsequence from the string
              * trim() -> Removes any leading and trailing whitespace
              
              * strip()
              * stripIndent()
              * stripLeading()
              * stripTrailing()

         
          * Search or Checking:
              * matches(regex) -> checks whether the string matches the given regex
              * regionMatches() -> Compares specific regions of two strings (advanced use)
              * contains(substring) -> Checks whether the string contains a substring
              * startsWith() -> Checks if the string begins with the given string
              * endsWith() -> Checks if the string ends with the given string
              * isEmpty() -> Checks whether a string is empty or not
              * isBlank()
              
          
          * Comparing:
              * equals() -> Compares two strings
              * equalsIgnoreCase() -> Compares two strings ignoring case differences
              * compareTo() -> Compares two strings in the dictionary order
              * compareToIgnoreCase() -> Compares two strings ignoring case differences
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
              
              
              Notes:
                 indexOf() =X charAt() & substring(match,startIndex, endIndex)
                 split() =X join()
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
        String sentences = "I love programming & I love Java & I love coding & I Love problem solving";
        System.out.println(sentences.length()); // 17
        System.out.println(name.charAt(0));         // return the character at a specific index (position)
        System.out.println(name.substring(1, 1));
        System.out.println(name.indexOf("Ah"));
        System.out.println(name.lastIndexOf("Ah"));
        
        System.out.println(sentences.indexOf("love")); // 2
        System.out.println(sentences.indexOf("love")); // 37
        System.out.println(sentences.indexOf("love", 24));
        System.out.println(sentences.indexOf("love", 6, 30));
        
        String hello = "Hello World\nI am Ameen\n I love programming!";
        System.out.println(hello.lines()
                                .collect(Collectors.toList())); // [Hello World, I am Ameen,  I love programming!]
        System.out.println(hello.lines()
                                .toList());
        
        // Example: Determine the number of occurrence of the substring "love" and retrieve the index of the 3 rd one
        // if possible
        System.out.println(Chapter3.getSearchIndex(sentences, "love", 1));
        System.out.println(Chapter3.getSearchIndex(sentences, "love", 2));
        System.out.println(Chapter3.getSearchIndex(sentences, "love", 3));
        System.out.println(Chapter3.getSearchIndex(sentences, "love", 4));
        System.out.println(Chapter3.getSearchIndex(sentences, "programming", 1));
        System.out.println(Chapter3.getSearchIndex(sentences, "&", 1));
        
        // * String Concatenation
        String firstName = "Zahra";
        String middleName = "Hamdy";
        String lastName = "Ameen";
        
        String fullName = firstName + " " + middleName + " " + lastName; // Works well for small and simple cases
        String fullName2 = firstName.concat(" ")
                                    .concat(middleName)
                                    .concat(" ")
                                    .concat(lastName);
        
        System.out.println(fullName);
        System.out.println(fullName2);
        
        String[] students = {"Salma", "Zahra", "Alaa", "Omer", "Mohamed"};
        String result = "";
        for (String std : students) {
            result = result.concat(std)
                           .concat(" ");
//            System.out.println(std);
        }
        System.out.println(result);
        
        // * String Formatting: printf() vs String.format()
        System.out.printf("Name: %s | Age: %d\n", "Ameen", 27);
        String formatted = String.format("Salary: $%.2f", 10234.5);
        System.out.println(formatted);
        
        /*
         * Comparing Two Strings: equal(), equalsIgnoreCase(), contains(), matches(), compareTo(), contentEquals  ->
         Self-Study Task
         * * Data/Variable Comparing:
         * 1. Primitive DTs:
         * Primitive Data Types always compare based on value only.
         *       compare via (==) operator.
         *
         * 2. Reference DTs:
         * Reference compare base on Reference/Address/Pointer & Value.
         *       compare via str.equals(); --> Compare based on value.
         *       compare via (==) operator. --> Compare based on reference.
         *       str1.equals(str2) -> compare exact value of two strings (case-sensitive)
         *       str1.equalsIgnoreCase(str2) -> compare exact value of two strings (case-insensitive)
         *       str1.compareTo() -> Lexicographical Comparison & determine the relative order
         * (lexicographical/Unicode order) between two strings | Help with sorting
         * System.out.println("a".compareTo("c")); // -2 --> This means the letter (a) is behinds the letter (c) with
         * two positions.
         *       compareToIgnoreCase
         *       sb.contentEquals(): Value Equality with Any CharSequence (like StringBuilder, StringBuffer)
         */
        
        // Primitive Data Types always compare based on value.
        int myAge = 27;
        int myAge2 = 27;
        int myAge3 = 29;
        System.out.println(myAge == myAge2); // compare based on value: true
        System.out.println(myAge == myAge3); // compare based on value:  false
        
        // ? Compare References:
        
        // Note: in two string literal variables have the same value, the value saved in central space called string
        // pool and each of them point to the same address memory.
        // But in String Object: we use the `new` keyword to create (allocate) new object with different reference.
        String myName = "Ahmed Ameen"; // String Literal
        String myName2 = "Ahmed Ameen"; // String Literal
        String myName3 = new String("Ahmed Ameen"); // String Object
        String myName4 = new String("Ahmed Ameen"); // String Object
        
        System.out.println(myName == myName2); // compare base on reference: true due to each of them (a. String
        // Literal & b. stored in the memory heap, specifically in the String pool).
        System.out.println(myName == myName3); // compare base on reference: false
        System.out.println(myName3 == myName4); // compare base on reference: false: string object each value
        // stored separately on an object in the memory heap --> using `new` keyword: this means create new object
        // (space in the memory heap) and stored the string on it.
        
        // ? Compare Values:
        System.out.println("-".repeat(10));
        System.out.println(myName.equals(myName2)); // compare the value of 2 String literals -> true
        System.out.println(myName.equals(myName3)); // compare the value of 2 String literals -> ture
        System.out.println(myName.equals(myName4)); // Create new scratch file from selection -> true
        
        System.out.println(myName2.equals(myName)); // Create new scratch file from selection -> true
        System.out.println(myName2.equals(myName3)); // Create new scratch file from selection -> true
        System.out.println(myName2.equals(myName4)); // Create new scratch file from selection -> true
        
        
        System.out.println(myName3.equals(myName)); // Create new scratch file from selection -> true
        System.out.println(myName3.equals(myName2)); // Create new scratch file from selection -> true
        System.out.println(myName3.equals(myName4)); // Create new scratch file from selection -> true
        
        System.out.println(myName4.equals(myName)); // Create new scratch file from selection -> true
        System.out.println(myName4.equals(myName2)); // Create new scratch file from selection -> true
        System.out.println(myName4.equals(myName3)); // Create new scratch file from selection -> true
//
        
        // * Ignore Case in General
        // toUpperCase() toLowerCase();
        String zhara = "Zahra";
        String zhara2 = "zahrA";
        System.out.println(zhara2.equals(zhara2)); // false
        System.out.println(zhara2.equalsIgnoreCase(zhara2)); // true -> zahra,equal(zahra)
        
        // * Splitting and Joining
        String greeting2 = "Hello World!";
        String[] splittedGreeting = greeting2.split(" "); // [Hello, World!]
        System.out.println(Arrays.toString(splittedGreeting));
        
        String joinedString = String.join(" ", "Hello", "World!");
        System.out.println(joinedString);
        
        
        // * Converting toString
        int age3 = 20;
        String convertedAge = String.valueOf(age3);
        System.out.println(convertedAge);
        
        /*
            * Replacing:
                Replace: Replace target with new replacement value in all occurrences.
                ReplaceAll: Replace regex (Regular Expression) with new replacement value in all occurrences.
                ReplaceFirst: Replace regex (Regular Expression) with new replacement value in first occurrences only.
         */
        String regex = "\\w";
        System.out.println("Ahmed1234!@$!@^HamdyAhmed".replace("Ah", "?"));
        System.out.println("Ahmed1234!@$!@^Hamdy".replaceAll(regex, "?"));
        System.out.println("Ahmed1234!@$!@^Hamdy".replaceFirst(regex, "?"));
        
        String file = "report.v1.pdf";
        String updated = file.replaceFirst("\\.", "_");
        System.out.println(updated); // Output: report_v1.pdf
        
        // * Special Characters & Escape Sequences -> Self-Study Task
        String text = "\t\tAhmed\nHamdy\nAmeen \\";
        String quote = "Mouhamed Says \"Quote Here\" ";
        System.out.println(quote);
        System.out.println(text.lines());
        text.lines()
            .forEach(line -> System.out.println(line));
        text.lines()
            .forEach(System.out::println);
        
        
    }
    
    /**
     * Custom method to demonstrate how comparison and searching logic like indexOf works.
     * It shows how to manually find the nth occurrence of a word in a sentence.
     *
     * @param sentence The sentence to search in.
     * @param searchWord The word to look for.
     * @param occurrence The specific occurrence number to find.
     * @return The found word with its position (1-based index), or a message if not found.
     */
    public static String getSearchIndex(String sentence, String searchWord, int occurrence) {
        String lowerCaseSentence = sentence.toLowerCase();
        String[] words = lowerCaseSentence.split(" ");
        int position = 0;
        int matchCount = 0;
        
        for (String word : words) {
            position++;
            if (word.equals(searchWord.toLowerCase())) {
                matchCount++;
                if (matchCount == occurrence) {
                    return word + " " + position;
                }
            }
        }
        
        if (matchCount > 0 && occurrence > matchCount) {
            return "Out of Range";
        }
        
        return "No match found";
    }
    
    /**
     * Demonstrates how indexOf can be used to locate the nth occurrence of a substring.
     * This approach works directly on the sentence string, not word-by-word.
     *
     * @param sentence The sentence to search within.
     * @param searchWord The word or substring to search for.
     * @param occurrence The nth occurrence to locate.
     * @return The starting index of the nth occurrence, or a message if not found.
     */
    public static String getSearchIndexByIndexOf(String sentence, String searchWord, int occurrence) {
        String lowerCaseSentence = sentence.toLowerCase();
        searchWord = searchWord.toLowerCase();
        int index = -1;
        int fromIndex = 0;
        
        for (int i = 0; i < occurrence; i++) {
            index = lowerCaseSentence.indexOf(searchWord, fromIndex);
            if (index == -1) {
                return "No match found or Out of Range";
            }
            fromIndex = index + searchWord.length(); // Move past the last found index
        }
        
        return "Found at index: " + index;
    }
}
