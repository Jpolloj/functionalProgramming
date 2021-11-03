package com.programacionFuncional.dummy.metodosReferenciados.referenciaInstancia;

import com.programacionFuncional.dummy.metodosReferenciados.Empleado;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparador {

    public static void main(String args[]){
        List<Empleado> empleados = Arrays.asList(
                new Empleado("jhon", 29, 100, "con"),
                new Empleado("eve", 26, 1000, "tec"),
                new Empleado("flo", 19, 2000, "gen"));

        System.out.println("Persona sin ordenar: ");
        empleados.forEach(p -> System.out.println(p));
        System.out.println("");

        ReferenciaInstancia comparador = new ReferenciaInstancia();
        //Collections.sort(empleados, (e1, e2) -> comparador.compararPorNombre(e1, e2));
        Collections.sort(empleados, comparador::compararPorNombre);
        System.out.println("Persona sin ordenar: ");
        empleados.forEach(System.out::println);
        System.out.println("");

        Collections.sort(empleados, comparador::compararEdad);
        System.out.println("Persona sin ordenar: ");
        empleados.forEach(System.out::println);

        System.out.println("");

    }
}
