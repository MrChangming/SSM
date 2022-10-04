package Mrchangming.mybatis.test;

import Mrchangming.mybatis.mapper.SpecialSQLMapper;
import Mrchangming.mybatis.pojo.User;
import Mrchangming.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/25
 */
public class SpecialSQLMapperTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> a = mapper.getUserByLike("i");
        a.forEach(System.out::println);
    }

    @Test
    public void testDelectUser(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("9,10");
    }

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> smm_test_01 = mapper.getUserList("smm_test_01");
        smm_test_01.forEach(System.out::println);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"xiaoming","123456",23,"男","888@163.com");
        mapper.insertUser(user);
        System.out.println(user);

    }

}
