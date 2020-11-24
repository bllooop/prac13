package three;


import one.Expression;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    public int evaluate(int x) {
        return name.equals("x") ? x  : 0;
    }
}
