package com.programacionFuncional.dummy.funciones.interfazSupplier;

import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {

    public static void main(String args[]){

        Supplier<String> stringSupplier = () -> "Hi World".toUpperCase();
        System.out.println("\nEl valor pasado es: "+stringSupplier.get());

        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println("\nNumero Random: "+ doubleSupplier.get());

        Stream.generate(doubleSupplier).limit(3).forEach(System.out::println);
    }
}
