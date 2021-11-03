package com.programacionFuncional.dummy.funciones.interfazCumstomized;

public class ReglaDeTres {

    public static void main (String args[]){

        Integer teamTech = 20;
        Integer techPizzas = 4;

        Integer teamAdmon = 60;
        Double admonPizzas = IReglaDeTres.calculateRule(teamAdmon, techPizzas, teamTech, (x, y, z) -> Double.valueOf((x*y)/z));

        System.out.printf("Se necesitan %.0f pizzas para el grupo Admon de %d personas", admonPizzas, teamAdmon);
    }

}
