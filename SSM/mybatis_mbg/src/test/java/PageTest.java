import Mrchangming.mybatis.mapper.EmpMapper;
import Mrchangming.mybatis.pojo.Emp;
import Mrchangming.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/3
 */
public class PageTest {
    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getsqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Page<Object> page = PageHelper.startPage(5, 4);
        List<Emp> list = mapper.selectByExample();
        //查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
        list.forEach(System.out::println);
        System.out.println(pageInfo);

    }
}
