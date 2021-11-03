package com.programacionFuncional.dummy.funciones.interfazConsumer.estudiantes;

import java.util.List;
import java.util.function.Consumer;

public class OperacionesEstudiante {

    public void aceptaTodos(List<Estudiantes> estudiantes, Consumer<Estudiantes> consumer){
        estudiantes.forEach(estudiante-> consumer.accept(estudiante));
    }

}