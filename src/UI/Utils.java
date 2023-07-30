package UI;

public class Utils {
    public static void PrintMenu(){
        System.out.println("Please choose an option. Just press the digit of the command you want to use. ");
        System.out.println("1. Read an XML file. ");
        System.out.println("2. Show simulation details. ");
        System.out.println("3. Run Simulation. ");
        System.out.println("4. Show full details of past run. ");
        System.out.println("5. Exit. ");
    }

    public static Boolean validOptionFromMainMenu(String userInput){
        userInput = userInput.trim();
        return userInput.equals("1") || userInput.equals("2") || userInput.equals("3") || userInput.equals("4") || userInput.equals("5");
    }

    public static void printBadInput(String reason){
        System.out.println("Your input was incorrect. Reason: " + reason);
    }
}
