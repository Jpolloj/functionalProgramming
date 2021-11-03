package com.programacionFuncional.dummy.funciones.interfazBiPredicate;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Empleado {
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    private String nombre;
    private int edad;
    private double salario;
    private String departamento;


    public static boolean esCobranzas(Empleado empleado){
        return empleado.getDepartamento().equals("Cobranzas");
    }

    public boolean esFinanzas(){
        return this.departamento ==  "Finanzas";
    }
}
