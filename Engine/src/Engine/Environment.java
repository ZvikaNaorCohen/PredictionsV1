package Engine;

import Engine.Properties.Impl.Property;

import java.util.ArrayList;
import java.util.List;

public class Environment {
    private List<Property> properties = new ArrayList<Property>();

    public Environment(){

    }

    public void insertNewProperty(Property prop){
        properties.add(prop);
    }

}
