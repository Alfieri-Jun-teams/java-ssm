/**
 * Copyright (C), 2015-2018,
 * FileName: Userservice
 * Author:   Administrator
 * Date:     2018-10-03 10:49
 * Description: IUserService实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * Wangjun           修改时间           版本号              描述
 */

package com.jun.ssm.service.Iml;

import com.jun.ssm.dao.IUserDao;
import com.jun.ssm.model.User;
import com.jun.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional(rollbackOn = Exception.class)
public class Userservice implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    @Override
    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
}
