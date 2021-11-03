package com.programacionFuncional.dummy.funciones.interfazCumstomized;

public interface IReglaDeTres {

    static Double calculateRule(Integer fac1, Integer fac2, Integer fac3, TriFunctionCustom<Integer, Integer, Integer, Double> triFunction){
        return triFunction.apply(fac1, fac2, fac3);
    }
}
