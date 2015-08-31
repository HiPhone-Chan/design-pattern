package com.chf.design.pattern.behavioral.interpreter.v2;

public class Add extends AbstractExpression {

    private AbstractExpression left;

    private AbstractExpression right;

    public Add(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
