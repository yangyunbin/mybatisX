package com.powernode.mapper;
import org.apache.ibatis.annotations.Param;

import com.powernode.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 19202
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-12-29 19:59:48
* @Entity com.powernode.domain.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int delByUidAndUserName(@Param("uid") Long uid, @Param("userName") String userName);

    int updateAgeAndSexByUid(@Param("age") Integer age, @Param("sex") Integer sex, @Param("uid") Long uid);

    List<User> selectAgeAndSexByAgeBetween(@Param("beginAge") Integer beginAge, @Param("endAge") Integer endAge);

    List<User> selectAllOrderByAgeDesc();
}




