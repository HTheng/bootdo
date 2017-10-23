package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 产品类别
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class CategoryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//设置主键自增
	private Integer categoryid;
	//父类别ID
	private Integer fathercategoryid;
	//类别名称
	private String categoryname;
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
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	/**
	 * 获取：设置主键自增
	 */
	public Integer getCategoryid() {
		return categoryid;
	}
	/**
	 * 设置：父类别ID
	 */
	public void setFathercategoryid(Integer fathercategoryid) {
		this.fathercategoryid = fathercategoryid;
	}
	/**
	 * 获取：父类别ID
	 */
	public Integer getFathercategoryid() {
		return fathercategoryid;
	}
	/**
	 * 设置：类别名称
	 */
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	/**
	 * 获取：类别名称
	 */
	public String getCategoryname() {
		return categoryname;
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
