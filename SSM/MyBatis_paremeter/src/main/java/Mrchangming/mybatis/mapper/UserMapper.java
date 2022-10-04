package Mrchangming.mybatis.mapper;

import Mrchangming.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/24
 */
public interface UserMapper {
    //根据用户查询语句
    User getUserByUsername(String username);

    User checkLogin(String username,String password);

    //一map集合作为参数
    User checkLoginByMap(Map<String, Object> map);

    void insertUser(User user);

    //验证登录
    User checkLoginByParam(@Param("name") String name, @Param("password") String password);

}
