package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //注册方法
    public void register(User user);
    //展示所有
    public List<User> showAll();
    //删除
    public void  delete(Integer id);
    //登陆方法
    public  User   login(String username,String password);

}
