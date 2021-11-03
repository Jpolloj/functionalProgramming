package com.programacionFuncional.dummy.streams.intro.streamColeccionesArrays;

import com.programacionFuncional.dummy.streams.intro.streamsDesdeValores.Estudiante;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamColeccionesArrays {

    public static void main(String args[]) {
        IntStream numStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        numStream.forEach(System.out::println);

        Stream<String> nombres = Arrays.stream(new String[]{"hola", "mundo"});
        nombres.forEach(System.out::println);

        Set<String> nombresSet = new HashSet<>();
        nombresSet.add("jhon");
        nombresSet.add("camilo");
        nombresSet.add("fer");

        Stream<String> nombresStream = nombresSet.stream();
        nombresStream.forEach(System.out::println);

        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("1010", 20, 160.5, 4.3),
                new Estudiante("1011", 21, 167.5, 4.8));

        Stream<Estudiante> estudianteStream = estudiantes.parallelStream();

        estudianteStream.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));
    }
}
