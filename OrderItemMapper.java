package com.book.bookshop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.bookshop.entity.OrderItem;

/**
 * @Auther: jzhang
 * @Date: 2019/9/29 16:36
 * @Description:
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}
