package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    private static final String[] array = {"1, 2, 0", "4, 5"};

    public static String getSortedNumbers(){
        return  Arrays.stream(array)
                .flatMap(str ->Arrays.stream(str.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }
}
