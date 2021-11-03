package com.programacionFuncional.dummy.lambasSinParams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lambda")

public class LambdaSinParamsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaSinParamsController.class);

    @GetMapping("/sinparams")
    public Boolean getDummy(){
        ILambdaSinParams ie = () -> LOGGER.info("HOLA MUNDO");
        metodo(ie);
        return true;
    }

    public void metodo(ILambdaSinParams interfaceExample){
        interfaceExample.aceptar();
    }
}


