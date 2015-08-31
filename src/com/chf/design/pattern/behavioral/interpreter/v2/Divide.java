package com.chf.design.pattern.behavioral.interpreter.v2;

public class Divide extends AbstractExpression {

    private AbstractExpression left;

    private AbstractExpression right;

    public Divide(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) / right.interpret(context);
    }
}
