package Engine.Properties.Impl;

import Engine.Properties.Type.PropType;

public class Property {
    String name;
    PropType type;
    int from;
    int to;

    public Property() {
        name = "Test property";
        type = PropType.INT;
        from = 0;
        to = 100;
    }

    public Property(String inputName){
        name = inputName;
        type = PropType.STRING;
        from = 10;
        to = 0;
    }

    @Override
    public String toString(){
        return "PropName: " + name + " || PropType: " + type + " || From: " + from + " || To: " + to;
    }
}
