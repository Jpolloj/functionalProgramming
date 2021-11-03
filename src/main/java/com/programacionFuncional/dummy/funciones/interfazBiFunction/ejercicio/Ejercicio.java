package com.programacionFuncional.dummy.funciones.interfazBiFunction.ejercicio;

import com.programacionFuncional.dummy.funciones.interfazFunction2.Comensal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Ejercicio {

    //Desafio; Crear una tienda la cual calcule el total de los productos de un carrito,
    //         Adicional pueda aplicar un descuento del 20% a todos los productos del carrito
    //Resolver ejercicio implementando BiFunction<T,U,R>
    //Donde T es un genérico que indica el tipo de entrada(Input) de la función
    //Donde U es un genérico que indica el tipo de entrada(Input) de la función
    //Donde R es un genérico que indica el tipo de respuesta de la función.


    /**
     * Given-> una Lista de productos {@link Productos}
     * Then-> retornar el resultado de la transaccion del total de los productos vs el pago del cliente.
     */
    public static void main (String args[]){

        String vueltos = Tienda.venta(Productos.builder().item("Paleta Dracula").precio(1500.50).build(),
                2000.0, (pagoCliente, valorUnitario) -> String.valueOf(pagoCliente - valorUnitario) );

        System.out.println("Las vueltas de su compra :"+vueltos+ "\nGracias por su compra. \nVuelva pronto!");

//--------------------------------------------------------------------------------------------------
        List<Productos> carrito = Arrays.asList(new Productos("Paleta", 100.40),
                        new Productos("Carne Res", 540.50));


        AtomicReference<Double> cuentaParcial = new AtomicReference<>(0.0);
        carrito.forEach( items -> cuentaParcial.set(cuentaParcial.get() + items.getPrecio()));

        String vueltosCarrito =
                Tienda.venta(Productos.builder().item("Total").precio(cuentaParcial.get()).build(),
                500.0,
                (pagoCliente, valorCompra) -> {
                    if((pagoCliente - valorCompra)<0 )
                        return "Pago Insuficiente";
                    return String.valueOf(pagoCliente - valorCompra);
                });
        System.out.println("\nLas vueltas de su compra :"+vueltosCarrito+ "\nGracias por su compra. \nVuelva pronto!\n\n");



//--------------------------------------------------------------------------------------------------
        List<Productos> carrito2 = Arrays.asList(new Productos("Paleta", 100.40),
                new Productos("Carne Res", 540.50));

        List<Productos> productosDesc = Tienda.descuentoCarrito(carrito2, 20.0, (productos, descuento) -> {
            Double precioDescuento = productos.getPrecio() - (productos.getPrecio() * (descuento / 100.0));
            System.out.println("El producto: "+productos.getItem()+" con valor: "
                    +productos.getPrecio()+" Queda con un 20% menos: "+precioDescuento);
            return Productos.builder().item(productos.getItem()).precio(precioDescuento).build();
        });

        Double cuentalTotal = 0.0;
        for (Productos productos : productosDesc) { cuentalTotal = cuentalTotal+productos.getPrecio();}

        vueltosCarrito = Tienda.venta(Productos.builder().item("Total").precio(cuentalTotal).build(),
                3000.0,
                (pagoCliente, valorCompra) -> {
                    System.out.println("Su pago por valor de: "+pagoCliente);
                    System.out.println("\nEl total de la compra es: "+(pagoCliente - valorCompra));
                    if((pagoCliente - valorCompra)<0 )
                        return "Pago Insuficiente";
                    return String.valueOf(pagoCliente - valorCompra);
                });

        System.out.println("\nLas vueltas de su compra con descuento del 20% :"+vueltosCarrito+ "\nGracias por su compra. \nVuelva pronto!");
    }



}
