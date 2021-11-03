package com.programacionFuncional.dummy.funciones.interfazComparator;

import java.util.*;

public class interfazComparator {

    public static void main(String args[]){

        List<Persona> personas = Arrays.asList(
                new Persona("Jhon", 26, new Date(1995, 3,24)),
                new Persona("Lucho", 20, new Date(1995, 1,29)),
                new Persona("Diana", 21, new Date(1994, 4,21)));

        Comparator<Persona> edadComparator = (Comparator.comparingInt(Persona::getEdad));
        System.out.println(personas);
        Collections.sort(personas, edadComparator);
        System.out.println(personas);

        Comparator<Persona> fechaComparator = ((fecha1, fecha2) -> fecha1.getNacimiento().compareTo(fecha2.getNacimiento()));
        Collections.sort(personas, fechaComparator);
        System.out.println(personas);
    }
}
