package Engine;

import Engine.Rules.FinishRule;

import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Entity> entities = new ArrayList<Entity>();
    int timeline;
    int ticks;
    FinishRule finishRule = new FinishRule();

    public World() {
        timeline = 1;
        ticks = 1;
        entities.add(new Entity());
        entities.add(new Entity("Menash"));
    }

    public List<Entity> GetEntities(){
        return entities;
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
        return answer;
    }

}
