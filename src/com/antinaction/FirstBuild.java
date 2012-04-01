package com.antinaction;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class FirstBuild {
    static Logger logger = Logger.getLogger(FirstBuild.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.debug("Hello world from log4J");
//        System.out.println("Hello world");
        execute();
        executeWithoutGenerics();
        executeWithGenerics();
    }

    private static void executeWithoutGenerics() {
        List numbers = Arrays.asList(1d, 2d);
        List integers = Arrays.asList(3,4);
        numbers = integers; // No compilation errors here

    }

    private static void executeWithGenerics() {
        List<? extends Number> numbers = Arrays.<Number>asList(1d, 2d);
        List<Integer> integers = Arrays.<Integer>asList(3, 4);

        // Can't do it, will get compilation errors!!!
        numbers = integers;
    }

    public static void execute() {
        Number[] numbers = {1, 2};
        Integer[] integers = {3, 4};
        numbers = integers;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
