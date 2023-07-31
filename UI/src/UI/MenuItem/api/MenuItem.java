package UI.MenuItem.api;
import Engine.Engine;

public interface MenuItem {
    void invoke(Engine engine);
    void printInvalidChoice(String reason);

}
