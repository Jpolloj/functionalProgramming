package com.programacionFuncional.dummy.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class puntoThree {


    /**
     * Given-> Un arreglo de enteros positivos.
     * When-> Recorrer el arreglo.
     * Then-> Retornar la cantidad de numeros mayores en el arreglo
     */
    public static void main (String args[]){

        //List<Integer> belas = Arrays.asList(4, 4, 1, 3);
        //List<Integer> belas = Arrays.asList(3, 2, 1, 3);
        //List<Integer> belas = Arrays.asList(4, 4, 4, 2, 1, 3);
        List<Integer> candle = Arrays.asList(4, 4, 4, 2, 1, 3, 4, 1, 6, 6, 1, 7, 9, 9, 5, 22, 4, 22);

        Collections.sort(candle, Collections.reverseOrder());

        System.out.println(candle);
        Integer candleOff = 0;
        for(int i = 0; i<candle.size(); i++)
            if(i<candle.size()-1)
                if (candle.get(0).equals(candle.get(i))) candleOff ++;
                else break;
        System.out.println(candleOff);
    }
}
