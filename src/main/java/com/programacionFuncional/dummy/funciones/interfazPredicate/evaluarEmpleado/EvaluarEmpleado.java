package com.programacionFuncional.dummy.funciones.interfazPredicate.evaluarEmpleado;

import java.util.Arrays;
import java.util.List;

public class EvaluarEmpleado {

    public static void main(String args[]){
        List<Empleado> listaEmpleado = Arrays.asList(
            new Empleado("Jhon", 16, 1500, "Cobranzas"),
            new Empleado("Evelyn", 22, 2500, "Finanzas"),
            new Empleado("Fernando", 18, 3000, "Mercadeo")
        );

        Evaluador evaluador = new Evaluador();

        System.out.println("Empleados con salarios altos mayores a 2000");
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleado, empleado -> empleado.getSalario() > 2000 );
        empSalariosAltos.forEach( empleado -> System.out.println(empleado.getNombre()));

        System.out.println("\nEmpleados que su nombrea inicie fon F: ");
        List<Empleado> empInicianF = evaluador.evaluar(listaEmpleado, empleado -> empleado.getNombre().startsWith("F"));
        empInicianF.forEach( empleado -> System.out.println(empleado.getNombre()));

        System.out.println("\nEmpleados jovenes: ");
        List<Empleado> empMenores = evaluador.evaluar(listaEmpleado, empleado -> empleado.getEdad() <= 18);
        empMenores.forEach( empleado -> System.out.println(empleado.getNombre()));
    }
}
