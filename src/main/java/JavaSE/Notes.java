package JavaSE;

public class Notes {
}






/*
------------- Draft Area -------------





Let's analyse each of them:
1. Text (String): is stream of characters (letters series or letter chain) and symbols.
2. Computer understand binary language (01000001)

text (as a stream of character `A`) ----  What is happened here? 🤔  ----> binary (01000001)



It is a character encoding (changing data format) stander.
It uses 7 bits to represents 128 characters, including uppercase & lowercase letters, numbers, punctuation marks, and
 control character










* Java Module:


* a. Core Java:-




- Java Data Type:
	- Primitive vs Reference Data Types.
	- Primitive Data Types: byte -> short -> int -> long -> float -> double   Boolean, and char
	- Java Numbers: integer & floating point (decimal)
	- Boolean
	- characters & ASCII representation.
	- Non-Primitive types & Wrapper classes: String, Int, Float, Long.. etc.
	
	    - primitive stored in stack, reference stored in the stack.
	    - primitive data stored directly in the Stack, for reference the types the stack holds pointer(reference/address) to the object in heap
	    - When setting a reference type equal to another reference type variable, a copy of only the pointer is made.
	    - certain object types can't be manipulated on the heap.
	    - in reference types: even value is the same, they will point to separate object in the heap.
	    int [] e = {5, 6, 7, 8}
	    int [] f = {5, 6, 7, 8}

- Java Type Casting and Type conversion:
	- Type Casting vs. Type Coercion vs. Type Assertion vs. Type Inference.
	- Java Type Casting: Widening Casting (automatically/ Implicitly) & Narrowing Casting (manually/explicitly)
	-

- Java Operators
	- Java divides the operators into the following groups:
	- Arithmetic operators
	- Assignment operators
	- Comparison operators
	- Logical operators
	- Bitwise operators
	
- Java String
	- String builtin Reference Data Type.
	- String Methods: length(), toUpperCase(), toLowerCase(), indexOf()
	- String Concatenation: + operator, concat();
	- Adding Number + String.
	- Special Characters: Escape sequences
	- String Formatting: printf()
	
 
- Java Boolean
    - Concept: yes/no operation
    - binary representation (0,1)
    
	
- Java Conditions (Control Statements):
    - Conditional Operator Review
    - if
    - if else
    - Short hand if: ternary operator
    - Switch Case: case, break default
    
- Java Looping and Iteration:
    - While Loop
    - Do wile loop
    - For loop
    - Nested loops
    - For-Each loop
    - Stream.forEach(), Stream.map()
    - Break/Continue.
	
- Java Methods (Functions):
    - Main method: main()
    - Static Method.
    - Method return type: void, built-in datatypes, custom types.
    - Method parameters and arguments.
    - Method Overloading (OOP Concept).
    - Final Method (OOP Concept)
    - Java Method Scopes: Block Scope, General Scopes.
    - Java Recursion & Halting Condition
    - varargs


- Java OOP & Programming Paradigms
    - What is the OOP? Why Java is OOP? Why we use the OOP?
    - Other Programming Paradigms (Coding Styles): Functional, Procedural, Even-Driven.
    - Object/Class meaning.
    - Class Data Members: Class Attributes (filed) & Methods (Functions): final attribute.
    - Class Constructors & Type of Constructors.
    - Class Modifiers:
        - Access Modifiers: Public, Private, Protected, default (Package Protected)
        - Non-Access Modifiers:  final, static, abstract, transient, synchronized, volatile.
            - Static class, method, attribute.
            - Final Class, Final Method, Final Attribute.
        
    - OOP Concepts: Encapsulation, Inheritance, Polymorphism, Abstractions.
    - Encapsulation: (private & getters/setters) & Why Encapsulation? read-only/write-only attribute.
    - Inheritance: Subclass and Superclass & `extend` keyword
    - Polymorphism: Overriding & Overloading. There is no polymorphism without inheritance.
    - Abstraction:
        ~ Abstract (without implementation/body) Class & Method
        ~ Interface: default method. Interface inheritance (extend/implement)
        ~ Concrete Class.
        ~ Abstract Class vs Interface
    
    - Aggregation vs composition vs association
    - Java dynamic binding vs Static binding
    - Instance Initializer Block.
    - Anonymous Classes.
    - Singleton Class
    - Wrapper Classes
    
    
    - Java Inner Class: nest classes (a class within a class) & Access Outer Class From Inner Class
    - Java Packages:
        Built-in Packages (packages from the Java API)
        User-defined Packages (create your own packages)
        Import Class or Package from Library: library vs framework & classpath.
        - Fully Qualified Class Name & Classpath
        
- Java Enums
- Java Math:
    Math.max(x,y);
    Math.min();
    Math.sqrt(x);
    Math.abs(x);
    Math.random()
    The real-life usage example: sum(), dev().
    
- Java Date and Time:
    - LocalDate & LocalTime & LocalDateTime & DateTimeFormatter
    - Display Current Date: LocalDate.now();
    - Display Current Time: LocalTime.now();
    - Display Current Date and Time: LocalDateTime.now();
    - Formatting Date and Time: DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        yyyy-MM-dd	"1988-09-29"
        dd/MM/yyyy	"29/09/1988"
        dd-MMM-yyyy	"29-Sep-1988"
        E, MMM dd yyyy	"Thu, Sep 29 1988"
    

- Java Data Structure/ Java Collections:
    - Meaning of Collection
    - Its Benefits
    - Each DS Covers: Adding & Access Item & Removing & Change or Alter an Item & get the element items size & Loop through the DS. & Sorting & Searching & Is-Indexed? & Reverse the Order if possible & used built-in method.
        ~ Core Interfaces:
            - Arrays:
                - Array Declaration.
                - Access The Array Elements.
                - Loop Through an Array.
                - Multidimensional Arrays.
                - Change Element Value.
                - Loop Through a Multi-Dimensional Array
            - List
            - Set
            - Map
            
       ~ Common Implementations:
            - ArrayList
            - LinkedList
            - HashSet
            - TreeSet
            - HashMap
            - TreeMap
    - Java Iterator: Iterate Over (Looping Through) Collections
    - Java Wrapper Classes.
    - Generics & Type Inference
    
* b. Advanced Java:-

- Java Streams:
- Java RegEx
        - Pattern Class - Defines a pattern (to be used in a search)
        - Matcher Class - Used to search for the pattern
        - PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

- Java Exception Handling:
        - Bug vs Exception
        - Type of Exceptions
        - try, catch, finally block
        - Try with resources.
        - Multi-Catch Block.
        - Exception Propagation.
        - Built-in & Custom Exceptions
        -
        - throw vs throws keyword
    
    
    
- Java Functional Programming:
    - Inline Inner Class.
    - Functional Interface
    - Java Lambda Expression.
    
- Java Advanced Sorting (Comparator and Comparable)
        - compare() & compareTo()
        -

- Java File Handling:
        Pre-Requirements: Java Packages
        - file.io methods: canRead() & canWrite() & createNewFile() & delete() & exists() & getName() & getAbsolutePath() & length() & list() & mkdir()
        - Create/Write to files.
        - Read File
        - Write File (Scanner)
        - Java Delete File/Folder.
        
        
        

- Java Compilation, Memory Management & Memory Handling:
    - JDK, JRE, JVM.
- Java Concurrency & Multithreading:
    - Thread & run() & start()
    - Runnable
    - Concurrency Problems
    - Check Thread life: isAlive()



- Java Practical Labs & Problems Solving:
    - Add to numbers
    - Find Factorials
    - Count words
    - Reverse a String
    - Sum of Array Elements
    - Convert String to Array
    - Sort an Array
    - Find Array Average
    - Find Smallest Element
    - ArrayList Loop, hashMap Loop
    - Loop through Enum.
    - Area of Rectangle.
    - Even or Odd Number.
    - Positive or Negative number.
    - Square Root.
    - Random Number.





Search on:
	- Call by type & Call by reference? Java use which of them
    - string bool string reference.
    - Is a Relationship on OOP
    - Web-Sockets & Real-time Communication
    - Block chain & Time-Series DB.
    - Qarkus or Micronaut
    - Web Services SOAP, GraphQL.. etc.
    - WSO2 Identity Server o Keycloak (protocolli OAuth2 / OpenId), API Manager, Integration Platform
    - NIST (or similar) framework for developing secure code
    - JConsole
    - cmd command-line
    - "Top 10 Security Hacking":  both common attack types and notable hackers. Common attacks include phishing, ransomware, SQL injection, and DDoS attacks. Notable hackers include Kevin Mitnick, Jonathan James, and Albert Gonzalez, among others. Additionally, the OWASP Top Ten identifies critical web application security risks.
    - BE Web Penetration Testing.
	
	querydsl
	
	
	
	
	Steps:
	- Knowledge Gathering: search and std & practice -> creating the java full course
	- Teaching
	- Personal Branding + Comparator Analysis
	- Content Creating: Learn how to create video content and digital e-learning techniques
	- Personal Branding + Events.
	- Linux Administration, Nginx, Apache2
	- Software Development Lifecycle, Distributed Architectures (REST, SOAP, Queue-based), and Microservices Architecture
	- Software project management tools similar to Agile, Maven, and Git
	- Terms: Cloud-hosting technologies: AWS & Saas: Software as a services. PaaS
	- telecommunications (SMSC, VOIP, SMPP,etc)
	
	
	
	
	
	💡Study feeding your brain & Work eating your brain. You must balance. Keep Learning Keep Growing.
	
	
	
	Your Marketing Idea for your first video -->>
	قصة طفولتك وتغلقك بالكميوتر - ترك اللغب والإستكشاف بماهية عمل الكميورتر..
	طلب من والدك الحاقك بوكورس لكن الظروف المادية لا تحالفك
	تكبر وتحاول التعلم ولكن أنى لك هذا لم تصلط ثقافة التعليم الذاتي..
	محاولة دخولك كلية حاسبات لا يحالفك القدر
	دخولك الكلية العلوم وتفوقك بها. ولكن هناك تساؤل قديم لم يخمد بعد ولم يحل..
	تعلمك البرمجة مع نفسك بجوار الكلية
	تعلقك بمجال البرمجة ومحاولة الشيفت كرير.
	حريقة بداخلك تكمل فين ورسوخك في النهاية لأخذ الخطوة الجريئة..
	ذهابك للتعلم والسفر في ذلك.
	عملك بالعديد من كبريات الشركات..
	اكمالك لدراستك الأكاديمة
	وشغفك لأيصال ما تعلمته وتسهيل الطريق لقادمين والمحاربين الجدد.
	عافر.. هتوصل بفضل الكريم..
	
	
	Your idea and your mindset growing rapidly, The idea is just a spark in your head for something great you must follow. Ideas taking time to be mature and evolution.
 
 
 */

