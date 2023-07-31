package UI;

import UI.MenuItem.Impl.*;
import UI.MenuItem.api.MenuItem;

import java.util.Scanner;

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

    public static MenuItem getInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        do{
            PrintMenu();
            String choice = scanner.nextLine();
            if(!validOptionFromMainMenu(choice))
            {
                Utils.printBadInput("Invalid option received. Please enter a digit from 1 to 5.");
            }
            else {
                System.out.println("Running option: " + choice);
                switch(choice){
                    case "1":
                    {
                        return new ReadFile();
                    }
                    case "2":
                    {
                        return new SimulationDetail();
                    }
                    case "3":
                    {
                        return new RunSimulation();
                    }
                    case "4":
                    {
                        return new PastDetail();
                    }
                    case "5":
                    {
                        return new ExitProgram();
                    }
                }
            }
        }while(true);
    }
}
