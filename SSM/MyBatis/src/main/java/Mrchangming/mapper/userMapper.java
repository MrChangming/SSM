package Mrchangming.mapper;

import Mrchangming.pojo.UserTest;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/21
 */
public interface userMapper {
    int insertUser();

    void updateUser();

    void deleteUser();

    //根据id来查询用户信息
    UserTest getUserById();

    //查询所有的用户信息
    List<UserTest> getAllUser();
}
