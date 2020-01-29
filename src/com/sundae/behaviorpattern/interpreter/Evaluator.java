package com.sundae.behaviorpattern.interpreter;

import java.util.Stack;

public class Evaluator {
    public float evaluate(String exp){
        Stack<Expression> stack = new Stack<>();
        float result = 0;
        for (String token : exp.split(" ")){
            if(isOperator(token)){
                Expression expression = null;
                if(token.equals("+"))
                    expression = stack.push(new Plus(stack.pop(), stack.pop()));
                else if(token.equals("-"))
                    expression = stack.push(new Minus(stack.pop(), stack.pop()));
                if(exp != null){
                    result = expression.interpret();
                    stack.push(new Number(result));
                }
            }
            if(isNumber(token)){
                stack.push(new Number(Float.parseFloat(token)));
            }
        }
        return result;
    }

    private boolean isNumber(String token){
        try{
            Float.parseFloat(token);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    private boolean isOperator(String token){
        return token.equals("+") || token.equals("-");
    }
}
