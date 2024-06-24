package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public static String getOddIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(item -> item % 2 != 0)
                .mapToObj(item -> (item) + ". " + names.get(item))
                .collect(Collectors.joining(", "));
    }
}
