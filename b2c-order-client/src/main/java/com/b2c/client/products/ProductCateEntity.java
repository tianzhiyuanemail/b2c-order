package com.b2c.client.products;

import java.io.Serializable;


/**
 * 
 * 
 * @author admin
 * @email ${email}
 * @date 2018-01-07 14:25:08
 */
public class ProductCateEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;
	//分类名称
	private String cateName;
	//父级ID
	private Integer parentId;
	//类目级别
	private Integer rank;
	//类别
	private String image;
	//
	private Integer addTime;
	//
	private String addName;
	//
	private Integer modifyTime;
	//
	private String modifyName;

	/**
	 * 设置：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：分类名称
	 */
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	/**
	 * 获取：分类名称
	 */
	public String getCateName() {
		return cateName;
	}
	/**
	 * 设置：父级ID
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父级ID
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：类目级别
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * 获取：类目级别
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * 设置：类别
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：类别
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置：
	 */
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	/**
	 * 获取：
	 */
	public Integer getAddTime() {
		return addTime;
	}
	/**
	 * 设置：
	 */
	public void setAddName(String addName) {
		this.addName = addName;
	}
	/**
	 * 获取：
	 */
	public String getAddName() {
		return addName;
	}
	/**
	 * 设置：
	 */
	public void setModifyTime(Integer modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：
	 */
	public Integer getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：
	 */
	public void setModifyName(String modifyName) {
		this.modifyName = modifyName;
	}
	/**
	 * 获取：
	 */
	public String getModifyName() {
		return modifyName;
	}
}
