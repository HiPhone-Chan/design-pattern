package com.chf.design.pattern.action.interpreter.v2;

/**
 * Terminal Expression
 * 
 * @author c00251918
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
