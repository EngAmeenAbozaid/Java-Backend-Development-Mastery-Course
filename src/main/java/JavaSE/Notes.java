package JavaSE;

public class Notes {
}






/*
------------- Draft Area -------------

divide the course into modules -> chapters -> lessons

Agile methodology

soap vs rest



* Java Module:


* a. Core Java:-

Introduce Local Variable -> CTL + Alt + V
Suggestions -> ctl + space


Static Utility Methods:
    Static Method of Arrays, String, List
    Arrays.deepToString()
    List.of() --> preferred when only one element passed
    Arrays.asList() --> and the rest methods of the Arrays class
    Collections.sort(); --> and the rest methods of the Collection class
    
    Collections.sort() vs listElement.sort(String::compareTo)
    Collections.sort() vs listElement.sort(String::compareToIgnoreCase)
	
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
        - Project: KVM Add Role ID & Add new Role Entries.
        
        
        

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



1. Java Programming
  Strong understanding of Java 8+ features (Streams, Lambdas, Optionals).
   Object-Oriented Programming (OOP), exception handling, collections, and multithreading.
 2. Spring Framework
   Spring Core (IoC, Dependency Injection)
   Spring Boot (auto-configuration, starter dependencies, actuator)
   Spring MVC (RESTful APIs, controllers, validation)
   Spring Data JPA (Repositories, Entity relationships, HQL/JPQL)
   Spring Security (authentication, authorization, JWT, OAuth2)
   
3. Database
   Relational: MySQL, PostgreSQL
   ORM: Hibernate / JPA
  
4. API Design
   RESTful API development
   JSON/XML serialization
   Swagger/OpenAPI documentation
Frontend (Angular)
   TypeScript
   Angular CLI (creating components, services, modules)
   Components & Templates (data binding, event handling)
   Directives & Pipes
   Services & Dependency Injection
   Routing & Navigation (Route guards, lazy loading)
   Forms (Reactive Forms & Template-driven)
   HTTP Client (GET, POST, error handling)
   State Management (RxJS, Observables, optionally NgRx)
  Angular Material or Bootstrap for UI components
  Responsive Design using CSS Flexbox/Grid




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

