package com.programacionFuncional.dummy.streams.intro.streamsArchivos;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamArchivos {

    public static void main(String args[]){
        Path path1 = Paths.get("src/main/resources/static/Parrafos.txt");
        System.out.println(path1.toAbsolutePath());
        try(Stream<String> lineas = Files.lines(path1)){
            lineas.forEach(
                    linea -> {
                        System.out.println("Linea");
                        System.out.println(linea);
                    }
            );
        }catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }

        System.out.println("");

        Path dir = Paths.get(".");
        System.out.printf("EL arboal de archivos del proyecto para: %s es %n", dir.toAbsolutePath());
        try(Stream<Path> paths = Files.walk(dir)){
            paths.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
