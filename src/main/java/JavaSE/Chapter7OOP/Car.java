package JavaSE.Chapter7OOP;

import java.util.Date;

public class Car { // Blueprint or design of cars.
    // Any class is a custom reference data type.
    
    // 1. Data Members -> named as Field/ Attribute Represented as normal variables
    String color;
    int speed;
    float width;
    float length;
    String brand;
    String yearOfConstructing;
    String currentMovingDirection = "forward"; // left, right, forward or backward
    boolean isOn;
    // float[] dimension;
    
    // Object Creation/Instantiation performed using Constructors
    // Constructor: Special method called automatically used to initialize the data member values while creating new
    // object from the class.
    
    
    // Mimic of the default constructor.
    // Default Constructor: is a no-argument constructor created by default when there is no custom constructor
    // defined. It used to initialize the objects with default values of the instance class attribute.
//    Car() {
//        this.speed = 0;
//        this.width = 0f;
//        this.length = 0f;
//        this.brand = null;
//        this.yearOfConstructing = null;
//        this.currentMovingDirection = "forward"; // left, right, forward or backward
//        this.isOn = false;
//    }
    
    // Empty Constructor: No Argument Constructor
    // We use the no arg constructor to initialize the default values.
    Car() {
        this.color = "Gray";
        this.yearOfConstructing = "2025";
        this.currentMovingDirection = "forward";
    }
    
    Car(float width, float length, int speed) {
        this();
        this.width = width;
        this.length = length;
        this.speed = speed;
    }
    
    // Parametrized Constructor
    Car(String color, int speed, float width, float length, String brand) {
        this(width, length, speed); // this() -> used to call constructor from another constructor of the same class.
        this.color = color;
        this.length = length;
        this.brand = brand;
        this.isOn = false;
    }
    // * Note: Constructor Overloading: More than once constructor of the same class but have different signature.
    // * Note: this keyword: is a java keyword used to refer to the current instantiated/created object.
    // a. used to refer to the current instantiated object's attributes (to avoid the confusion when the constructor
    // parameters and the class attributes have the same name).
    // b. check notion.
    // c. check notion.
    // * Note: this(); method: is a java method used to call constructor from another constructor of the same class.
    // this() used to avoid the redundancy & increase the reusability.
    
    
    // 2. Behavior -> named/represented as Functions/Methods
    public void makeSound() {
        System.out.println("Beb Beb Beb");
    }
    
    public void turnOn() {
        System.out.println("Car is on");
        isOn = true;
    }
    
    public void turnOff() {
        System.out.println("Car is off");
        isOn = false;
    }
    
    public void move() {
        // Determine the direction
        System.out.println("Car is moving in: " + currentMovingDirection + " direction");
    }
    
    public void turnLeft() {
        System.out.println("Car is turning left");
        currentMovingDirection = "left";
    }
    
    public void turnRight() {
        System.out.println("Car is turning right");
        currentMovingDirection = "right";
    }
    
    public void moveBackwards() {
        System.out.println("Car is moving backwards");
        currentMovingDirection = "backwards";
    }
    
    public void moveForwards() {
        System.out.println("Car is moving forwards");
        currentMovingDirection = "forwards";
    }
    
    public void breaking() {
        System.out.println("Car is breaking");
        speed = 0;
    }
    
    public void accelerating(int increment) {
        System.out.println("Car is accelerating");
        speed += increment;
    }
    
    public void decelerating(int decrement) {
        System.out.println("Car is decelerating");
        speed -= decrement;
        // speed = speed - decrement;
    }
    
}
