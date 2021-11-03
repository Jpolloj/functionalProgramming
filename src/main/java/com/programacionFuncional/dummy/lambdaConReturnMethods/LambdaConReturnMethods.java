package com.programacionFuncional.dummy.lambdaConReturnMethods;

public class LambdaConReturnMethods {

    public static  void main(String[] args){
        System.out.println("Example, "+create().calclLong(10L,2L));
    }

    private static ILambdaAnbiguaLong create(){
        return (x,y) -> x/y;
    }

}
