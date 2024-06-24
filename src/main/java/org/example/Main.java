package org.example;

import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> names = List.of( "Ivan", "Peter", "Iryna", "Alex", "Anton", "Stepan", "Vasiliy", "Olga");

        System.out.println("================   Task1   ====================");
        System.out.println(Task1.getOddIndexedNames(names));

        System.out.println("================   Task2   ====================");
        System.out.println(Task2.toUpperAndSortList(names));

        System.out.println("================   Task3   ====================");
        System.out.println(Task3.getSortedNumbers());

        System.out.println("================   Task4   ====================");
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 1L;
        Task4.generateRandomStream(seed, a, c, m)
                            .limit(5)
                            .forEach(System.out::println);

        System.out.println("================   Task5   ====================");
        Stream<String> stream1 = Stream.of("a", "b", "c", "d");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");

        Stream<String> zippedStream = Task5.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}


