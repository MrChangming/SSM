package Mrchangming.spring.aop.xml;

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
public class ValidateAspect {

    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }



}
