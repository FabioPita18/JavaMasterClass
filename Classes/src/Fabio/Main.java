package Fabio;

public class Main {
    public static void main(String[] args) {
        // creating objects
        Car mercedes = new Car();
        Car Audi = new Car();
        mercedes.setModel("AMG"); // calling setModel and pass the parameter and updating it with object AMG.
        System.out.println("Model is " + mercedes.getModel());
    }
}
