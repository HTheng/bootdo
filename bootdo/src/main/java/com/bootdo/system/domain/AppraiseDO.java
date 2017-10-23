package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 评价表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class AppraiseDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer id;
	//用户ID
	private String userid;
	//自动生成（如果一个订单有多个不同商品，则插入多条记录，并且OrderID相同）
	private String orderid;
	//好，中，差 评
	private Integer ranks;
	//评价信息
	private String content;
	//是否匿名
	private Integer anonymous;
	//评价时间
	private Date appraiseDate;
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
	 * 设置：好，中，差 评
	 */
	public void setRanks(Integer ranks) {
		this.ranks = ranks;
	}
	/**
	 * 获取：好，中，差 评
	 */
	public Integer getRanks() {
		return ranks;
	}
	/**
	 * 设置：评价信息
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：评价信息
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：是否匿名
	 */
	public void setAnonymous(Integer anonymous) {
		this.anonymous = anonymous;
	}
	/**
	 * 获取：是否匿名
	 */
	public Integer getAnonymous() {
		return anonymous;
	}
	/**
	 * 设置：评价时间
	 */
	public void setAppraiseDate(Date appraiseDate) {
		this.appraiseDate = appraiseDate;
	}
	/**
	 * 获取：评价时间
	 */
	public Date getAppraiseDate() {
		return appraiseDate;
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
