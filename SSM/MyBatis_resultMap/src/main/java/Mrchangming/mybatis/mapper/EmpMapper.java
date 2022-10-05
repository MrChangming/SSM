package Mrchangming.mybatis.mapper;

import Mrchangming.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/9/25
 */
public interface EmpMapper {

    //根据id查询员工的信息
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    //获取员工所对应的部门信息
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    //通过分布查询查询员工以及对应的部门信息的第一步
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    //通过分布查询查询员工以及对应的部门信息的第二步
    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
