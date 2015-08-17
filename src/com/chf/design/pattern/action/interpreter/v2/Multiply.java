package com.chf.design.pattern.action.interpreter.v2;

public class Multiply extends AbstractExpression {

    private AbstractExpression left;

    private AbstractExpression right;

    public Multiply(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
