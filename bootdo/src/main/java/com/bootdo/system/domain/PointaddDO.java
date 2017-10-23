package com.bootdo.system.domain;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Date;



/**
 * 积分累计表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class PointaddDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//用户ID
	private String userid;
	//积分
	private Double point;
	//1表示签到所得积分，2表示购买商品所得积分
	private Integer pointtype;
	//启用状态
	private Integer enable;
	//备注
	private String remark;
	//
	private Long createBy;
	//
	private Date createTime;
	//
	private Long updateBy;
	//
	private Date updateTime;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
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
	 * 设置：积分
	 */
	public void setPoint(Double point) {
		this.point = point;
	}
	/**
	 * 获取：积分
	 */
	public Double getPoint() {
		return point;
	}
	/**
	 * 设置：1表示签到所得积分，2表示购买商品所得积分
	 */
	public void setPointtype(Integer pointtype) {
		this.pointtype = pointtype;
	}
	/**
	 * 获取：1表示签到所得积分，2表示购买商品所得积分
	 */
	public Integer getPointtype() {
		return pointtype;
	}
	/**
	 * 设置：启用状态
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	/**
	 * 获取：启用状态
	 */
	public Integer getEnable() {
		return enable;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
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
