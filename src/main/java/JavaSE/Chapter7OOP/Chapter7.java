package JavaSE.Chapter7OOP;

import com.sun.tools.javac.Main;

import java.util.Date;

public class Chapter7 {
    /**
     * Programming Paradigms
     *
     *
     */
    
    public static void main(String[] args) {
        // 1. Default Constructor Usage:
        System.out.println("-".repeat(10));
        Car myCar = new Car(); // Object Creation/Instantiation
        Car misZahraCar = new Car(); // Object Creation/Instantiation
        Car drAlaaCar = new Car(); // Object Creation/Instantiation
        Car engKamelCar = new Car(); // Object Creation/Instantiation
        
        
        // Object Value Assignment
        myCar.color = "Gray";
        myCar.brand = "Honda";
        myCar.speed = 170;
        myCar.length = 2.30f;
        myCar.width = 1.7f;
//        myCar.yearOfConstructing = new Date("20-10-2020");
        myCar.turnOn();
        myCar.move();
        myCar.turnOff();
        
        misZahraCar.color = "Red";
        misZahraCar.brand = "Jeep";
        misZahraCar.speed = 170;
        misZahraCar.length = 2.30f;
        misZahraCar.width = 1.7f;
//        misZahraCar.yearOfConstructing = new Date("20-10-2026");
        misZahraCar.turnOn();
        misZahraCar.move();
        misZahraCar.turnOff();
        
        drAlaaCar.color = "Genzary";
        drAlaaCar.brand = "Honda";
        drAlaaCar.speed = 170;
        drAlaaCar.length = 2.30f;
        drAlaaCar.width = 1.7f;
//        drAlaaCar.yearOfConstructing = new Date("20-10-2025");
        drAlaaCar.turnOn();
        drAlaaCar.move();
        drAlaaCar.turnOff();
        
        engKamelCar.color = "Blue";
        engKamelCar.brand = "Honda";
        engKamelCar.speed = 170;
        engKamelCar.length = 2.30f;
        engKamelCar.width = 1.7f;
//        engKamelCar.yearOfConstructing = new Date("20-10-2020");
        engKamelCar.turnOn();
        engKamelCar.move();
        engKamelCar.turnOff();
        
        System.out.println("-".repeat(10));
        // 2. Use the Parametrized Constructor
        Car misSalmaCar = new Car("Green", 50, 170f, 2f, "Honda");
        Car watenCar = new Car(1f, 1.5f, 10);
        System.out.println(misSalmaCar.color);
        System.out.println(myCar.color.equals(misZahraCar.color)); // Each object has its value.
        
        
        
        
    }
}
