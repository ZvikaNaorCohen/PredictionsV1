package Engine;

import Engine.Properties.Impl.Property;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name = "";
    private int numOccurrences;
    private List<Property> properties = new ArrayList<Property>();

    public Entity() {
        name = "TestEntityName";
        numOccurrences = 100;
        properties.add(new Property());
        properties.add(new Property("YOSSI"));
    }

    public Entity(String inputName){
        name = inputName;
        numOccurrences = 10;
        properties.add(new Property("MENASHE"));
    }

    public String GetName(){
        return name;
    }

    public int GetNumOccurrences(){
        return numOccurrences;
    }

    public List<Property> GetProperties(){
        return properties;
    }

    @Override
    public String toString() {
        String answer = "Name: " + name + " || num occurrences: " + numOccurrences + " || properties: " + "\n";
        int index = 1;
        for(Property prop : properties){
            answer += "PROP NUMBER: " + index++ + " ";
            answer += prop.toString();
            answer += "\n";
        }
        return answer;
    }

}
