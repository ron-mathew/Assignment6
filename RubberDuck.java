// RubberDuck class extending the Duck base class
public class RubberDuck extends Duck {

    // Constructor to set specific behaviors for RubberDuck
    public RubberDuck() {
        quackBehaviour = new Squeak();   // Assigning squeaking behavior
        swimBehaviour = new Floating();  // Assigning floating behavior
        flightBehaviour = new Fall();    // Assigning falling behavior (no flight capability)
    }

    // Method to display the type of duck
    @Override
    public void display() {
        System.out.println("I am Rubber Duck !!");
    }
}
