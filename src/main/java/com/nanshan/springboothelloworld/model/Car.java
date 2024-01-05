package com.nanshan.springboothelloworld.model;


import com.nanshan.springboothelloworld.SpringBootCheckPortApplication;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class Car {

    @Autowired
    private Engine engine;

    @Lookup
    public AirConditioner getAirConditioner() {
        return null;
    }

    // public static void main(String[] args) {
    //     ConfigurableApplicationContext context
    //         = new AnnotationConfigApplicationContext(SpringBootCheckPortApplication.class);
    //
    //     Car car1 = context.getBean(Car.class);
    //     System.out.println("car1 = " + car1);
    //     System.out.println("  car1.getEngine = " + car1.getEngine());
    //
    //     Car car2 = context.getBean(Car.class);
    //     System.out.println("car2 = " + car2);
    //     System.out.println("  car2.getEngine = " + car2.getEngine());
    //
    //     context.close();
    // }


    public static void main(String[] args) {
        ConfigurableApplicationContext context
            = new AnnotationConfigApplicationContext(SpringBootCheckPortApplication.class);

        Car car1 = context.getBean(Car.class);
        AirConditioner airConditioner1 = car1.getAirConditioner();
        System.out.println("car1 取得 airConditioner1 = " + airConditioner1);

        AirConditioner airConditioner2 = car1.getAirConditioner();
        System.out.println("car1 取得 airConditioner2 = " + airConditioner2);

        context.close();
    }
}
