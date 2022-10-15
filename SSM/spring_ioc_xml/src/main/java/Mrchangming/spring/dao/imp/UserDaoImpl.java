package Mrchangming.spring.dao.imp;

import Mrchangming.spring.dao.Userdao;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */
public class UserDaoImpl implements Userdao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
