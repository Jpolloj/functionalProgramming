package com.programacionFuncional.dummy.funciones.interfazBiPredicate;

import java.util.function.BiPredicate;

public class TestBiPredicate {

    public static  void main (String args[]){
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x<y;
        System.out.println(biPredicate.test(20, 10));
    }
}
