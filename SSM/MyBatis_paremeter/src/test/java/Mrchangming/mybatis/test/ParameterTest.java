package Mrchangming.mybatis.test;

import Mrchangming.mybatis.mapper.UserMapper;
import Mrchangming.mybatis.pojo.User;
import Mrchangming.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/24
 */
public class ParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("Ainn");
        System.out.println(user);
    }

    @Test
    public void testcheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("Ainn", "111111");
        System.out.println(user);
    }

    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Ainn");
        map.put("password", "111111");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testinsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "root", "123456", 33, "女", "123@qq.com");
        mapper.insertUser(user);
    }

    @Test


    public void testcheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("root", "123456");
        System.out.println(user);
    }
}
