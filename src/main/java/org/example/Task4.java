package org.example;

import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> generateRandomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, xn -> (a * xn + c) % m);
    }
}
