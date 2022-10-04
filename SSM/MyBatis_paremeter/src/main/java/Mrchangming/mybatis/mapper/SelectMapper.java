package Mrchangming.mybatis.mapper;

import Mrchangming.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/24
 */
public interface SelectMapper {
    //根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    //查询搜有道用户信息
    List<User> getAllUser();

    //查询记录的总数量
    Integer getcount();

    //根据id来查询用户信息
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /*
    查询所有的用户信息为map集合
    若查询的数据有多条，并且要将每条数据转换为map集合
    此时有两种方法
    1.将mapper接口方法的返回值设置为泛型map的list科集合
    List<Map<String, Object>> getAllUserToMap();
    2.可以将每条数据转换的map集合放在一个大的map中，但是必须通过@MapKey注解
    将查询的摸个字段的之作为大的map的值
     */
//    List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}
