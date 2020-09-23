package com.zy.validator;

import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Result;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.zy.validator.domain.CommityGank;

public class validatorTest {


    public static void main(String[] args) {

        CommityGank cGank = new CommityGank();

        cGank.setNum1(1);

        Result validatorResult =  FluentValidator
                .checkAll()
                .on(cGank.getNum1(),new Num1Validator())
                .doValidate().result(ResultCollectors.toSimple());

        System.out.println(validatorResult.isSuccess());
    }


}
