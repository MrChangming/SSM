package Mrchangming.spring.factory;

import Mrchangming.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 * FactoryBean是一个接口，需要创建一个可实现接口
 * 其中三个方法：
 * getObject():通过一个对象交给IOC容器管理
 * getObjectType();设置所提供对象的类型
 * issingleton():所提供的对象是否单例
 * 当把FactoryBean的实现类配置为bean时，会将当前类中的getObject（）所返回的对象交给IOC容器管理
 */

public class UserFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
