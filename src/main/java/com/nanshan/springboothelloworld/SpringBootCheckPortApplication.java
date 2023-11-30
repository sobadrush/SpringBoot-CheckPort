package com.nanshan.springboothelloworld;

import com.nanshan.springboothelloworld.conditionbean.MyCondition;
import com.nanshan.springboothelloworld.model.DeptVO;
import com.nanshan.springboothelloworld.model.EmpVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
public class SpringBootCheckPortApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCheckPortApplication.class, args);
    }

    @Bean
    @Conditional(value = { MyCondition.class })
    public DeptVO deptVO_1() {
        System.err.println("=== Create DeptVO_1 Bean ===");
        return new DeptVO();
    }

    @Bean
    @ConditionalOnProperty(prefix = "dept", name = "is.enable", havingValue = "1")
    public DeptVO deptVO_2() {
        System.err.println("=== Create DeptVO_2 Bean ===");
        return new DeptVO();
    }

    @ConditionalOnBean(name = { "deptVO_1" })
    @Bean
    public EmpVO empA() {
        System.err.println("=== Create empA Bean ===");
        return EmpVO.builder().empId(9527L).empName("Roger").build();
    }

    @ConditionalOnMissingBean(name = { "deptVO_2" })
    @Bean
    public EmpVO empB() {
        System.err.println("=== Create empB Bean ===");
        return EmpVO.builder().empId(5566L).empName("Kelly").build();
    }


    // @ConditionalOnExpression("'${user.enable}' == '1' and '${user.open}' == '2'")
    @ConditionalOnExpression("'${user.enable}' == '1' or '${user.open}' == '2'")
    @Bean
    public EmpVO empC() {
        System.err.println("=== Create empC Bean ===");
        return EmpVO.builder().empId(7788L).empName("Joyce").build();
    }

}
