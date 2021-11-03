package com.programacionFuncional.dummy.streams.opereacionesReduccion;

import com.programacionFuncional.dummy.streams.operacionesIntermedias.dtoSorted.Empleado;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class OperacionesSumaCuentaMaxMinPromedio {

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

        int[] numeros = {5,1,5,20,44,1,2,55,1,60,41,37,65,41,89,86,99,76};

        //suma de los elementos
        System.out.println("la suma es " +
                IntStream.of(numeros).sum());

        //promedio de los elementos
        System.out.println("El promedio es: "+
                IntStream.of(numeros).average().getAsDouble());

        //minimo y maximo
        System.out.println("EL valor maximo es: " + IntStream.of(numeros).max().getAsInt()
                +" \nEl valor min es: "+IntStream.of(numeros).min().getAsInt());

        //contar cantidad de elementos
        System.out.println("la cantidad de elementos es: "+ IntStream.of(numeros).count());

        //sumar los salarios de los empleados
        System.out.println("Operaciones con empleados y Streams");
        System.out.println("SUma de salarios: "+
                listaEmpleado.stream()
                        .mapToDouble(Empleado::getSalario).sum());

        System.out.println("obtener el empleado con el salario maximo");
        Empleado empMax = listaEmpleado.stream().max((emp1, emp2) -> (int) (emp1.getSalario() - emp2.getSalario())).get();
        System.out.println(empMax);
    }
}
