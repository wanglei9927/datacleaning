package com.zy.validator;

import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;


public class Num1Validator extends ValidatorHandler<Integer> implements Validator<Integer> {

    @Override
    public boolean validate(ValidatorContext context, Integer Integer){

        System.out.println(Integer);
        context.addErrorMsg("Something is wrong about the car seat count!");

        return false;
    }

}
