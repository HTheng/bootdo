package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 产品图片表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class ProductimageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer id;
	//产品ID
	private Integer productid;
	//产品图片
	private String image;
	//用于定位
	private Integer locate;
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
	 * 设置：产品图片
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：产品图片
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置：用于定位
	 */
	public void setLocate(Integer locate) {
		this.locate = locate;
	}
	/**
	 * 获取：用于定位
	 */
	public Integer getLocate() {
		return locate;
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
}
