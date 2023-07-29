package Engine.Rules;
import Engine.Actions.api.Action;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private String name;
    private List<Action> listOfActions = new ArrayList<Action>();
    private Activation activationTiming;

}
