package com.programacionFuncional.dummy.lambdas.lambdaConParams;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
@RequestMapping("/lambda")

public class LambdaParamsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaParamsController.class);

    @GetMapping("/params")
    public Boolean getDummy(){
        /*
            ILambdaReturn ie = (num1, num2) -> {
                LOGGER.info(String.valueOf(num1*num2));
                return num1+num2;
            };
         */
        metodo((num1, num2) ->  num1*num2, 20, 24);
        return true;
    }

    public void metodo(ILambdaParams interfaceExample, int num1, int num2){
        interfaceExample.operacion(num1, num2);
        LOGGER.info(String.valueOf(interfaceExample.operacion(num1, num2)));
    }
}


