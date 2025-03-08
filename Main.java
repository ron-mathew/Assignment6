public class Main {
    public static void main(String[] args) {
        // Creating a MallardDuck object and calling its behaviors
        MallardDuck md = new MallardDuck();
        System.out.println("---------------------");
        md.display();      // Displaying the type of duck
        md.performQuack(); // Performing quack behavior
        md.performSwim();  // Performing swim behavior
        md.performFlight();// Performing flight behavior
        System.out.println("---------------------");

        // Creating a RubberDuck object and calling its behaviors
        RubberDuck rd = new RubberDuck();
        System.out.println("---------------------");
        rd.display();      // Displaying the type of duck
        rd.performQuack(); // Performing quack behavior
        rd.performSwim();  // Performing swim behavior
        rd.performFlight();// Performing flight behavior
        System.out.println("---------------------");

        // Creating a RedHeadDuck object and calling its behaviors
        RedHeadDuck rh = new RedHeadDuck();
        System.out.println("---------------------");
        rh.display();      // Displaying the type of duck
        rh.performQuack(); // Performing quack behavior
        rh.performSwim();  // Performing swim behavior
        rh.performFlight();// Performing flight behavior
        System.out.println("---------------------");

        // Creating a DecoyDuck object and calling its behaviors
        DecoyDuck dd = new DecoyDuck();
        System.out.println("---------------------");
        dd.display();      // Displaying the type of duck
        dd.performQuack(); // Performing quack behavior
        dd.performSwim();  // Performing swim behavior
        dd.performFlight();// Performing flight behavior
        System.out.println("---------------------");
    }
}
