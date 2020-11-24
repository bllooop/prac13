package two;

import one.Expression;

public class Divide extends Operation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left / right;
    }

    protected double evaluate(double left, double right) {
        return left / right;
    }
}