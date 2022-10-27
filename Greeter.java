public class Greeter {
    String Greeting;

    public Greeter() {
        Greeting = "Hello";
    }

    public Greeter(String greeting) {
        Greeting = greeting;
    }

    public void Greet() {
        System.out.println(Greeting + "!");
    }

    public void GreetWithName(String name) {
        Greet();
        System.out.println("Pleasure to Meet you, " + name + "!");
    }
}