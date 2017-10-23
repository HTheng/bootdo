package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 订单表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class OrdersDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer id;
	//自动生成（如果一个订单有多个不同商品，则插入多条记录，并且OrderID相同）
	private String orderid;
	//产品ID
	private Integer productid;
	//产品名称
	private String productname;
	//产品数量
	private Integer quantity;
	//总价
	private Double totalprice;
	//订单时间
	private Date ordertime;
	//用户ID
	private String userid;
	//收货信息ID
	private Integer infoid;
	//0表示在购物车中；1表示已下单
	private Integer status;
	//表示未付款，1已付款
	private Integer payment;
	//0:待发货； 1:已发货； 已收货
	private Integer delivery;
	//备注
	private String remarks;
	//
	private Long createBy;
	//
	private Date createTime;
	//
	private Long updateBy;
	//
	private Date updateTime;

	/**
	 * 设置：设置主键自增
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：设置主键自增
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：自动生成（如果一个订单有多个不同商品，则插入多条记录，并且OrderID相同）
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	/**
	 * 获取：自动生成（如果一个订单有多个不同商品，则插入多条记录，并且OrderID相同）
	 */
	public String getOrderid() {
		return orderid;
	}
	/**
	 * 设置：产品ID
	 */
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	/**
	 * 获取：产品ID
	 */
	public Integer getProductid() {
		return productid;
	}
	/**
	 * 设置：产品名称
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * 获取：产品名称
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * 设置：产品数量
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 获取：产品数量
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 设置：总价
	 */
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	/**
	 * 获取：总价
	 */
	public Double getTotalprice() {
		return totalprice;
	}
	/**
	 * 设置：订单时间
	 */
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	/**
	 * 获取：订单时间
	 */
	public Date getOrdertime() {
		return ordertime;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户ID
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * 设置：收货信息ID
	 */
	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}
	/**
	 * 获取：收货信息ID
	 */
	public Integer getInfoid() {
		return infoid;
	}
	/**
	 * 设置：0表示在购物车中；1表示已下单
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：0表示在购物车中；1表示已下单
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：表示未付款，1已付款
	 */
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	/**
	 * 获取：表示未付款，1已付款
	 */
	public Integer getPayment() {
		return payment;
	}
	/**
	 * 设置：0:待发货； 1:已发货； 已收货
	 */
	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}
	/**
	 * 获取：0:待发货； 1:已发货； 已收货
	 */
	public Integer getDelivery() {
		return delivery;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：
	 */
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
	/**
	 * 获取：
	 */
	public Long getCreateBy() {
		return createBy;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * 获取：
	 */
	public Long getUpdateBy() {
		return updateBy;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
