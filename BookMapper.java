package com.book.bookshop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.bookshop.entity.Book;

/**
 * @Auther: jzhang
 * @Date: 2019/9/24 09:54
 * @Description: 图书接口
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
