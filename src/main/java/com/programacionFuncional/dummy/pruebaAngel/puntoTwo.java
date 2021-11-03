package com.programacionFuncional.dummy.pruebaAngel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class puntoTwo {


    /**
     * Given-> Un arreglo de cinco enteros positivos.
     * When-> Recorrer el arreglo.
     * Then-> Retornar la cantidad maxima y minima que se puede
     *          lograr de acuerdo a la suma de sus elementos
     */
    public static void main (String args[]){

        List<Integer> numeros = Arrays.asList(1,3,5,7,9);

        Collections.sort(numeros);

        int min =  0;
        int max = 0;

        for(int i = 0, y = numeros.size()-1 ; i<4 && y>0; i++, y--) {
            min = min + numeros.get(i);
            max = max + numeros.get(y);
        };

        System.out.printf("%d %d",min, max);

    }
}
