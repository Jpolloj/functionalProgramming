package com.programacionFuncional.dummy.pruebaAngel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class puntoOne {

    /**
     * Given-> Un arreglo de enteros positivos.
     * When-> Recorrer el arreglo.
     * Then-> Retornar los conjuntos de pares encontrados en el arreglo.
     */
    public static void main(String args[]) {
        /***************************
         * ENTRADAS
         ***************************/
        //List<Integer> socks = Arrays.asList(9, 10, 20, 20, 10, 10 ,30, 50, 10 , 20);
        List<Integer> socks = Arrays.asList(10, 10, 20, 20, 10, 10 ,30, 50, 10 , 20, 30, 60, 50);
        //List<Integer> socks = Arrays.asList(1, 2, 1, 2, 1, 3, 2);

        /***************************
         * PROCESO
         ***************************/
        Collections.sort(socks);
        Integer pairs = 0;
        for (int i = 0; i < socks.size(); i++)

            if (i < socks.size() - 1)
                if (socks.get(i) == socks.get(i + 1)) {
                    pairs++;
                    i++;
                }

        /***************************
         * SALIDA
         ***************************/
        System.out.println("pares: " + pairs);
    }
}


