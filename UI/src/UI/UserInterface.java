package UI;

import Engine.Engine;
import Engine.Properties.Impl.Property;
import Engine.World;
import Engine.Entity;
import UI.MenuItem.api.MenuItem;

import java.util.List;

import static UI.Utils.*;

public class UserInterface {
    private Engine myEngine = new Engine();

    public void run(){
        Boolean run = true;
        while(run){
            MenuItem choice = getInputFromUser();
            choice.invoke(myEngine);
        }
    }

    public static void printWorld(World worldToPrint){
        System.out.println(worldToPrint);
        List<Entity> entities = worldToPrint.GetEntities();
        printEntities(entities);
    }

    public static void printEntities(List<Entity> entities){
        int index = 1;
        for(Entity entity : entities){
            System.out.println("Entity number: " + index++);
            System.out.println(entity);
        }
    }
}
