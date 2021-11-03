package com.programacionFuncional.dummy.funciones.interfazUnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;


public class InterfaceUnaryOperator {

    public static void main(String args[]){

        List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50, 60);
        List<Integer> listaAct = operadorUnary(num -> num * num , lista);

        listaAct.forEach( num -> System.out.println("Valor: "+ num));

    }

    public static List<Integer> operadorUnary(UnaryOperator<Integer> unaryOperato, List<Integer> lista){

        List<Integer> listaActualizada = new ArrayList<>();

        lista.forEach(num -> listaActualizada.add(unaryOperato.apply(num)));

        return listaActualizada;
    }
}
