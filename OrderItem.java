package com.book.bookshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: jzhang
 * @Date: 2019/9/26 11:26
 * @Description:
 */
@Data
@TableName(value = "bs_order_item")
@EqualsAndHashCode(callSuper = false)
public class OrderItem extends Model<OrderItem> {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer orderId;
    private Integer bookId;
    private Integer count;

    //图书对象
    @TableField(exist = false)
    private Book book;
}
