package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    public void save(User user);
    public List<User> selectAll();
    public void deleteByID(Integer id);
    public  User  selectByUserNameAndPassword(@Param("username")String username,@Param("password") String password);

}
