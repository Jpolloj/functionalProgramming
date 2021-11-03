package com.programacionFuncional.dummy.funciones.interfazFunction;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Herramienta {
    private Boolean martillo;
    private Boolean cierra;
    private Boolean cerrucho;
}
