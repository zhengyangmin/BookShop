package com.book.bookshop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.bookshop.entity.Address;

/**
 * @Auther: jzhang
 * @Date: 2019/9/29 15:04
 * @Description:
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {
}
