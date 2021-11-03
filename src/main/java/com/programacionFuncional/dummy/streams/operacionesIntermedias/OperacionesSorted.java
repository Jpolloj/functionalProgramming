package com.programacionFuncional.dummy.streams.operacionesIntermedias;

import com.programacionFuncional.dummy.streams.operacionesIntermedias.dtoSorted.Empleado;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OperacionesSorted {

    public static void main(String[] args){
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

        Arrays.asList("JHon", "Camilo", "Jose", "Manuel", "Flor").
                stream().
                sorted().
                forEach(System.out::println);

        Arrays.asList(6,4,1,8,66,41,2,7,1,2,0,5,41,66,43,31)
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nNOmbres organizados alfabeticamente ");
        listaEmpleado.stream().sorted().forEach(emp -> System.out.println(emp.getNombre()));

        System.out.println("\nNOmbres organizados por edad ");
        listaEmpleado.stream().sorted(new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getEdad()- o2.getEdad();
            }
        }).forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getEdad()));

        System.out.println("\nempleados ordenados por ingreso ");
        listaEmpleado.stream().filter(emp -> emp.getEdad() > 20).sorted((emp1, emp2) -> (int) (emp1.getSalario() - emp2.getSalario()))
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getSalario()));

    }
}
