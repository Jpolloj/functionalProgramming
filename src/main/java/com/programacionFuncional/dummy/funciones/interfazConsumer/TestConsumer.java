package com.programacionFuncional.dummy.funciones.interfazConsumer;

import java.util.Locale;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String args[]){
        Consumer<String> consumer = x -> System.out.println(x.toUpperCase(Locale.ROOT));
        consumer.accept("Hola Mundo");
    }

}
