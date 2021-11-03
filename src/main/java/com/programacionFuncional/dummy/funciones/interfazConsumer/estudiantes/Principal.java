package com.programacionFuncional.dummy.funciones.interfazConsumer.estudiantes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {

    public static void main(String args[]){

        List<Estudiantes> estudiantesList = Arrays.asList(
                new Estudiantes("Jhon", 3.5),
                new Estudiantes("Camilo", 3.65),
                new Estudiantes("Fernando", 4.65),
                new Estudiantes("Manuel", 5.0));

        OperacionesEstudiante operacionesEstudiante = new OperacionesEstudiante();

        Consumer<Estudiantes> cons1  = e -> System.out.println("Nombre: "+e.getNombre()+" Calificacion: "+e.getCalificacion());

        System.out.println("Estudiantes sin calificacion actualizada");
        operacionesEstudiante.aceptaTodos(estudiantesList, cons1);

        Consumer<Estudiantes> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
        operacionesEstudiante.aceptaTodos(estudiantesList, cons2);

        System.out.println("Estudiantes con calificacion actualizada");
        operacionesEstudiante.aceptaTodos(estudiantesList, cons1);

    }
}
