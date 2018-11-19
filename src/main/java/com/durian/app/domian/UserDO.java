package com.durian.app.domian;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-18 15:50:19
 */
public class UserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//用户id
	private String id;
	//手机号
	private String phone;
	//密码
	private String password;
	//微信openid
	private String openid;
	//城市(微信获取)
	private String city;
	//头像
	private String headimg;
	//昵称
	private String nick;
	//是否绑定微信 0未绑定 1已绑定
	private Integer bindwx;
	//用户类型 0普通用户 1管理员
	private Integer type;
	//删除状态
	private Integer isdelete;
	//余额
	private BigDecimal balance;
	//推荐人
	private String referee;
	//创建日期
	private Date createdate;

	/**
	 * 设置：用户id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：用户id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号
	 */
	public String getPhone() {
		return phone;
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
	 * 设置：微信openid
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * 获取：微信openid
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * 设置：城市(微信获取)
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市(微信获取)
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：头像
	 */
	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}
	/**
	 * 获取：头像
	 */
	public String getHeadimg() {
		return headimg;
	}
	/**
	 * 设置：昵称
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}
	/**
	 * 获取：昵称
	 */
	public String getNick() {
		return nick;
	}
	/**
	 * 设置：是否绑定微信 0未绑定 1已绑定
	 */
	public void setBindwx(Integer bindwx) {
		this.bindwx = bindwx;
	}
	/**
	 * 获取：是否绑定微信 0未绑定 1已绑定
	 */
	public Integer getBindwx() {
		return bindwx;
	}
	/**
	 * 设置：用户类型 0普通用户 1管理员
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：用户类型 0普通用户 1管理员
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：删除状态
	 */
	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
	/**
	 * 获取：删除状态
	 */
	public Integer getIsdelete() {
		return isdelete;
	}
	/**
	 * 设置：余额
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/**
	 * 获取：余额
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	/**
	 * 设置：推荐人
	 */
	public void setReferee(String referee) {
		this.referee = referee;
	}
	/**
	 * 获取：推荐人
	 */
	public String getReferee() {
		return referee;
	}
	/**
	 * 设置：创建日期
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * 获取：创建日期
	 */
	public Date getCreatedate() {
		return createdate;
	}
}
