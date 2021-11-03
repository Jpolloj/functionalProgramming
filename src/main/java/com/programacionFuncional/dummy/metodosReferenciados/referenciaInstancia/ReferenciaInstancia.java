package com.programacionFuncional.dummy.metodosReferenciados.referenciaInstancia;

import com.programacionFuncional.dummy.metodosReferenciados.Empleado;

public class ReferenciaInstancia {

    public int compararPorNombre(Empleado e1, Empleado e2){
        return e1.getNombre().compareTo(e2.getNombre());
    }

    public int compararEdad(Empleado e1, Empleado e2){
        return e1.getEdad().compareTo(e2.getEdad());
    }
}
