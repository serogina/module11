package org.example;

import java.util.Iterator;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Stream.Builder<T> builder = Stream.builder();

        Stream.iterate(0, i -> (iterator1.hasNext() && iterator2.hasNext()) , i -> i+1)
                .forEach(i -> {
                     builder.add(iterator1.next());
                     builder.add(iterator2.next());
                });

        return builder.build();

    }
}
