package com.programacionFuncional.dummy.streams.opereacionesReduccion.mutable;

import com.programacionFuncional.dummy.streams.operacionesIntermedias.dtoSorted.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class Collector {

    public static void main(String args[]){
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Jhon", 16, 1500, "Cobranzas"),
                new Empleado("Evelyn", 22, 3500.50, "Finanzas"),
                new Empleado("Fernando", 21, 3000, "Mercadeo"),
                new Empleado("Hermes", 16, 1500, "Cobranzas"),
                new Empleado("Vi", 22, 6500.102, "Finanzas"),
                new Empleado("Carlos", 19, 3000, "Mercadeo"),
                new Empleado("CareNecia", 16, 1500, "Cobranzas"),
                new Empleado("Karen", 22, 12500.31, "Finanzas"),
                new Empleado("Jefferson", 26, 3000, "Mercadeo"),
                new Empleado("Lucas", 16, 1500, "Cobranzas"),
                new Empleado("Sandra", 22, 1500.21, "Finanzas"),
                new Empleado("Camilo", 11, 3000, "Mercadeo"),
                new Empleado("Flor", 17, 3000, "Tecnologia"));


        List<String> nombres = listaEmpleado
                .stream()
                .map((empleado) -> empleado.getNombre())
                .collect(Collectors.toList());

        //Set -- conjunto donde se asegura que no existan datos repetidos
        Set<String> nombresConjunto = listaEmpleado
                .stream()
                .map((empleado) -> empleado.getNombre())
                .collect(Collectors.toSet());

        //Set -- conjunto donde se asegura que no existan datos repetidos
        SortedSet<String> nombresConjuntoOrdenado = listaEmpleado
                .stream()
                .map((empleado) -> empleado.getNombre())
                .collect(Collectors.toCollection(TreeSet::new));

        nombres.forEach(System.out::println);
        System.out.println("");
        nombresConjunto.forEach(System.out::println);
        System.out.println("");
        nombresConjuntoOrdenado.forEach(System.out::println);

    }
}
