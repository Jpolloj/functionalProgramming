package com.programacionFuncional.dummy.lambdaAmbiguedad;

import com.programacionFuncional.dummy.lambdaConParams.LambdaParamsController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lambda")

public class LambdaAmbiguaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaParamsController.class);

    @GetMapping("/conParams")
    public Boolean getDummy(){
        engine((ILambdaAnbiguaInt) (x, y) -> {
            int a = x+y;
            return a;
        }, 1,2);
        engine((ILambdaAnbiguaLong) (x, y) -> {
            Long b = x+y;
            return b;
        }, 2L,10L);
        return true;
    }

    public static void engine(ILambdaAnbiguaInt iLambdaAnbiguaInt, int x, int y){
        iLambdaAnbiguaInt.calcInt(x, y);
    }

    public static void engine(ILambdaAnbiguaLong iLambdaAnbiguaLong, Long x, Long y){ iLambdaAnbiguaLong.calclLong(x, y); }

}
