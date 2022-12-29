package com.powernode.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.powernode.domain.User;
import com.powernode.service.UserService;
import com.powernode.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 19202
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-12-29 19:59:48
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




