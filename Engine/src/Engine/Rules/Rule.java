package Engine.Rules;
import Engine.Actions.api.Action;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private String name;
    private List<Action> listOfActions = new ArrayList<Action>();
    private Activation activationTiming;

    public Rule(){
        name = "Test rule name";
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

}
