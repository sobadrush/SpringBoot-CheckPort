package com.nanshan.springboothelloworld.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 空調
 */
@Getter
@Setter
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AirConditioner {

    private int price;

    public String getSpec() {
        return "空調規格";
    }
}
