// RedHeadDuck class extending the Duck base class
public class RedHeadDuck extends Duck {

    // Constructor to set specific behaviors for RedHeadDuck
    public RedHeadDuck() {
        quackBehaviour = new Quack();      // Assigning quack behavior
        swimBehaviour = new SwimWithLegs(); // Assigning swimming behavior
        flightBehaviour = new Fly();       // Assigning flight behavior
    }

    // Method to display the type of duck
    @Override
    public void display() {
        System.out.println("I'm a red head duck !!");
    }
}
