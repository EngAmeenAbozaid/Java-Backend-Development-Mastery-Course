package JavaSE.Chapter1_6;

public class Chapter6TicketSystem {
    // attributes/variables
    // methods/functions
    
    public static double calculatePrice(int age) {
        // logic here
        if (age < 5) return 0;
        else if (age <= 12) return 10;
        else if (age <= 18) return 15;
        else if (age < 60) return 20;
        else return 0;
    }
    
    public static void main(String[] args) {
        int age = 120;
        double price = calculatePrice(age);
        System.out.println("The price is: " + price);
    }
    
}
