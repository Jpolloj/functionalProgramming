package com.programacionFuncional.dummy.streams.opereacionesReduccion.mutable;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduccionStreamtoMap {

    public static void main(String args[]){
        List<Empleado> listaEmpleado = Arrays.asList(
                new Empleado("Jhon", 16, 1500, Empleado.Departamentos.COBRANZAS),
                new Empleado("Evelyn", 22, 3500.50, Empleado.Departamentos.FINANZAS),
                new Empleado("Fernando", 21, 3000, Empleado.Departamentos.MERCADEO),
                new Empleado("Hermes", 17, 1500, Empleado.Departamentos.COBRANZAS),
                new Empleado("Vi", 29, 6500.102, Empleado.Departamentos.FINANZAS),
                new Empleado("Carlos", 19, 3000, Empleado.Departamentos.MERCADEO),
                new Empleado("CareNecia", 10, 1500, Empleado.Departamentos.COBRANZAS),
                new Empleado("Karen", 23, 12500.31, Empleado.Departamentos.FINANZAS),
                new Empleado("Jefferson", 66, 3000, Empleado.Departamentos.MERCADEO),
                new Empleado("Lucas", 11, 1500, Empleado.Departamentos.COBRANZAS),
                new Empleado("Sandra", 12, 1500.21, Empleado.Departamentos.FINANZAS),
                new Empleado("Camilo", 13, 3000, Empleado.Departamentos.MERCADEO),
                new Empleado("Flor", 14, 3000, Empleado.Departamentos.TECNOLOGIA));

        Map<Integer, String> idANombreMapa = listaEmpleado.stream()
                .collect(Collectors.toMap(
                        (emp) -> emp.getEdad(), Empleado::getNombre));

        Map<Empleado.Departamentos, String> generoANombreMapa = listaEmpleado
                .stream()
                .collect(Collectors.toMap(
                        (emp -> emp.getDepartamento()),
                        Empleado::getNombre,
                        (nom1 ,nom2) -> String.join(", ", nom1, nom2)
                        ));

        System.out.println(idANombreMapa);
        System.out.println("");
        System.out.println(generoANombreMapa);
    }
}
