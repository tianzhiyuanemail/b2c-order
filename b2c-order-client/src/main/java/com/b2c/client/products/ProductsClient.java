package com.b2c.client.products;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 
 * 
 * @author admin
 * @email ${email}
 * @date 2017-11-10 12:43:43
 */
public class ProductsClient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private Integer siteid;
	//商品名称
	private String productname;
	//
	private Integer lastsynctime;
	//商品活动信息 用于商品详情页显示在商品名称后面
	private String productactivityinfo;
	//商品标题，商品在前台展示时显示在名称后面的描述信息
	private String producttitle;
	//品牌id
	private Integer brandid;
	//商品类目id
	private Integer productcateid;
	//商品类型id
	private Integer producttypeid;
	//商品第一张图片
	private String productfitstimgurl;
	//商品主图只展示前五张图片
	private String productimgurls;
	//产品卖点
	private String productsellingpoint;
	//商品详细描述
	private String productdetail;
	//商家编码
	private String sku;
	//页面关键字，用户搜索引擎优化
	private String keywords;
	//商品描述，用户搜索引擎优化
	private String description;
	//1上架0下架
	private Integer issale;
	//是否加星标 0 不加星标 1 加星标
	private Integer isstar;
	//热卖
	private Integer ishot;
	//精品
	private Integer isbest;
	//新品
	private Integer isnew;
	//是否特殊商品 0普通商品 1特殊商品
	private Integer isspecial;
	//是否为删除状态,1-已删除,0-未删除
	private Integer isdelete;
	//可预订
	private Integer isbookable;
	//是否不参加促销
	private Integer isnotpromotion;
	//是否支持赠品
	private Integer isgift;
	//商品供货价格
	private BigDecimal supplyprice;
	//套装价
	private BigDecimal packageprice;
	//参考价格,销售指导价格
	private BigDecimal saleguideprice;
	//产品最低限价
	private BigDecimal limitedprice;
	//审核状态：0正常状态,1新记录,2修改过,3新记录被拒绝,4修改过被拒绝
	private Integer state;
	//销量
	private Integer salenum;
	//虚拟销量
	private Integer virtualsalenum;
	//开票码
	private String contaxcode;
	//添加时间
	private Integer addtime;
	//最后更改时间
	private Integer lastmodify;
	//对应的淘宝商品
	private String taobaourl;

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
	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}
	/**
	 * 获取：
	 */
	public Integer getSiteid() {
		return siteid;
	}
	/**
	 * 设置：商品名称
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * 获取：商品名称
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * 设置：
	 */
	public void setLastsynctime(Integer lastsynctime) {
		this.lastsynctime = lastsynctime;
	}
	/**
	 * 获取：
	 */
	public Integer getLastsynctime() {
		return lastsynctime;
	}
	/**
	 * 设置：商品活动信息 用于商品详情页显示在商品名称后面
	 */
	public void setProductactivityinfo(String productactivityinfo) {
		this.productactivityinfo = productactivityinfo;
	}
	/**
	 * 获取：商品活动信息 用于商品详情页显示在商品名称后面
	 */
	public String getProductactivityinfo() {
		return productactivityinfo;
	}
	/**
	 * 设置：商品标题，商品在前台展示时显示在名称后面的描述信息
	 */
	public void setProducttitle(String producttitle) {
		this.producttitle = producttitle;
	}
	/**
	 * 获取：商品标题，商品在前台展示时显示在名称后面的描述信息
	 */
	public String getProducttitle() {
		return producttitle;
	}
	/**
	 * 设置：品牌id
	 */
	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}
	/**
	 * 获取：品牌id
	 */
	public Integer getBrandid() {
		return brandid;
	}
	/**
	 * 设置：商品类目id
	 */
	public void setProductcateid(Integer productcateid) {
		this.productcateid = productcateid;
	}
	/**
	 * 获取：商品类目id
	 */
	public Integer getProductcateid() {
		return productcateid;
	}
	/**
	 * 设置：商品类型id
	 */
	public void setProducttypeid(Integer producttypeid) {
		this.producttypeid = producttypeid;
	}
	/**
	 * 获取：商品类型id
	 */
	public Integer getProducttypeid() {
		return producttypeid;
	}
	/**
	 * 设置：商品第一张图片
	 */
	public void setProductfitstimgurl(String productfitstimgurl) {
		this.productfitstimgurl = productfitstimgurl;
	}
	/**
	 * 获取：商品第一张图片
	 */
	public String getProductfitstimgurl() {
		return productfitstimgurl;
	}
	/**
	 * 设置：商品主图只展示前五张图片
	 */
	public void setProductimgurls(String productimgurls) {
		this.productimgurls = productimgurls;
	}
	/**
	 * 获取：商品主图只展示前五张图片
	 */
	public String getProductimgurls() {
		return productimgurls;
	}
	/**
	 * 设置：产品卖点
	 */
	public void setProductsellingpoint(String productsellingpoint) {
		this.productsellingpoint = productsellingpoint;
	}
	/**
	 * 获取：产品卖点
	 */
	public String getProductsellingpoint() {
		return productsellingpoint;
	}
	/**
	 * 设置：商品详细描述
	 */
	public void setProductdetail(String productdetail) {
		this.productdetail = productdetail;
	}
	/**
	 * 获取：商品详细描述
	 */
	public String getProductdetail() {
		return productdetail;
	}
	/**
	 * 设置：商家编码
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * 获取：商家编码
	 */
	public String getSku() {
		return sku;
	}
	/**
	 * 设置：页面关键字，用户搜索引擎优化
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 获取：页面关键字，用户搜索引擎优化
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * 设置：商品描述，用户搜索引擎优化
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：商品描述，用户搜索引擎优化
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：1上架0下架
	 */
	public void setIssale(Integer issale) {
		this.issale = issale;
	}
	/**
	 * 获取：1上架0下架
	 */
	public Integer getIssale() {
		return issale;
	}
	/**
	 * 设置：是否加星标 0 不加星标 1 加星标
	 */
	public void setIsstar(Integer isstar) {
		this.isstar = isstar;
	}
	/**
	 * 获取：是否加星标 0 不加星标 1 加星标
	 */
	public Integer getIsstar() {
		return isstar;
	}
	/**
	 * 设置：热卖
	 */
	public void setIshot(Integer ishot) {
		this.ishot = ishot;
	}
	/**
	 * 获取：热卖
	 */
	public Integer getIshot() {
		return ishot;
	}
	/**
	 * 设置：精品
	 */
	public void setIsbest(Integer isbest) {
		this.isbest = isbest;
	}
	/**
	 * 获取：精品
	 */
	public Integer getIsbest() {
		return isbest;
	}
	/**
	 * 设置：新品
	 */
	public void setIsnew(Integer isnew) {
		this.isnew = isnew;
	}
	/**
	 * 获取：新品
	 */
	public Integer getIsnew() {
		return isnew;
	}
	/**
	 * 设置：是否特殊商品 0普通商品 1特殊商品
	 */
	public void setIsspecial(Integer isspecial) {
		this.isspecial = isspecial;
	}
	/**
	 * 获取：是否特殊商品 0普通商品 1特殊商品
	 */
	public Integer getIsspecial() {
		return isspecial;
	}
	/**
	 * 设置：是否为删除状态,1-已删除,0-未删除
	 */
	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
	/**
	 * 获取：是否为删除状态,1-已删除,0-未删除
	 */
	public Integer getIsdelete() {
		return isdelete;
	}
	/**
	 * 设置：可预订
	 */
	public void setIsbookable(Integer isbookable) {
		this.isbookable = isbookable;
	}
	/**
	 * 获取：可预订
	 */
	public Integer getIsbookable() {
		return isbookable;
	}
	/**
	 * 设置：是否不参加促销
	 */
	public void setIsnotpromotion(Integer isnotpromotion) {
		this.isnotpromotion = isnotpromotion;
	}
	/**
	 * 获取：是否不参加促销
	 */
	public Integer getIsnotpromotion() {
		return isnotpromotion;
	}
	/**
	 * 设置：是否支持赠品
	 */
	public void setIsgift(Integer isgift) {
		this.isgift = isgift;
	}
	/**
	 * 获取：是否支持赠品
	 */
	public Integer getIsgift() {
		return isgift;
	}
	/**
	 * 设置：商品供货价格
	 */
	public void setSupplyprice(BigDecimal supplyprice) {
		this.supplyprice = supplyprice;
	}
	/**
	 * 获取：商品供货价格
	 */
	public BigDecimal getSupplyprice() {
		return supplyprice;
	}
	/**
	 * 设置：套装价
	 */
	public void setPackageprice(BigDecimal packageprice) {
		this.packageprice = packageprice;
	}
	/**
	 * 获取：套装价
	 */
	public BigDecimal getPackageprice() {
		return packageprice;
	}
	/**
	 * 设置：参考价格,销售指导价格
	 */
	public void setSaleguideprice(BigDecimal saleguideprice) {
		this.saleguideprice = saleguideprice;
	}
	/**
	 * 获取：参考价格,销售指导价格
	 */
	public BigDecimal getSaleguideprice() {
		return saleguideprice;
	}
	/**
	 * 设置：产品最低限价
	 */
	public void setLimitedprice(BigDecimal limitedprice) {
		this.limitedprice = limitedprice;
	}
	/**
	 * 获取：产品最低限价
	 */
	public BigDecimal getLimitedprice() {
		return limitedprice;
	}
	/**
	 * 设置：审核状态：0正常状态,1新记录,2修改过,3新记录被拒绝,4修改过被拒绝
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：审核状态：0正常状态,1新记录,2修改过,3新记录被拒绝,4修改过被拒绝
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * 设置：销量
	 */
	public void setSalenum(Integer salenum) {
		this.salenum = salenum;
	}
	/**
	 * 获取：销量
	 */
	public Integer getSalenum() {
		return salenum;
	}
	/**
	 * 设置：虚拟销量
	 */
	public void setVirtualsalenum(Integer virtualsalenum) {
		this.virtualsalenum = virtualsalenum;
	}
	/**
	 * 获取：虚拟销量
	 */
	public Integer getVirtualsalenum() {
		return virtualsalenum;
	}
	/**
	 * 设置：开票码
	 */
	public void setContaxcode(String contaxcode) {
		this.contaxcode = contaxcode;
	}
	/**
	 * 获取：开票码
	 */
	public String getContaxcode() {
		return contaxcode;
	}
	/**
	 * 设置：添加时间
	 */
	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：添加时间
	 */
	public Integer getAddtime() {
		return addtime;
	}
	/**
	 * 设置：最后更改时间
	 */
	public void setLastmodify(Integer lastmodify) {
		this.lastmodify = lastmodify;
	}
	/**
	 * 获取：最后更改时间
	 */
	public Integer getLastmodify() {
		return lastmodify;
	}
	/**
	 * 设置：对应的淘宝商品
	 */
	public void setTaobaourl(String taobaourl) {
		this.taobaourl = taobaourl;
	}
	/**
	 * 获取：对应的淘宝商品
	 */
	public String getTaobaourl() {
		return taobaourl;
	}
}
