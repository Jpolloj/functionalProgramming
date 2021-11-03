package com.programacionFuncional.dummy.funciones.interfazCumstomized;


@FunctionalInterface
public interface TriFunctionCustom<T, U, Y, R> {
    /**
     *
     * @param t
     * @param u
     * @param y
     * @return
     */
    R apply(T t, U u, Y y);
}
