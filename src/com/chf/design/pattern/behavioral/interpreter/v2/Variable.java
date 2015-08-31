package com.chf.design.pattern.behavioral.interpreter.v2;

/**
 * Terminal Expression
 * 
 * @author chhfeng
 *
 */
public class Variable extends AbstractExpression {

    public int interpret(Context context) {
        return context.getValue(this);
    }
}
