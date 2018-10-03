package com.jun.ssm.dao;

import com.jun.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {
    User selectUserById(@Param("userId") long userId);
    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone,@Param("state") Short state);
    List<User> selectAllUser();
}
