package UI;

import Engine.Engine;
import Engine.Properties.Impl.Property;
import Engine.World;
import Engine.Entity;

import java.util.List;
import java.util.Scanner;

import static UI.Utils.*;

public class UserInterface {
    private Engine myEngine = new Engine();

    public void run(){
        // World simulationToPrint = myEngine.getMyWorld();
        // printWorld(simulationToPrint);
        Boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while(run){
            PrintMenu();
            String choice = scanner.nextLine();
            if(!validOptionFromMainMenu(choice))
            {
                Utils.printBadInput("Invalid option received. Please enter a digit from 1 to 5.");
                continue;
            }
            else {
                System.out.println("Running option: " + choice);
            }
        }
    }

    public void printWorld(World worldToPrint){
        System.out.println(worldToPrint);
        List<Entity> entities = worldToPrint.GetEntities();
        printEntities(entities);
    }

    public void printEntities(List<Entity> entities){
        int index = 1;
        for(Entity entity : entities){
            System.out.println("Entity number: " + index++);
            System.out.println(entity);
        }
    }
}
