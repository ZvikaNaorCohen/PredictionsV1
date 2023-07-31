package Engine;

public class Engine {
    private World mySystem;
    private boolean isValid = false;

    public Engine(){
        mySystem = new World();
    }

    public World getMyWorld(){
        return mySystem;
    }

    public void setValid(boolean status){
        isValid = status;
    }

    public boolean isEngineValid(){
        return isValid;
    }
}
