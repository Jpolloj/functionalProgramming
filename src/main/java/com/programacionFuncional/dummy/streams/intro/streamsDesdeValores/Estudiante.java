package com.programacionFuncional.dummy.streams.intro.streamsDesdeValores;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Estudiante {

    public Estudiante(String identificacion, int edad, double altura, double promedio) {
        this.identificacion = identificacion;
        this.edad = edad;
        this.altura = altura;
        this.promedio = promedio;
    }

    private String identificacion;
    private int edad;
    private double altura;
    private double promedio;
}
