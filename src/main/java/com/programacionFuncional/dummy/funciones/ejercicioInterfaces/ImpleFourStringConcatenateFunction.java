package com.programacionFuncional.dummy.funciones.ejercicioInterfaces;

public class ImpleFourStringConcatenateFunction {

    public static void main(String[] args){

        FourStringConcatenate fourStringConcatenate =
                (str1, str2, str3, str4) -> {
                    StringBuilder stringBuilder = new StringBuilder();
                    return stringBuilder.append(str1).append(str2).append(str3).append(str4).toString();
                } ;

        System.out.println(fourStringConcatenate.concatenate("HOLA", "MUNDO", "SOY", "CPFR"));
    }
}
