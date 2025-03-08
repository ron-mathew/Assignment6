public class MallardDuck extends Duck {

    // Constructor to set specific behaviors for MallardDuck
    public MallardDuck() {
        quackBehaviour = new Quack();       // Assigning quack behavior
        swimBehaviour = new SwimWithLegs(); // Assigning swimming behavior
        flightBehaviour = new Fly();        // Assigning flight behavior
    }

    // Method to display the type of duck
    @Override
    public void display() {
        System.out.println("I am Mallard Duck !!");
    }
}
