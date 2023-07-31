package UI.MenuItem.Impl;
import Engine.Engine;
import UI.MenuItem.api.MenuItem;

public class ExitProgram implements MenuItem {
    public void invoke(Engine engine){
        System.out.println("Thank you for supporting PredictionsV1. Exiting program. ");
        System.exit(1);
    }

    public void printInvalidChoice(String reason){

    }
}
