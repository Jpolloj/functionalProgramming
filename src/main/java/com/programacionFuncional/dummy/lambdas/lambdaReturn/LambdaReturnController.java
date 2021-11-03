package com.programacionFuncional.dummy.lambdas.lambdaReturn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lambda")

public class LambdaReturnController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaReturnController.class);

    @GetMapping("/return")
    public Boolean getDummy(){
        engine((x,y) -> x+y);
        engine((x,y) -> x-y);
        engine((x,y) -> x*y);
        engine((x,y) -> x/y);
        return true;
    }

    private static void engine(ILambdaReturn iLambdaReturn){
        int x = 2, y = 4;
        int resultado = iLambdaReturn.calcular(x, y);
        LOGGER.info(String.valueOf(resultado));
    }
}


