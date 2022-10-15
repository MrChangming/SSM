package Mrchangming.spring.test;

import Mrchangming.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */
public class lifeCycleTest {
    /**
     * 1.实例化
     * 2.依赖化
     * 3.后置处理器postProcessBeforeInitialization
     * 4.初始化，需要通过bean的init-method属性指定初始化的方法
     * 5.后置处理器postProcessAfterInitialization
     * 6
     * .IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
     *
     * 注意：
     * 若bean的作用域为单例时，声明周期的前三个步骤会在获取IOC容器时执行
     * 若bean的作用域为多例时，声明周期的前三个步骤会在获取bean容器时执行
     */
    @Test
    public void test(){
        //ConfigurableApplicationContext是AppkicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
        ioc.close();
    }
}
