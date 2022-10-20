package Mrchangming.spring.test;

import Mrchangming.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/16
 */
public class AOPByAnnotationTest {
    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop_annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1,1);
    }
}
