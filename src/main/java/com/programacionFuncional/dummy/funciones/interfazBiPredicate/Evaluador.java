package com.programacionFuncional.dummy.funciones.interfazBiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador {

    public List<Empleado> evaluar(List<Empleado> listEmp, BiPredicate<Integer, String> biPredicate){
        List<Empleado> listaNueva = new ArrayList<>();

        listEmp.forEach(empleado -> {
            if (biPredicate.test(empleado.getEdad(), empleado.getDepartamento())) {
                listaNueva.add(empleado);
            }
        });
        return  listaNueva;
    }
}
