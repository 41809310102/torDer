package order.Dao;

import order.Do.User;

public interface WorkDao{

    //登录
    int login(User user);

    //注册
    User sign(User user);

    //查询用户信息

    void searchUserInfo(int id);


}
