package Mrchangming.mybatis.mapper;

import Mrchangming.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/2
 */
public interface CacheMapper {
    //根据员工id查询员工信息
    Emp getEmpById(@Param("empId") Integer empId);

    void insertEmp(Emp emp);
}
