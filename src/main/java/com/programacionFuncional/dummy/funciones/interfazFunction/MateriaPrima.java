package com.programacionFuncional.dummy.funciones.interfazFunction;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MateriaPrima {
    private Boolean acero;
    private Boolean madera;
    private Boolean metal;
    private Boolean plastico;
    private Boolean aluminio;
}
