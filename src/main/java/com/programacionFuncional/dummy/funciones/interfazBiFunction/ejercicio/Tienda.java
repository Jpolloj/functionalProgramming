package com.programacionFuncional.dummy.funciones.interfazBiFunction.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public interface Tienda {

    static String venta(Productos productos, Double pago, BiFunction<Double, Double, String> biFunction){
        return biFunction.apply(pago, productos.getPrecio());
    }

    static List<Productos> descuentoCarrito(List<Productos> productos, Double descuento, BiFunction<Productos, Double, Productos> biFunction ){
        List<Productos> descuentos = new ArrayList<>();
        productos.forEach( (item) -> descuentos.add( biFunction.apply(item, descuento)));
        return descuentos;
    }
}
