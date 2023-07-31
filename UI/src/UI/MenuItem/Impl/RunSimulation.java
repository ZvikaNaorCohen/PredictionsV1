package UI.MenuItem.Impl;
import Engine.Engine;
import UI.MenuItem.api.MenuItem;

public class RunSimulation implements MenuItem {
    public void invoke(Engine engine){
        if(!engine.isEngineValid()) {
            printInvalidChoice("Engine is not initialized. Please make sure you successfully " +
                    "read XML file before using this option. ");
        }
    }

    public void printInvalidChoice(String reason){
        System.out.println(reason);
    }
}
