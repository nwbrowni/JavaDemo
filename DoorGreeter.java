public class DoorGreeter extends Greeter {
    public DoorGreeter() {
        Greeting = "Hello";
    }

    public DoorGreeter(String greeting) {
        Greeting = greeting;
    }
    
    public void WelcomeIn() {
        System.out.println("Please come in.");
    }
    
    public void GreetAtDoor() {
        Greet();
        WelcomeIn();
    }

    public void GreetWithNameAtDoor(String name) {
        GreetWithName(name);
        WelcomeIn();
    }
}
