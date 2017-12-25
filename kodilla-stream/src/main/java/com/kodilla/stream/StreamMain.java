package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {

    public static void main(String[] args) {

        Processor processor = new Processor();
        // ExecutorSaySamothing executorSaySamothing = new ExecutorSaySamothing();

        Executor codeToExecute = () -> System.out.println("This is lambda text.");
        processor.execute(codeToExecute);

        codeToExecute = () -> System.out.println("This is another lambda text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
    }
}