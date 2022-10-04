package Mrchangming.mybatis.test;

import Mrchangming.mybatis.mapper.SelectMapper;
import Mrchangming.mybatis.pojo.User;
import Mrchangming.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/24
 */
public class SelectMapperTest {
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
    }

    @Test
    public void testGetcount(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer getcount = mapper.getcount();
        System.out.println(getcount);

    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(3);
        //{password=123, gender=男, name=ybc, id=1, age=23, email=123qq@qq.com}
        System.out.println(userByIdToMap);

    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Object>> allUserToMap = mapper.getAllUserToMap();
//        System.out.println(allUserToMap);
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        System.out.println(allUserToMap);

    }

}
