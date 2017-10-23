package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户收货地址信息表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class UserinfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer infoid;
	//用户ID
	private String userid;
	//用户姓名
	private String name;
	//手机号码
	private String phone;
	//收货地址
	private String address;
	//邮编
	private String zipCode;
	//是否为默认地址, 0:否
	private Integer defaultAddress;
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
	public void setInfoid(Integer infoid) {
		this.infoid = infoid;
	}
	/**
	 * 获取：设置主键自增
	 */
	public Integer getInfoid() {
		return infoid;
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
	 * 设置：用户姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：收货地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：收货地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：邮编
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * 获取：邮编
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * 设置：是否为默认地址, 0:否
	 */
	public void setDefaultAddress(Integer defaultAddress) {
		this.defaultAddress = defaultAddress;
	}
	/**
	 * 获取：是否为默认地址, 0:否
	 */
	public Integer getDefaultAddress() {
		return defaultAddress;
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
