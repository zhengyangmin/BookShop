package com.book.bookshop.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: jzhang
 * @Date: 2019/9/29 10:14
 * @Description: 用户购物车信息展示对象
 */
@Data
public class UserCartVo {
    private Integer num;
    private double totalPrice;
}
