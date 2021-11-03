package com.programacionFuncional.dummy.streams.opereacionesReduccion;

import java.util.stream.IntStream;

public class OperacionSummaryStadistics {
    public static void main(String args[]){

        System.out.println(IntStream.range(1, 20).summaryStatistics());
        System.out.println("suma:"+ IntStream.range(1, 20).summaryStatistics().getSum());

        System.out.println("promedio:"+ IntStream.range(1, 20).summaryStatistics().getAverage());

        System.out.println("cuenta:"+ IntStream.range(1, 20).summaryStatistics().getCount());
    }
}
