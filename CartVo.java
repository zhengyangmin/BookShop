package com.book.bookshop.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: jzhang
 * @Date: 2019/9/26 16:06
 * @Description:
 */
@Data
public class CartVo {
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Integer count;
    private String bookName;
    private String imgUrl;
    private double newPrice;
}
