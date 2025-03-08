// Abstract Duck class serving as a base for all duck types
abstract public class Duck {
    QuackBehaviour quackBehaviour;  // Behavior interface for quacking
    SwimBehaviour swimBehaviour;    // Behavior interface for swimming
    FlightBehaviour flightBehaviour; // Behavior interface for flying

    // Setter methods to dynamically change behaviors
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    public void setFlightBehaviour(FlightBehaviour flightBehaviour) {
        this.flightBehaviour = flightBehaviour;
    }

    // Abstract method to be implemented by subclasses
    abstract public void display();

    // Methods to perform behaviors using assigned strategies
    public void performQuack(){
        quackBehaviour.quack(); // Executes the assigned quack behavior
    }
    public void performSwim(){
        swimBehaviour.swim(); // Executes the assigned swim behavior
    }
    public void performFlight(){
        flightBehaviour.fly(); // Executes the assigned flight behavior
    }
}
