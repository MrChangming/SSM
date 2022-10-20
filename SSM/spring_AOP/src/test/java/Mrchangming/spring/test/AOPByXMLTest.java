package Mrchangming.spring.test;

import Mrchangming.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/19
 */
public class AOPByXMLTest {
    @Test
    public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop_xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1,1);
    }
}
