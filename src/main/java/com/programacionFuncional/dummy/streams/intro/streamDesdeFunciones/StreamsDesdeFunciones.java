package com.programacionFuncional.dummy.streams.intro.streamDesdeFunciones;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsDesdeFunciones {

    public static void main(String args[]){

        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n +1)
                .limit(10L);
        primerosDiez.forEach(System.out::println);

        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("\ndespues de 100");
        Stream.iterate(1L, n -> n+1)
                .filter(n -> n % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\nnumeros random");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\nenteros aleatorios");
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);

    }

}
