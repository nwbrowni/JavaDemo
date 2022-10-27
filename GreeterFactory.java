public class GreeterFactory {
    public Greeter GenerateGreeter() {
        return new Greeter();
    }
    
    public Greeter GenerateGreeter(String type) {
        if (type.equals("Midwesterner")) {
            return new Greeter("Howdy");
        }
        else if (type.equals("Italian")) {
            return new Greeter("Chow");
        }
        else if (type.equals("Spanish")) {
            return new Greeter("Hola");
        }
        else if (type.equals("Formal")) {
            return new Greeter("Good day");
        }
        else {
            return new Greeter();
        }
    }

    public Greeter GenerateCustomGreeter(String greeting) {
        return new Greeter(greeting);
    }

    public DoorGreeter GenerateDoorGreeter() {
        return new DoorGreeter();
    }

    public DoorGreeter GenerateDoorGreeter(String type) {
        if (type.equals("Midwesterner")) {
            return new DoorGreeter("Howdy");
        }
        else if (type.equals("Italian")) {
            return new DoorGreeter("Chow");
        }
        else if (type.equals("Spanish")) {
            return new DoorGreeter("Hola");
        }
        else if (type.equals("Formal")) {
            return new DoorGreeter("Good day");
        }
        else {
            return new DoorGreeter();
        }
    }

    public DoorGreeter GenerateCustomDoorGreeter(String greeting) {
        return new DoorGreeter(greeting);
    } 
}
