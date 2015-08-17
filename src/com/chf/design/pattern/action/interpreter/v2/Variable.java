package com.chf.design.pattern.action.interpreter.v2;

/**
 * Terminal Expression
 * 
 * @author c00251918
 *
 */
public class Variable extends AbstractExpression {

    public int interpret(Context context) {
        return context.getValue(this);
    }
}
