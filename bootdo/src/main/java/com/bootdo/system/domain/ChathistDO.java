package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * IM聊天记录表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-22 21:04:08
 */
public class ChathistDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long id;
	//消息发送方用户ID
	private Long senderUserId;
	//消息接受方用户ID
	private Long receiverUserId;
	//echat系统的聊天id 唯一
	private Long echatId;
	//聊天内容
	private String content;
	//0:文本,1:图片,2:语音,3:转诊,4:处方,5:电话问诊,6:患者电话问诊请求
	private Integer contentType;
	//消息发送时间
	private Date sendTime;
	//是否已读: 0：未读，1：已读
	private Integer isRead;
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
	 * 设置：消息发送方用户ID
	 */
	public void setSenderUserId(Long senderUserId) {
		this.senderUserId = senderUserId;
	}
	/**
	 * 获取：消息发送方用户ID
	 */
	public Long getSenderUserId() {
		return senderUserId;
	}
	/**
	 * 设置：消息接受方用户ID
	 */
	public void setReceiverUserId(Long receiverUserId) {
		this.receiverUserId = receiverUserId;
	}
	/**
	 * 获取：消息接受方用户ID
	 */
	public Long getReceiverUserId() {
		return receiverUserId;
	}
	/**
	 * 设置：echat系统的聊天id 唯一
	 */
	public void setEchatId(Long echatId) {
		this.echatId = echatId;
	}
	/**
	 * 获取：echat系统的聊天id 唯一
	 */
	public Long getEchatId() {
		return echatId;
	}
	/**
	 * 设置：聊天内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：聊天内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：0:文本,1:图片,2:语音,3:转诊,4:处方,5:电话问诊,6:患者电话问诊请求
	 */
	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}
	/**
	 * 获取：0:文本,1:图片,2:语音,3:转诊,4:处方,5:电话问诊,6:患者电话问诊请求
	 */
	public Integer getContentType() {
		return contentType;
	}
	/**
	 * 设置：消息发送时间
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	/**
	 * 获取：消息发送时间
	 */
	public Date getSendTime() {
		return sendTime;
	}
	/**
	 * 设置：是否已读: 0：未读，1：已读
	 */
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
	}
	/**
	 * 获取：是否已读: 0：未读，1：已读
	 */
	public Integer getIsRead() {
		return isRead;
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
