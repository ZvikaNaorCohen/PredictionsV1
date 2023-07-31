package Engine;

import Engine.Rules.FinishRule;
import Engine.Rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Entity> entities = new ArrayList<Entity>();
    private List<Rule> rules = new ArrayList<Rule>();
    int timeline;
    int ticks;
    FinishRule finishRule = new FinishRule();

    public World() {
        timeline = 1;
        ticks = 1;
        entities.add(new Entity());
        entities.add(new Entity("Menash"));
        rules.add(new Rule());
    }

    public List<Entity> GetEntities(){
        return entities;
    }
    public List<Rule> getRules(){
        return rules;
    }
    public void insertNewRule(Rule rule){
        rules.add(rule);
    }

    public void insertNewEntity(Entity entity){
        entities.add(entity);
    }

    public void insertNewFinishRule(FinishRule inputFinishRule){
        finishRule = inputFinishRule;
    }

    public int GetTimeline(){
        return timeline;
    }

    public int GetTicks(){
        return ticks;
    }

    @Override
    public String toString(){
        String answer = "World Timeline: " + timeline + " || world ticks: " + ticks + "\n";
        answer += finishRule.toString();
        answer += "\n" + "Rules: " + "\n";
        for(Rule rule : rules){
            answer += rule.toString();
            answer += "\n";
        }
        return answer;
    }

}
