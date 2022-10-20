package Mrchangming.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/18
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    @Before("execution(* Mrchangming.spring.aop.annotation.CalculatorImpl.*(..))")
    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }



}
