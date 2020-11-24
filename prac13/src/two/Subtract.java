package two;

import one.Expression;

public class Subtract extends Operation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left - right;
    }

    protected double evaluate(double left, double right) {
        return left - right;
    }
}