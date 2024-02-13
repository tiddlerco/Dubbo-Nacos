package com.dubbo.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dubbo.order.domain.User;
import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}