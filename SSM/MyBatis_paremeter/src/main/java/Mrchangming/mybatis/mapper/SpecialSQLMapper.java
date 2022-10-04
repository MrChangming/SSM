package Mrchangming.mybatis.mapper;

import Mrchangming.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/25
 */
public interface SpecialSQLMapper {
    //通过用户名模糊查询用户信息
    List<User> getUserByLike(@Param("mohu") String mohu);

    //批量删除
    void deleteMoreUser(@Param("ids") String ids);

    //动态设置表名，查询用户信息
    List<User> getUserList(@Param("tablename") String tablename);

    //增加用户的主键功能
    void insertUser(User user);
}
