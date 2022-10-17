package Mrchangming.spring.service.impl;

import Mrchangming.spring.dao.UserDao;
import Mrchangming.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author MrChangMing
 * @Description
 * @data 2022/10/6
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void savaUser() {
        userDao.saveUser();
    }
}
