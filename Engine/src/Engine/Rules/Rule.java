package Engine.Rules;
import Engine.Actions.api.Action;
import Engine.Actions.impl.CalculationAction;
import Engine.Actions.impl.DecreaseAction;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private String name;
    private List<Action> listOfActions = new ArrayList<Action>();
    private Activation activationTiming;

    public Rule(){
        name = "Test rule name";
        activationTiming = new Activation(10, 20);
        listOfActions.add(new CalculationAction());
        listOfActions.add(new DecreaseAction());
    }

    public List<Action> getAllRuleActions(){
        return listOfActions;
    }

    public void insertNewAction(Action action){
        listOfActions.add(action);
    }

    public void updateActivationTiming(Activation newTiming){
        activationTiming = newTiming;
    }
    @Override
    public String toString(){
        String answer = "Rule name: " + name + " || rule ticks: " + activationTiming.getTicks() + " || rule prob: "
                + activationTiming.getProb() + "\n";
        answer += "Number of actions: " + listOfActions.size() + "\n";
        answer += "Names of actions: " + "\n";
        for(Action action : listOfActions){
            answer += action.getClass().getSimpleName() + "\n";
        }
        return answer;
    }
}
