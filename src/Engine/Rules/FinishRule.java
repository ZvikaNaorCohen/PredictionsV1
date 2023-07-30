package Engine.Rules;

public class FinishRule {
    int time;
    int ticks;

    // need to add "User Interactive" finish rule

    public FinishRule(){
        time = 100;
        ticks = 10;
    }
    @Override
    public String toString(){
        return "Time to finish: " + time + " || Ticks to finish: " + ticks;
    }
}
