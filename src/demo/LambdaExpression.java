package demo;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable helloLambda = () -> System.out.println("hello");
        helloLambda.run();


    }
}