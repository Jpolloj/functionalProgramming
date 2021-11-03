package com.programacionFuncional.dummy.funciones.interfazFunction2;


import java.util.function.Function;

/**
 *
 */
public class DatosComensal {

    public static void main (String[] args){
        Comensal comensal = new Comensal("Jhon", 254.1, 5);
        String nombreCom = (String) getDatoComensal(comensal, x -> comensal.getNombre());

        int mesa = (int) getDatoComensal(comensal, x -> x.getMesa());

        System.out.println("El nombre del comensal es:"+ nombreCom);
        System.out.println("La mesa del comensal es:"+ mesa);

    }

   public static Object getDatoComensal( Comensal comensal, Function<Comensal, Object> function ){
       return function.apply(comensal);
   }

}
