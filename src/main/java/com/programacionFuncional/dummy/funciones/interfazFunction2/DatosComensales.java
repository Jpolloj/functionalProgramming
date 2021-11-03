package com.programacionFuncional.dummy.funciones.interfazFunction2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {


    public static void main(String[] args){
        List<Comensal> listaComensales = Arrays.asList(
                new Comensal("Javier", 10, 5),
                new Comensal("Jhon", 14.15, 4),
                new Comensal("Tatiana", 11.15, 3),
                new Comensal("Fernando", 10.15, 2),
                new Comensal("Flor", 1021.15, 1)
        );
        List<Object> nombresComensales =
                getDatosComensales(listaComensales, x -> x.getNombre());

        List<Object> montosComensales =
                getDatosComensales(listaComensales, x -> x.getMonto_pedido());

        System.out.println("Los comensales son: ");
        nombresComensales.forEach((nombre) -> System.out.println("El nombre es: "+ nombre));

        System.out.println("Los montos son: ");
        montosComensales.forEach((montos) -> System.out.println("El monto es: "+ montos));

    }

    public static List<Object> getDatosComensales(List<Comensal> comensalList, Function<Comensal, Object> function){
        List<Object> listDatos = new ArrayList<>();
        comensalList.forEach( (comensal) -> listDatos.add(function.apply(comensal)));
        return listDatos;
    }
}
