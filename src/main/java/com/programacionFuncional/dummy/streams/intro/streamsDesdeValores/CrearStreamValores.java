package com.programacionFuncional.dummy.streams.intro.streamsDesdeValores;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStreamValores {

    public static void main (String args[]){


        Stream<String> stream1 = Stream.of("Curso de Programación");
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("curso1", "curso2", "curso3");
        stream2.forEach(System.out::println);

        String[] arreglo = {"java", "c++", "python"};
        Stream<String> stream3 = Stream.of(arreglo);
        stream3.forEach(System.out::println);

        Stream<Estudiante> estudianteStream = Stream.<Estudiante>builder()
                .add(new Estudiante("1010", 10, 160.0, 4.3))
                .add(new Estudiante("1011", 11, 166.3, 4.7))
                .add(new Estudiante("1012", 15, 171.0, 4.1))
                .build();
        estudianteStream.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));

        IntStream unoAVeinte = IntStream.rangeClosed(1, 20);
        unoAVeinte.forEach(System.out::println);

    }
}
