package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 存储首页滚动图片表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class AdinfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer id;
	//图片
	private String image;
	//用于定位
	private Integer locate;
	//默认为1显示， 0为隐藏
	private Integer hide;
	//排序（留着备用）
	private Integer sort;
	//
	private String description;
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
	 * 设置：图片
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：图片
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
	 * 设置：排序（留着备用）
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序（留着备用）
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：
	 */
	public String getDescription() {
		return description;
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
