package com.programacionFuncional.dummy.funciones.interfazBiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public interface Calculadura2 {

    static List<Empleado> calc(List<Empleado> listEmpleado,
                             Double increment,
                             BiFunction<Empleado, Double, Empleado> biFunction){
        List<Empleado> listaSalarios = new ArrayList<>();
        listEmpleado.forEach( (empleado) -> {
            listaSalarios.add( biFunction.apply(empleado, increment));
        });
        return listaSalarios;
    }
}


