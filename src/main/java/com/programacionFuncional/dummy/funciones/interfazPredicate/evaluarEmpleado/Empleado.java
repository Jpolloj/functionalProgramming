package com.programacionFuncional.dummy.funciones.interfazPredicate.evaluarEmpleado;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;
}
