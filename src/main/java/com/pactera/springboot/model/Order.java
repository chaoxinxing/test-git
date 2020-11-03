package com.pactera.springboot.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;

/**
 * @ClassName Order
 * @Description TODO
 * @Author fseve
 * @Date 2020/10/30 15:10
 * @Version 1.0
 **/
@TableName("demo_order")
@Data
public class Order {
    @TableId
    private String orderNo;
    private String name;
    private String productCode;
    private String productName;
    private Integer number;
    private Date dateTime;
    private String memberCode;
    private String memberName;
    private String mobile;
    private String address;
    private String remark;
}
