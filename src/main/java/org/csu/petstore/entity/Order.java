package org.csu.petstore.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@TableName("orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("orderid")
    private Integer orderId;

    @TableField("userid")
    private String userId;

    @TableField("orderdate")
    private LocalDate orderDate;

    @TableField("shipaddr1")
    private String shipAddr1;

    @TableField("shipaddr2")
    private String shipAddr2;

    @TableField("shipcity")
    private String shipCity;

    @TableField("shipstate")
    private String shipState;

    @TableField("shipzip")
    private String shipZip;

    @TableField("shipcountry")
    private String shipCountry;

    @TableField("billaddr1")
    private String billAddr1;

    @TableField("billaddr2")
    private String billAddr2;

    @TableField("billcity")
    private String billCity;

    @TableField("billstate")
    private String billState;

    @TableField("billzip")
    private String billZip;

    @TableField("billcountry")
    private String billCountry;

    @TableField("courier")
    private String courier;

    @TableField("totalprice")
    private BigDecimal totalPrice;

    @TableField("billtofirstname")
    private String billToFirstname;

    @TableField("billtolastname")
    private String billToLastname;

    @TableField("shiptofirstname")
    private String shipToFirstname;

    @TableField("shiptolastname")
    private String shipToLastname;

    @TableField("creditcard")
    private String creditCard;

    @TableField("exprdate")
    private String expiryDate;

    @TableField("cardtype")
    private String cardType;

    @TableField("locale")
    private String locale;
}
