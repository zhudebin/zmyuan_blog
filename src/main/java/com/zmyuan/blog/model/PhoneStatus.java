package com.zmyuan.blog.model;

import java.io.Serializable;
import java.util.Date;

public class PhoneStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	com.github.miemiedev.mybatis.paginator.dialect.SQLServerDialect
	
	private String phone;
	private String chkPhone;
	private String type;
	private String status;
	private String sOrigin;
	private Date sTime;
	private String custType;
	private String custOrigin;
	private Date custTime;
	private String smBlack;
	private Date smTime;
	private String foWarn;
	private String warnOrigin;
	private Date warnTime;
	private String belong;
	private String net;
	private Date crtTime;
	private Date updTime;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getChkPhone() {
		return chkPhone;
	}
	public void setChkPhone(String chkPhone) {
		this.chkPhone = chkPhone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getsOrigin() {
		return sOrigin;
	}
	public void setsOrigin(String sOrigin) {
		this.sOrigin = sOrigin;
	}
	public Date getsTime() {
		return sTime;
	}
	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCustOrigin() {
		return custOrigin;
	}
	public void setCustOrigin(String custOrigin) {
		this.custOrigin = custOrigin;
	}
	public Date getCustTime() {
		return custTime;
	}
	public void setCustTime(Date custTime) {
		this.custTime = custTime;
	}
	public String getSmBlack() {
		return smBlack;
	}
	public void setSmBlack(String smBlack) {
		this.smBlack = smBlack;
	}
	public Date getSmTime() {
		return smTime;
	}
	public void setSmTime(Date smTime) {
		this.smTime = smTime;
	}
	public String getFoWarn() {
		return foWarn;
	}
	public void setFoWarn(String foWarn) {
		this.foWarn = foWarn;
	}
	public String getWarnOrigin() {
		return warnOrigin;
	}
	public void setWarnOrigin(String warnOrigin) {
		this.warnOrigin = warnOrigin;
	}
	public Date getWarnTime() {
		return warnTime;
	}
	public void setWarnTime(Date warnTime) {
		this.warnTime = warnTime;
	}
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		this.belong = belong;
	}
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}
	public Date getCrtTime() {
		return crtTime;
	}
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
}
