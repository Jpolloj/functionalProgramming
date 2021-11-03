package com.programacionFuncional.dummy.funciones.interfazConsumer.estudiantes;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Estudiantes {

    private String nombre;
    private double calificacion;
}
