package com.programacionFuncional.dummy.streams.opereacionesReduccion.mutable;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
public class Empleado implements Comparable{

    @AllArgsConstructor
    @Getter
    public enum Departamentos{
        COBRANZAS("Cobranzas"),
        FINANZAS("Finanzas"),
        MERCADEO("Mercadeo"),
        TECNOLOGIA("Tecnologia");
        private final String departamento;
    }

    public Empleado(String nombre, int edad, double salario, Departamentos departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    private String nombre;
    private int edad;
    private double salario;
    private Departamentos departamento;


    public static boolean esCobranzas(com.programacionFuncional.dummy.funciones.interfazBiPredicate.Empleado empleado){
        return empleado.getDepartamento().equals("Cobranzas");
    }



    public double getSalarios() { return this.salario; }

    public Departamentos getDepartamentos() {return this.departamento; }

    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((Empleado) o).getNombre());
    }
}