package com.programacionFuncional.dummy.funciones.interfazComparator;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Persona {

    private String nombre;
    private Integer edad;
    private Date nacimiento;

}
