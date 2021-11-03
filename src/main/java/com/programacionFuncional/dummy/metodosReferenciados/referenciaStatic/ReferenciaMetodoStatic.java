package com.programacionFuncional.dummy.metodosReferenciados.referenciaStatic;

import com.programacionFuncional.dummy.metodosReferenciados.Empleado;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReferenciaMetodoStatic {


    public static void main(String args[]){

        List<Empleado> empleados = Arrays.asList(
                new Empleado("jhon", 29, 100, "con"),
                new Empleado("eve", 26, 1000, "tec"),
                new Empleado("flo", 19, 2000, "gen"));

        System.out.println("Persona sin ordenar: ");
        empleados.forEach(p -> System.out.println(p));
        System.out.println("");

        /*
        Collections.sort(empleados, (empleado1, empleado2) -> Empleado.compararPorEdad(empleado1, empleado2));
         */

        Collections.sort(empleados, Empleado::compararPorEdad);
        System.out.println("Persona sin ordenar: ");
        empleados.forEach(p -> System.out.println(p));
        System.out.println("");

        Collections.sort(empleados, Empleado::compararPorNombre);
        System.out.println("Persona sin ordenar: ");
        empleados.forEach(p -> System.out.println(p));

    }
}
