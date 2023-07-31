package UI.MenuItem.Impl;

import Engine.Engine;
import UI.MenuItem.api.MenuItem;
import UI.UserInterface;

public class SimulationDetail implements MenuItem {
    public void invoke(Engine engine){
        if(!engine.isEngineValid()) {
            printInvalidChoice("Engine is not initialized. Please make sure you successfully " +
                    "read XML file before using this option. ");
        }
        else {
            UserInterface.printWorld(engine.getMyWorld());
        }
    }

    public void printInvalidChoice(String reason){
        System.out.println(reason);
    }
}
