package Mrchangming.spring.service.imp;

import Mrchangming.spring.dao.Userdao;
import Mrchangming.spring.service.UserService;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */
public class UserServiceImp1 implements UserService {
    private Userdao userDao;

    public Userdao getUserDao() {
        return userDao;
    }

    public void setUserDao(Userdao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
