public class Car {
    // Fields (Attributes)
    private String model;
    private String color;
    private int year;

    // Constructor
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Methods (Behaviors)
    public void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    public void startEngine() {
        System.out.println("Engine started for " + model);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Toyota Camry", "Red", 2020);
        Car car2 = new Car("Honda Accord", "Blue", 2019);

        // Using methods of the Car class
        car1.displayDetails();
        car1.startEngine();

        car2.displayDetails();
        car2.startEngine();
    }
}
