package com.programacionFuncional.dummy.funciones.interfazBinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class interfazBinaryOperator {

    public static void main(String args[]){

        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;
        //Aplicando apply
        int resultado = binaryOperator.apply(20,20);
        System.out.println("el resultado es: "+resultado);

        //Uso del metodo minBy
        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.minBy(Comparator.naturalOrder()); // Comparator.naturalOrder()
        resultado = binaryOperator1.apply(40, 30);
        System.out.println("el num menor de 40 y 30 es: "+resultado);

        //Uso del metodo maxBy
        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2)); // Comparator.naturalOrder()
        resultado = binaryOperator2.apply(40, 30);
        System.out.println("el num mayor de 40 y 30 es: "+resultado);
    }
}
