package com.programacionFuncional.dummy.lambdas.lambdaScope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lambda")

public class LambdaScopeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaScopeController.class);

    @GetMapping("/scope")
    public int getDummy(){
        System.out.println(getScope().Scopes(2, 1));
        return getScope().Scopes(2, 1);
    }

    public ILambdaScope getScope(){
        Integer abc = 190;
        return (x, y) -> {
            Integer inside = 10;
            inside = inside+x+y+abc;
            inside = secondScope().Scopes(inside, 10);
            return inside;
        };

    }

    public ILambdaScope secondScope(){
        return (x, y) -> x-y;
    }
}


