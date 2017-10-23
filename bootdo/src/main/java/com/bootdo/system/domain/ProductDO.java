package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 产品表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class ProductDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer productid;
	//类别ID
	private Integer categoryid;
	//产品名称
	private String productname;
	//产品描述
	private String description;
	//产品库存
	private Integer reserve;
	//产品价格
	private Double price;
	//排序
	private Integer sort;
	//默认为1显示， 0为隐藏
	private Integer hide;
	//
	private Long createBy;
	//
	private Date createTime;
	//
	private Long updateBy;
	//
	private Date updateTime;
	//产品折价，打折后的价格
	private Double offPrice;

	/**
	 * 设置：设置主键自增
	 */
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	/**
	 * 获取：设置主键自增
	 */
	public Integer getProductid() {
		return productid;
	}
	/**
	 * 设置：类别ID
	 */
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	/**
	 * 获取：类别ID
	 */
	public Integer getCategoryid() {
		return categoryid;
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
	 * 设置：产品描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：产品描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：产品库存
	 */
	public void setReserve(Integer reserve) {
		this.reserve = reserve;
	}
	/**
	 * 获取：产品库存
	 */
	public Integer getReserve() {
		return reserve;
	}
	/**
	 * 设置：产品价格
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 获取：产品价格
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：默认为1显示， 0为隐藏
	 */
	public void setHide(Integer hide) {
		this.hide = hide;
	}
	/**
	 * 获取：默认为1显示， 0为隐藏
	 */
	public Integer getHide() {
		return hide;
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
	/**
	 * 设置：产品折价，打折后的价格
	 */
	public void setOffPrice(Double offPrice) {
		this.offPrice = offPrice;
	}
	/**
	 * 获取：产品折价，打折后的价格
	 */
	public Double getOffPrice() {
		return offPrice;
	}
}
