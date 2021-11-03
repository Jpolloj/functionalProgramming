package com.programacionFuncional.dummy.funciones.interfazPredicateBiFunct.evaluarEmpleado;


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

        //Implementacion BI FUNCTION
        Funciones funciones = new Funciones();
        empMenores.forEach(empleado -> {
            double nuevoSalario = funciones.incrementoSalario(empleado, 10,
                    (salario, incremento ) -> salario +(salario*(incremento/100)));
            empleado.setSalario(nuevoSalario);
        });

        System.out.println("\nSalario Actualizados en los Empleados jovenes: ");
        empMenores.forEach( empleado -> System.out.println(empleado.getNombre()+" "+empleado.getSalario()));


        System.out.println("\nEmpleados Mayores: ");
        List<Empleado> empMayores = evaluador.evaluarNegate(listaEmpleado, empleado -> empleado.getEdad() <= 18);
        empMayores.forEach( empleado -> System.out.println(empleado.getNombre()));
    }
}
