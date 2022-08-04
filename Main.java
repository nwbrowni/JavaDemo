public class Main {
    public static void main(String[] args) {
        GreeterFactory gf = new GreeterFactory();

        Greeter built = gf.GenerateGreeter();

        built.GreetWithName("Nathan");

        DoorGreeter dbuilt = gf.GenerateDoorGreeter();
        
        dbuilt.GreetWithNameAtDoor("Nathan");
    }
}

/*
 * To run main:
 * 1. Open a terminal
 * 2. type: javac *.java (this will compile all the java classes in this folder)
 * 3. type: java Main (this will run the main found in Main.java)
 * 
 * To clean up the folder:
 * 1. Open a terminal
 * 2. type: rm *.class (this will remove all compiled java class files)
 */