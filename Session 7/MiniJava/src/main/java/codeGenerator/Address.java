package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    private int num;
    private TypeAddress Type;
    private varType varType;

    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

    public String toString() {
        if (Type == TypeAddress.Direct)
            return num + "";
        else if (Type == TypeAddress.Indirect)
            return "@" + num;
        else if (Type == TypeAddress.Imidiate)
            return "#" + num;
        else
            return num + "";
    }

    public int getNum() {
        return num;
    }

    public TypeAddress getType() {
        return Type;
    }

    public varType getVarType() {
        return varType;
    }
}
