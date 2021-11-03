package com.programacionFuncional.dummy.funciones.interfazBiConsumer;

import java.util.function.BiConsumer;

public class TestConsumer {


    public static void main (String args[]){
        BiConsumer<Double, Double> biConsumer = (num1, num2) -> {
            double mult = num1*num2;
            System.out.println("el resultado es:"+ mult);
        };

        biConsumer.accept(20.12, 30.23);
    }
}
