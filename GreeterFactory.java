public class GreeterFactory {
    public Greeter GenerateGreeter() {
        return new Greeter("Hello!");
    }
    
    public Greeter GenerateGreeter(String type) {
        if (type == "Midwesterner") {
            return new Greeter("Howdy!");
        }
        else if (type == "Italian") {
            return new Greeter("Chow!");
        }
        else if (type == "Spanish") {
            return new Greeter("Hola!");
        }
        else if (type == "Formal") {
            return new Greeter("Good day!");
        }
        else {
            return new Greeter("Hello!");
        }
    }

    public DoorGreeter GenerateDoorGreeter() {
        return new DoorGreeter();
    }

    public DoorGreeter GenerateDoorGreeter(String type) {
        if (type == "Midwesterner") {
            return new DoorGreeter("Howdy!");
        }
        else if (type == "Italian") {
            return new DoorGreeter("Chow!");
        }
        else if (type == "Spanish") {
            return new DoorGreeter("Hola!");
        }
        else if (type == "Formal") {
            return new DoorGreeter("Good day!");
        }
        else {
            return new DoorGreeter("Hello!");
        }
    }
}
