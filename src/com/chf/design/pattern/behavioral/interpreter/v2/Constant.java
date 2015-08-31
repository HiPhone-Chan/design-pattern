package com.chf.design.pattern.behavioral.interpreter.v2;

/**
 * Terminal Expression
 * 
 * @author chhfeng
 *
 */
public class Constant extends AbstractExpression {

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    public int interpret(Context context) {
        return value;
    }
}
