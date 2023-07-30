package Engine;

public class Engine {
    private World mySystem;

    public Engine(){
        mySystem = new World();
    }

    public World getMyWorld(){
        return mySystem;
    }

}
