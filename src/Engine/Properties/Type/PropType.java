package Engine.Properties.Type;

public enum PropType {
    INT, FLOAT, BOOL, STRING;

    @Override
    public String toString(){
        if(this == INT)
        {
            return "INT";
        }
        if(this == FLOAT)
        {
            return "FLOAT";
        }
        if(this == BOOL)
        {
            return "BOOL";
        }
        if(this == STRING)
        {
            return "STRING";
        }
        return "NOT DEFINED";
    }
}
