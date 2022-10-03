package Mrchangming;

import Mrchangming.mapper.userMapper;
import Mrchangming.pojo.UserTest;
import Mrchangming.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/21
 */
public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {
        //获取和兴配置文件输出流
        //获取和兴配置文件输出流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory对象
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象sqlSession,是MyBatis提供的操作数据库的对象
        SqlSession sqlSession = build.openSession();
        //获取UserMapper的代理实现类
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        //调用mapper接口中的的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
        System.out.println("结果：" + result);
        //提交事务
        sqlSession.commit();
        //关闭Sqlsession
        sqlSession.close();
    }


    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testdelete(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        UserTest userById = mapper.getUserById();
        System.out.println(userById);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        List<UserTest> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }
}
