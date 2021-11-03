package com.programacionFuncional.dummy.metodosReferenciados.referenciaInstanciaArbitrario;

import com.programacionFuncional.dummy.metodosReferenciados.Empleado;
import com.programacionFuncional.dummy.metodosReferenciados.referenciaInstancia.ReferenciaInstancia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReferenciaInstanciaArbitrario {
    public static void main(String args[]){
        List<Empleado> empleados = Arrays.asList(
                new Empleado("jhon", 29, 100, "con"),
                new Empleado("eve", 26, 1000, "tec"),
                new Empleado("flo", 19, 2000, "gen"));

        System.out.println("Persona sin ordenar: ");
        empleados.forEach(System.out::println);
        System.out.println("");

        Collections.sort(empleados, Empleado::compararPorEdadTwo);
        System.out.println("Persona sin ordenar: ");
        empleados.forEach(System.out::println);
        System.out.println("");

    }
}
