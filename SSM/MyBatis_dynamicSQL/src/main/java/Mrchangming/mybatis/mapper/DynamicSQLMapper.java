package Mrchangming.mybatis.mapper;

import Mrchangming.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/2
 */
public interface DynamicSQLMapper {
    //根据条件查询员工信息
    List<Emp> getEmpByCondition(Emp emp);

    //使用choose查询员工信息
    List<Emp> getEmpBychoose(Emp emp);

    //批量添加员工信息
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
