package com.programacionFuncional.dummy.streams.operacionesIntermedias;

import com.programacionFuncional.dummy.funciones.interfazBiPredicate.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class OperacionesMap {

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

        IntStream.rangeClosed(1, 5).map(new IntUnaryOperator(){
            @Override
            public int applyAsInt(int number) {
                return number*number;
            }
        }).forEach(System.out::println);

        System.out.println("");
        IntStream.rangeClosed(1, 10).map( n-> n * 2).forEach(System.out::println);


        double salarios = listaEmpleado.stream()
                .filter(Empleado::esFinanzas)
                .filter(emp -> emp.getEdad() > 15)
                .mapToDouble(emp -> emp.getSalario())
                .sum();

        double promedio = salarios / listaEmpleado.stream().filter(Empleado::esFinanzas)
                .filter(emp -> emp.getEdad() > 15)
                .count();

        System.out.println("EL promedio de salarios del area de finanzas mayores de 15 años "+ promedio);
    }




}
