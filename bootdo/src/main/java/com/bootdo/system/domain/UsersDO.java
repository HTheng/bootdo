package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户注册信息
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class UsersDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//用户ID
	private String userid;
	//密码
	private String password;
	//注册手机
	private String regPhone;
	//微信ID
	private String wechatid;
	//积分
	private Integer integration;
	//余额
	private Double balance;
	//
	private Long createBy;
	//
	private Date createTime;
	//
	private Long updateBy;
	//
	private Date updateTime;

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
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：注册手机
	 */
	public void setRegPhone(String regPhone) {
		this.regPhone = regPhone;
	}
	/**
	 * 获取：注册手机
	 */
	public String getRegPhone() {
		return regPhone;
	}
	/**
	 * 设置：微信ID
	 */
	public void setWechatid(String wechatid) {
		this.wechatid = wechatid;
	}
	/**
	 * 获取：微信ID
	 */
	public String getWechatid() {
		return wechatid;
	}
	/**
	 * 设置：积分
	 */
	public void setIntegration(Integer integration) {
		this.integration = integration;
	}
	/**
	 * 获取：积分
	 */
	public Integer getIntegration() {
		return integration;
	}
	/**
	 * 设置：余额
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	/**
	 * 获取：余额
	 */
	public Double getBalance() {
		return balance;
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
