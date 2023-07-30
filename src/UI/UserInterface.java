package UI;

import Engine.Engine;
import Engine.Properties.Impl.Property;
import Engine.World;
import Engine.Entity;

import java.util.List;

public class UserInterface {
    private Engine myEngine = new Engine();

    public void run(){
        World simulationToPrint = myEngine.getMyWorld();
        printWorld(simulationToPrint);

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
