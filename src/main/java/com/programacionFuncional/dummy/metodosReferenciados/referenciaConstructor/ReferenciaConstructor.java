package com.programacionFuncional.dummy.metodosReferenciados.referenciaConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReferenciaConstructor {

    public static void main(String args[]){

        List<String> numeros = Arrays.asList("10","10","20","15","55","51","100","12");

        //getResults(numeros, Integer::new).forEach(num -> ReferenciaConstructor::multiplicarPor10);
        getResults(numeros, Integer::new).forEach(ReferenciaConstructor::multiplicarPor10);
    }

    public static List<Integer> getResults(List<String> datos, Function<String, Integer> func){
        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        return resultados;
    }

    public static void multiplicarPor10(int numero){
        System.out.println("El nuevo valor del dato" + numero + " es: "+ numero * 10);
    }
}
