import java.util.Scanner;  // Import the Scanner class

public class GreeterApp {
    GreeterFactory gf = new GreeterFactory();
    Greeter g = new Greeter();
    Scanner s = new Scanner(System.in);

    public String PrintMainMenu() {
        System.out.println("Greeter App Main Menu:");
        System.out.println("1) Print Greeting");
        System.out.println("2) Switch to Midwestener Greeter");
        System.out.println("3) Switch to Italian Greeter");
        System.out.println("4) Switch to Spanish Greeter");
        System.out.println("5) Switch to Former Greeter");
        System.out.println("6) Switch to a Custom Greeter");
        System.out.println("7) Switch to a Default Greeter");
        System.out.println("8) Exit");

        String input = s.nextLine();
        return input;
    }

    public boolean HandleMainMenuInput(String input) {
        if (input.equals("1")) {
            g.Greet();
        }
        else if (input.equals("2")) {
            g = gf.GenerateGreeter("Midwesterner");
        }
        else if (input.equals("3")) {
            g = gf.GenerateGreeter("Italian");
        }
        else if (input.equals("4")) {
            g = gf.GenerateGreeter("Spanish");
        }
        else if (input.equals("5")) {
            g = gf.GenerateGreeter("Formal");
        }
        else if (input.equals("6")) {
            System.out.println("Enter a custom greeting:");
;
            String customgreeting = s.nextLine();
            g = gf.GenerateCustomGreeter(customgreeting);
        } else if (input.equals("7")) {
            g = gf.GenerateGreeter();
        }
        else if (input.equals("8")) {
            return false;
        }
        else {
            System.out.println("Invalid input provided");
        }

        return true;
    }

    public void Run() {
        boolean flag = true;
    
        while (flag) {
            flag = HandleMainMenuInput(PrintMainMenu());
        }
    }
}
