package cn.itcast.user.itcastuser.service;

import cn.itcast.user.itcastuser.mapper.UserMapper;
import cn.itcast.user.itcastuser.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleteUserById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
