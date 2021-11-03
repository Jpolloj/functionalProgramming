package com.programacionFuncional.dummy.funciones.interfazBiFunction;

public class EjercicioBiFunction2 {

    public static void main (String[] args){

        Calculadora calculadora = new Calculadora();
        String resultado =calculadora.calc((x, y) -> ": " + (x * y), 5 , 5);
        System.out.println("El reslutado es: "+ resultado);

    }
}
