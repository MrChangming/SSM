package Mrchangming.spring.dao.impl;

import Mrchangming.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
