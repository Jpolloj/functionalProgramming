package com.programacionFuncional.dummy.funciones.interfazFunction;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println("Numero de Caracteres: "+convertidor.apply(3).length());
        System.out.println("Numero de Caracteres: "+convertidor.apply(300).length());

        Function<String, Boolean> convetidorStringDouble = x -> x.startsWith("J");
        System.out.println(convetidorStringDouble.apply("Jhon its a good partner :V"));




        //Desafio; Verificar la materia prima para hacer un martillo (madera y acero)
        //Resolver ejercicio implementando Function<T,R>
        //Donde T es un genérico que indica el tipo de entrada(Input) de la función
        //Donde R es un genérico que indica el tipo de respuesta de la funcion.

        /**
         * Given-> una Materia Prima {@link MateriaPrima}
         * Then-> Verificar la materia prima para hacer un martillo {@link Herramienta}.
         */

        System.out.println("Hay martillo? ");











        //Solucion Desafio;

Function<MateriaPrima, Herramienta> hacerHerramientas = material ->
        material.getAcero() && material.getMadera() ?
                Herramienta.builder().
                        martillo(true).
                        cerrucho(false).
                        cierra(false).build() :
                null;

Herramienta herramienta = hacerHerramientas.
        apply(MateriaPrima.builder()
                .acero(true)
                .madera(true)
                .aluminio(false)
                .metal(false)
                .plastico(false).build());




        System.out.println("Hay material para un martillo? " + herramienta.getMartillo());
        System.out.println("Hay material para una cierra? " + herramienta.getCierra());

    }
}









