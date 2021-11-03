package com.programacionFuncional.dummy.funciones.interfazBiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

    public static void main (String args[]){

        Map<String, String> map = new HashMap<>();
        String[][] arreglo = {{"Col", "Bogota"}, {"EEUU", "Washinton"}, {"Ven", "Caracas"}};

        for( int i=0; i<arreglo.length; i++){
            map.put( arreglo[i][0], arreglo[i][1]);
        }

        System.out.println("Usando forma tradicional clave valor de un mapa");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        if(iterator != null) {
            while(iterator.hasNext()){
                Map.Entry<String, String> entry = iterator.next();
                System.out.println("Clave:"+ entry.getKey()+" Valor: "+entry.getValue());
            }
        }

        System.out.println("\nUsando BiConsumer y expresiones Lambda");
        map.forEach( (key, value) -> System.out.println("Clave:"+ key+" Valor: "+value));
    }
}
