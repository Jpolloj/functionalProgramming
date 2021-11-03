package com.programacionFuncional.dummy.funciones.interfazPredicateBiFunct.evaluarEmpleado;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador {

    public List<Empleado> evaluar(List<Empleado> empleados, Predicate<Empleado> evaluar){

        List<Empleado> cumplieron = new ArrayList<>();
        empleados.forEach( empleado -> {
            if(evaluar.test(empleado)){
                cumplieron.add(empleado);
            }
        } );
        return cumplieron;
    }

    public List<Empleado> evaluarNegate(List<Empleado> empleados, Predicate<Empleado> evaluar){

        List<Empleado> cumplieron = new ArrayList<>();
        empleados.forEach( empleado -> {
            if(evaluar.negate().test(empleado)){
                cumplieron.add(empleado);
            }
        } );
        return cumplieron;
    }
}
