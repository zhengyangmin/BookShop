package com.book.bookshop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.bookshop.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Auther: jzhang
 * @Date: 2019/9/24 15:51
 * @Description:
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
