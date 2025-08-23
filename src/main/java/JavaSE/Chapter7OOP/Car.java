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
    Date yearOfConstructing;
    String currentMovingDirection = "forward"; // left, right, forward or backward
    boolean isOn;
    // float[] dimension;
    
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
