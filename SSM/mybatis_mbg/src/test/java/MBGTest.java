import Mrchangming.mybatis.mapper.EmpMapper;
import Mrchangming.mybatis.pojo.Emp;
import Mrchangming.mybatis.pojo.EmpExample;
import Mrchangming.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/3
 */
public class MBGTest {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
        //查询所有数据
//        List<Emp> list = mapper.selectByExample(null);
//        list.forEach(System.out::println);
        //根据条件查询数据
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
//        empExample.or().andEmpNameEqualTo("男");
//        List<Emp> list = mapper.selectByExample(empExample);
//        list.forEach(System.out::println);
        Emp emp = new Emp(5,"小黑", null,"女");
        //测试普通修改功能
        //mapper.updateByPrimaryKey(emp);
        //测试选择性修改
        mapper.updateByPrimaryKeySelective(emp);
    }

}
