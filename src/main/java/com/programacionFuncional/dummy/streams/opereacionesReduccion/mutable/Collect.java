package com.programacionFuncional.dummy.streams.opereacionesReduccion.mutable;

import com.programacionFuncional.dummy.streams.operacionesIntermedias.dtoSorted.Empleado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Collect {

    public static void main (String args[]){
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

        Supplier<ArrayList<String>> provvedor = ArrayList::new;

        //BiConsumer<ArrayList<String>, String> acumulador = (lista, str) -> lista.add(str);

        BiConsumer<ArrayList<String>, String> acumulador = ArrayList::add;

        BiConsumer<ArrayList<String>, ArrayList<String>> conbiner = ArrayList::addAll;

        //listaEmpleado.stream().collect(provvedor, acumulador, conbiner);

        List<String> nombres = listaEmpleado.stream().map( empleado -> empleado.getNombre()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        nombres.forEach(System.out::println);

    }

}
