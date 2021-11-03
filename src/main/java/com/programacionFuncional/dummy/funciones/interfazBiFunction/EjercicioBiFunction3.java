package com.programacionFuncional.dummy.funciones.interfazBiFunction;

import java.util.Arrays;
import java.util.List;

public class EjercicioBiFunction3 {

    public static void main(String args[]) {

        List<Empleado> empleadoList = Arrays.asList(
                new Empleado("Jhon", 1000),
                new Empleado("Fernando", 2000),
                new Empleado("Angel", 3000)
        );

        List<Empleado> incrementos = Calculadura2.calc(
                empleadoList,
                20.0,
                (empleado, incremento) ->
                        Empleado.builder()
                                .nombre(empleado.getNombre())
                                .salario(empleado.getSalario() + (empleado.getSalario() * (incremento / 100)))
                                .build());

        incrementos.forEach((aumento) -> System.out.printf("\nAumento Salarial para %s por %.0f",
                aumento.getNombre(), aumento.getSalario()));
    }
}
