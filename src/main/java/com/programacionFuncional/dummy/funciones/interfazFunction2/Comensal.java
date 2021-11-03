package com.programacionFuncional.dummy.funciones.interfazFunction2;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Comensal {

    String nombre;
    double monto_pedido;
    int mesa;
}
