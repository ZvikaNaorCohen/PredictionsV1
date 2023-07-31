package UI.MenuItem.Impl;
import Engine.Engine;

import UI.MenuItem.api.MenuItem;

public class PastDetail implements MenuItem {
    public void invoke(Engine engine){

    }

    public void printInvalidChoice(String reason){
        System.out.println(reason);
    }
}
