package com.chf.design.pattern.action.interpreter.v2;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Variable x = new Variable();
        Variable y = new Variable();
        Constant c = new Constant(3);

        context.assign(x, 1);
        context.assign(y, 2);

        AbstractExpression expression = new Multiply(new Add(x, y), c);

        
        System.out.println(x.interpret(context));
        System.out.println(y.interpret(context));
        System.out.println(expression.interpret(context));

    }

}
