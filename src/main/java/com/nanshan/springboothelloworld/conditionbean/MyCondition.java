package com.nanshan.springboothelloworld.conditionbean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author RogerLo
 * @date 2023/11/30
 */
public class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean isCreate = true;
        System.err.println("MyCondition = " + isCreate);
        return isCreate;
    }

}
