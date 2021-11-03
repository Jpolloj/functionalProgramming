package com.programacionFuncional.dummy.funciones.interfazCumstomized;

public class TriFunctionImpl {

    public static void main(String args[]){

        TriFunctionCustom<Integer, Integer, Integer, Double> calculatePercentage = (x,y,z) -> Double.valueOf(x*y/z);

        System.out.printf("Function Prueba: %.1f", calculatePercentage.apply(50, 100, 40));
    }
}
