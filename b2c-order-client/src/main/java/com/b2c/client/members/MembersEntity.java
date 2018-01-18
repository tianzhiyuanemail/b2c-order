package com.b2c.client.members;

import java.io.Serializable;


/**
 *
 *
 * @author admin
 * @email ${email}
 * @date 2017-11-18 14:36:03
 */
public class MembersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer id;
	//
	private String avatarimagefileid;
	//
	private String email;
	//用户名
	private String username;
	//密码
	private String password;
	//注册时间
	private long registertime;
	//最后登录时间
	private long lastlogintime;
	//最后登录ip
	private String lastloginip;
	//性别：0保密1男2女
	private Integer gender;
	//生日
	private long birthday;
	//
	private String qq;
	//手机号
	private String mobilephone;
	//电话
	private String phone;
	//密码输入错误次数
	private Integer pwderrcount;
	//会员来源
	private String source;
	//标识
	private String sign;
	//是否接收商城推荐短信
	private Integer canreceivesms;
	//是否接收邮件
	private Integer canreceiveemail;
	//最后更新时间
	private long modified;
	//??EP???
	private Integer channelid;
	//等级ID
	private Integer gradeId;
	//昵称
	private String nickName;
	//是否黑名单 : 0:非黑名单  1：黑名单
	private Integer isBlacklist;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setAvatarimagefileid(String avatarimagefileid) {
		this.avatarimagefileid = avatarimagefileid;
	}
	/**
	 * 获取：
	 */
	public String getAvatarimagefileid() {
		return avatarimagefileid;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
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
	 * 设置：注册时间
	 */
	public void setRegistertime(Integer registertime) {
		this.registertime = registertime;
	}

	/**
	 * 设置：最后登录时间
	 */
	public void setLastlogintime(Integer lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	/**
	 * 设置：最后登录ip
	 */
	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}
	/**
	 * 获取：最后登录ip
	 */
	public String getLastloginip() {
		return lastloginip;
	}
	/**
	 * 设置：性别：0保密1男2女
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别：0保密1男2女
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * 设置：
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}
	/**
	 * 获取：
	 */
	public String getQq() {
		return qq;
	}
	/**
	 * 设置：手机号
	 */
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	/**
	 * 获取：手机号
	 */
	public String getMobilephone() {
		return mobilephone;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：密码输入错误次数
	 */
	public void setPwderrcount(Integer pwderrcount) {
		this.pwderrcount = pwderrcount;
	}
	/**
	 * 获取：密码输入错误次数
	 */
	public Integer getPwderrcount() {
		return pwderrcount;
	}
	/**
	 * 设置：会员来源
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * 获取：会员来源
	 */
	public String getSource() {
		return source;
	}
	/**
	 * 设置：标识
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	/**
	 * 获取：标识
	 */
	public String getSign() {
		return sign;
	}
	/**
	 * 设置：是否接收商城推荐短信
	 */
	public void setCanreceivesms(Integer canreceivesms) {
		this.canreceivesms = canreceivesms;
	}
	/**
	 * 获取：是否接收商城推荐短信
	 */
	public Integer getCanreceivesms() {
		return canreceivesms;
	}
	/**
	 * 设置：是否接收邮件
	 */
	public void setCanreceiveemail(Integer canreceiveemail) {
		this.canreceiveemail = canreceiveemail;
	}
	/**
	 * 获取：是否接收邮件
	 */
	public Integer getCanreceiveemail() {
		return canreceiveemail;
	}

	/**
	 * 设置：??EP???
	 */
	public void setChannelid(Integer channelid) {
		this.channelid = channelid;
	}
	/**
	 * 获取：??EP???
	 */
	public Integer getChannelid() {
		return channelid;
	}
	/**
	 * 设置：等级ID
	 */
	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}
	/**
	 * 获取：等级ID
	 */
	public Integer getGradeId() {
		return gradeId;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：是否黑名单 : 0:非黑名单  1：黑名单
	 */
	public void setIsBlacklist(Integer isBlacklist) {
		this.isBlacklist = isBlacklist;
	}
	/**
	 * 获取：是否黑名单 : 0:非黑名单  1：黑名单
	 */
	public Integer getIsBlacklist() {
		return isBlacklist;
	}

	public long getRegistertime() {
		return registertime;
	}

	public void setRegistertime(long registertime) {
		this.registertime = registertime;
	}

	public long getLastlogintime() {
		return lastlogintime;
	}

	public void setLastlogintime(long lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public long getBirthday() {
		return birthday;
	}

	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}

	public long getModified() {
		return modified;
	}

	public void setModified(long modified) {
		this.modified = modified;
	}
}
