package com.programacionFuncional.dummy.metodosReferenciados;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Empleado {
    private String nombre;
    private Integer edad;
    private double salario;
    private String departamento;

    public Empleado(String nombre, Integer edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "nombre= "+ nombre+", edad= "+edad;
    }

    public static int compararPorEdad(Empleado a, Empleado b){
        return a.getEdad().compareTo(b.getEdad());
    }

    public int compararPorEdadTwo(Empleado a){ return this.getEdad().compareTo(a.getEdad()); }

    public static int compararPorNombre(Empleado a, Empleado b){
        return a.getNombre().compareTo(b.getNombre());
    }
}
