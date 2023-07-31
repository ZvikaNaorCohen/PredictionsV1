package Engine.Rules;

public class Activation {
    private int ticks;
    private double probability;

    public Activation(int i_Ticks, int i_Prob){
        ticks = i_Ticks;
        probability = i_Prob;
    }

    public int getTicks(){
        return ticks;
    }

    public double getProb(){
        return probability;
    }
}
