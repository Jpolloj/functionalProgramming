package com.programacionFuncional.dummy.streams.operacionesIntermedias;



import com.programacionFuncional.dummy.funciones.interfazBiPredicate.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {

    public static void main(String args[]){
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Jhon", 16, 1500, "Cobranzas"),
                new Empleado("Evelyn", 22, 2500, "Finanzas"),
                new Empleado("Fernando", 21, 3000, "Mercadeo"),
                new Empleado("Hermes", 16, 1500, "Cobranzas"),
                new Empleado("Vi", 22, 2500, "Finanzas"),
                new Empleado("Carlos", 19, 3000, "Mercadeo"),
                new Empleado("CareNecia", 16, 1500, "Cobranzas"),
                new Empleado("Karen", 22, 2500, "Finanzas"),
                new Empleado("Jefferson", 26, 3000, "Mercadeo"),
                new Empleado("Lucas", 16, 1500, "Cobranzas"),
                new Empleado("Sandra", 22, 2500, "Finanzas"),
                new Empleado("Camilo", 11, 3000, "Mercadeo"),
                new Empleado("Flor", 17, 3000, "Tecnologia"));

        System.out.println("Empleados de cobranzas");
        listaEmpleado.stream()
                .filter( (emp) ->  emp.getDepartamento().equals("Cobranzas"))
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getDepartamento()));

        System.out.println("\nEmpleados de Finanzas");
        listaEmpleado.stream()
                .filter( Empleado::esFinanzas)
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getDepartamento()));

        System.out.println("\nEmpleados mayors de 20 años");
        listaEmpleado.stream()
                .filter( (empleado -> empleado.getEdad()>20))
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getEdad()));

        System.out.println("\nEmpleados de cobranzas que empiecen por C");
        listaEmpleado.stream()
                .filter( Empleado::esCobranzas)
                .filter( empleado -> empleado.getNombre().startsWith("C"))
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getDepartamento()));

        System.out.println("\nEmpleados de finanzas que ganan mas de 1500");
        listaEmpleado.stream()
                .filter(empleado -> empleado.esFinanzas() && empleado.getSalario()>1500)
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getSalario()+" "+emp.getDepartamento()));

        System.out.println("\nCantidad de empleados de Mercadeo que ganan mas de 2000");
        /*
        Long cantidadEmpleados = listaEmpleado.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Mercadeo") && empleado.getSalario()>2000
                && empleado.getEdad()>20)
                .count();
        System.out.println("Cantidad empleados: "+cantidadEmpleados);
         */
        Predicate<Empleado> empMercadeo = emp -> emp.getDepartamento().equals("Mercadeo");
        Predicate<Empleado> empMayor2000 = emp -> emp.getSalario() > 2000;
        Predicate<Empleado> empEdad20 = emp -> emp.getEdad() > 20;
        Predicate<Empleado> mer200020 = empMercadeo.and(empMayor2000).and(empEdad20);
        System.out.println("Cantidad empleados: "+listaEmpleado.stream().filter(mer200020).count());
    }
}
