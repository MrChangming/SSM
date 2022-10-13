import Mrchangming.spring.pojo.Hellowrold;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/4
 */
public class HelloWorldTest {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        Hellowrold helloWorld = (Hellowrold) ioc.getBean("hellowrold");
        helloWorld.sayHellow();
    }
}
