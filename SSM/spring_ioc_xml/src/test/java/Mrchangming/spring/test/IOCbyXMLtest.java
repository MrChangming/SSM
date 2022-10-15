package Mrchangming.spring.test;

import Mrchangming.spring.pojo.Clazz;
import Mrchangming.spring.pojo.Person;
import Mrchangming.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/4
 */

/**
 * 获取bean的三种方法
 * 1.根据bean的id获取
 * 2.根据bean的类型获取
 * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
 * 若没有一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
 * 若有多个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
 * 3.根据bean的id和类型获取
 * 根据类型来获取bean时，在满足bean唯一性的前提下，其实只是看：『对象 instanceof 指定的类
 * 型』的返回结果，只要返回的是true就可以认定为和类型匹配，能够获取到。
 * 即通过bean的类型，bean所继承的类的类型，bean所实现的接口的类型都可以获取bean
 */
public class IOCbyXMLtest {
    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
//        Student studentOne = (Student) ioc.getBean("studentOne");
//        Student student = ioc.getBean(Student.class);
//        Student studentOne = ioc.getBean("studentOne", Student.class);
        Person student = ioc.getBean(Person.class);
        System.out.println(student);
    }

    @Test
    public void testDI(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring_ioc.xml");
        //获取bean
        Student student = ioc.getBean("studentThree", Student.class);
        System.out.println(student);
//        Clazz clazz = ioc.getBean("clazzInner", Clazz.class);
//        System.out.println();
//        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
//        System.out.println(clazz);
    }


}
