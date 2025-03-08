// DecoyDuck class extending the Duck base class
public class DecoyDuck extends Duck {

    // Constructor to set specific behaviors for DecoyDuck
    public DecoyDuck() {
        quackBehaviour = new Mute();      // Assigning mute behavior (no quacking capability)
        swimBehaviour = new Drowning();   // Assigning drowning behavior (not an active swimmer)
        flightBehaviour = new Fall();     // Assigning falling behavior (no flight capability)
    }

    // Method to display the type of duck
    @Override
    public void display() {
        System.out.println("I am Decoy Duck !!");
    }
}
