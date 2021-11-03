package com.programacionFuncional.dummy.funciones.interfazBiPredicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class EvaluarEmpleado {

    public static  void main (String args[]){
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Jhon", 16, 1500, "Cobranzas"),
                new Empleado("Evelyn", 22, 2500, "Finanzas"),
                new Empleado("Fernando", 15, 3000, "Mercadeo"),
                new Empleado("Flor", 17, 3000, "Tecnologia"));

        Evaluador evaluador = new Evaluador();

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad<=18) && departamento.equals("Cobranzas");
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad<=18) && departamento.equals("Tecnologia");

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        List<Empleado> reporte1 = evaluador.evaluar(listaEmpleado, criterio);

        System.out.println("Empleados de Cobranzas o Tecnologia menores de 18 años");
        reporte1.forEach(empleado -> {
            System.out.println(empleado.getNombre()+" Edad: "+empleado.getEdad()+" Departamento: "+empleado.getDepartamento());
        });
    }
}
