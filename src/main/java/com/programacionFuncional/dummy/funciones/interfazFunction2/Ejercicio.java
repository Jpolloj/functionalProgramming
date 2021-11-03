package com.programacionFuncional.dummy.funciones.interfazFunction2;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;

public class Ejercicio {

    //Desafio; Descontar el 10% a cada mesa.
    //Resolver ejercicio implementando Function<T,R>
    //Donde T es un genérico que indica el tipo de entrada(Input) de la función
    //Donde R es un genérico que indica el tipo de respuesta de la funcion.

    /**
     * Given-> una Lista de comensales {@link Comensal}
     * Then-> retornar un descuento del 10% por mesa.
     */
    public static void main(String args[]) {
        List<Comensal> listaComensales = Arrays.asList(
                new Comensal("Alejo", 10, 5),
                new Comensal("Jhon", 14.15, 4),
                new Comensal("Monica", 11.15, 3),
                new Comensal("Jose", 10.15, 2),
                new Comensal("Sofi", 1021.15, 1),
                new Comensal("Jorge", 1101.15, 5)
        );
        listaComensales.forEach(comensal ->
                System.out.println(comensal.getNombre() + " debe pagar: " +
                        getCuenta(comensal, monto -> {
                            Double nuevoValor = monto.getMonto_pedido() - (monto.getMonto_pedido() * (10.0 / 100.0));
                            monto.setMonto_pedido(nuevoValor);
                            return monto.getMonto_pedido();
                        })
                ));
    }


    public static Double getCuenta(Comensal comensal, Function<Comensal, Double> lambda){
        return lambda.apply(comensal);
    }
}


/*


 */