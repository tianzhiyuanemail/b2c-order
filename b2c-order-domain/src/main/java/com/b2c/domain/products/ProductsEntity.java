package com.b2c.domain.products;


import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 *
 *
 * @author admin
 * @email ${email}
 * @date 2018-01-28 16:27:46
 */
public class ProductsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer id;
	//
	private Integer siteId;
	//商品名称
	private String productName;
	//
	private Integer lastSyncTime;
	//商品活动信息 用于商品详情页显示在商品名称后面
	private String productActivityInfo;
	//商品标题，商品在前台展示时显示在名称后面的描述信息
	private String productTitle;
	//品牌id
	private Integer brandId;
	//商品类目id
	private Integer productCateId;
	//
	private String productCatePath;
	//商品类型id
	private Integer productTypeId;
	//商品第一张图片
	private String productFitstImgUrl;
	//商品主图只展示前五张图片
	private String productImgUrls;
	//产品卖点
	private String productSellingPoint;
	//总库存
	private String productStock;
	//商品详细描述
	private String productDetail;
	//商品货号
	private String productArticle;
	//商家编码
	private String sku;
	//页面关键字，用户搜索引擎优化
	private String keywords;
	//商品描述，用户搜索引擎优化
	private String description;
	//是否七天无理由
	private Integer isSevenDays;
	//是否支持退换货
	private Integer isReturns;
	//是否保修
	private Integer isGuarantee;
	//是否发票
	private Integer isBill;
	//1上架0下架
	private Integer isSale;
	//货到付款 1 否 2 是
	private Integer isCod;
	//是否加星标 0 不加星标 1 加星标
	private Integer isStar;
	//热卖
	private Integer isHot;
	//精品
	private Integer isBest;
	//新品
	private Integer isNew;
	//是否特殊商品 0普通商品 1特殊商品
	private Integer isSpecial;
	//是否为删除状态,1-已删除,0-未删除
	private Integer isDelete;
	//可预订
	private Integer isBookable;
	//是否不参加促销
	private Integer isNotPromotion;
	//是否支持赠品
	private Integer isGift;
	//商品供货价格
	private BigDecimal supplyPrice;
	//套装价
	private BigDecimal packagePrice;
	//参考价格,销售指导价格
	private BigDecimal saleGuidePrice;
	//产品最低限价
	private BigDecimal limitedPrice;
	//审核状态：0正常状态,1新记录,2修改过,3新记录被拒绝,4修改过被拒绝
	private Integer state;
	//销量
	private Integer saleNum;
	//虚拟销量
	private Integer virtualSaleNum;
	//开票码
	private String conTaxCode;
	//添加时间
	private Integer addTime;
	//最后更改时间
	private Integer lastModify;
	//对应的淘宝商品
	private String taobaoUrl;
	//上市时间
	private Integer listedTime;
	//运费模板(快递费用-发货地)
	private Integer shippingTemplatesId;

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
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	/**
	 * 获取：
	 */
	public Integer getSiteId() {
		return siteId;
	}
	/**
	 * 设置：商品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：商品名称
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：
	 */
	public void setLastSyncTime(Integer lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}
	/**
	 * 获取：
	 */
	public Integer getLastSyncTime() {
		return lastSyncTime;
	}
	/**
	 * 设置：商品活动信息 用于商品详情页显示在商品名称后面
	 */
	public void setProductActivityInfo(String productActivityInfo) {
		this.productActivityInfo = productActivityInfo;
	}
	/**
	 * 获取：商品活动信息 用于商品详情页显示在商品名称后面
	 */
	public String getProductActivityInfo() {
		return productActivityInfo;
	}
	/**
	 * 设置：商品标题，商品在前台展示时显示在名称后面的描述信息
	 */
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	/**
	 * 获取：商品标题，商品在前台展示时显示在名称后面的描述信息
	 */
	public String getProductTitle() {
		return productTitle;
	}
	/**
	 * 设置：品牌id
	 */
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	/**
	 * 获取：品牌id
	 */
	public Integer getBrandId() {
		return brandId;
	}
	/**
	 * 设置：商品类目id
	 */
	public void setProductCateId(Integer productCateId) {
		this.productCateId = productCateId;
	}
	/**
	 * 获取：商品类目id
	 */
	public Integer getProductCateId() {
		return productCateId;
	}
	/**
	 * 设置：
	 */
	public void setProductCatePath(String productCatePath) {
		this.productCatePath = productCatePath;
	}
	/**
	 * 获取：
	 */
	public String getProductCatePath() {
		return productCatePath;
	}
	/**
	 * 设置：商品类型id
	 */
	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	/**
	 * 获取：商品类型id
	 */
	public Integer getProductTypeId() {
		return productTypeId;
	}
	/**
	 * 设置：商品第一张图片
	 */
	public void setProductFitstImgUrl(String productFitstImgUrl) {
		this.productFitstImgUrl = productFitstImgUrl;
	}
	/**
	 * 获取：商品第一张图片
	 */
	public String getProductFitstImgUrl() {
		return productFitstImgUrl;
	}
	/**
	 * 设置：商品主图只展示前五张图片
	 */
	public void setProductImgUrls(String productImgUrls) {
		this.productImgUrls = productImgUrls;
	}
	/**
	 * 获取：商品主图只展示前五张图片
	 */
	public String getProductImgUrls() {
		return productImgUrls;
	}
	/**
	 * 设置：产品卖点
	 */
	public void setProductSellingPoint(String productSellingPoint) {
		this.productSellingPoint = productSellingPoint;
	}
	/**
	 * 获取：产品卖点
	 */
	public String getProductSellingPoint() {
		return productSellingPoint;
	}
	/**
	 * 设置：总库存
	 */
	public void setProductStock(String productStock) {
		this.productStock = productStock;
	}
	/**
	 * 获取：总库存
	 */
	public String getProductStock() {
		return productStock;
	}
	/**
	 * 设置：商品详细描述
	 */
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	/**
	 * 获取：商品详细描述
	 */
	public String getProductDetail() {
		return productDetail;
	}
	/**
	 * 设置：商品货号
	 */
	public void setProductArticle(String productArticle) {
		this.productArticle = productArticle;
	}
	/**
	 * 获取：商品货号
	 */
	public String getProductArticle() {
		return productArticle;
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
	 * 设置：是否七天无理由
	 */
	public void setIsSevenDays(Integer isSevenDays) {
		this.isSevenDays = isSevenDays;
	}
	/**
	 * 获取：是否七天无理由
	 */
	public Integer getIsSevenDays() {
		return isSevenDays;
	}
	/**
	 * 设置：是否支持退换货
	 */
	public void setIsReturns(Integer isReturns) {
		this.isReturns = isReturns;
	}
	/**
	 * 获取：是否支持退换货
	 */
	public Integer getIsReturns() {
		return isReturns;
	}
	/**
	 * 设置：是否保修
	 */
	public void setIsGuarantee(Integer isGuarantee) {
		this.isGuarantee = isGuarantee;
	}
	/**
	 * 获取：是否保修
	 */
	public Integer getIsGuarantee() {
		return isGuarantee;
	}
	/**
	 * 设置：是否发票
	 */
	public void setIsBill(Integer isBill) {
		this.isBill = isBill;
	}
	/**
	 * 获取：是否发票
	 */
	public Integer getIsBill() {
		return isBill;
	}
	/**
	 * 设置：1上架0下架
	 */
	public void setIsSale(Integer isSale) {
		this.isSale = isSale;
	}
	/**
	 * 获取：1上架0下架
	 */
	public Integer getIsSale() {
		return isSale;
	}
	/**
	 * 设置：货到付款 1 否 2 是
	 */
	public void setIsCod(Integer isCod) {
		this.isCod = isCod;
	}
	/**
	 * 获取：货到付款 1 否 2 是
	 */
	public Integer getIsCod() {
		return isCod;
	}
	/**
	 * 设置：是否加星标 0 不加星标 1 加星标
	 */
	public void setIsStar(Integer isStar) {
		this.isStar = isStar;
	}
	/**
	 * 获取：是否加星标 0 不加星标 1 加星标
	 */
	public Integer getIsStar() {
		return isStar;
	}
	/**
	 * 设置：热卖
	 */
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}
	/**
	 * 获取：热卖
	 */
	public Integer getIsHot() {
		return isHot;
	}
	/**
	 * 设置：精品
	 */
	public void setIsBest(Integer isBest) {
		this.isBest = isBest;
	}
	/**
	 * 获取：精品
	 */
	public Integer getIsBest() {
		return isBest;
	}
	/**
	 * 设置：新品
	 */
	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}
	/**
	 * 获取：新品
	 */
	public Integer getIsNew() {
		return isNew;
	}
	/**
	 * 设置：是否特殊商品 0普通商品 1特殊商品
	 */
	public void setIsSpecial(Integer isSpecial) {
		this.isSpecial = isSpecial;
	}
	/**
	 * 获取：是否特殊商品 0普通商品 1特殊商品
	 */
	public Integer getIsSpecial() {
		return isSpecial;
	}
	/**
	 * 设置：是否为删除状态,1-已删除,0-未删除
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：是否为删除状态,1-已删除,0-未删除
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
	/**
	 * 设置：可预订
	 */
	public void setIsBookable(Integer isBookable) {
		this.isBookable = isBookable;
	}
	/**
	 * 获取：可预订
	 */
	public Integer getIsBookable() {
		return isBookable;
	}
	/**
	 * 设置：是否不参加促销
	 */
	public void setIsNotPromotion(Integer isNotPromotion) {
		this.isNotPromotion = isNotPromotion;
	}
	/**
	 * 获取：是否不参加促销
	 */
	public Integer getIsNotPromotion() {
		return isNotPromotion;
	}
	/**
	 * 设置：是否支持赠品
	 */
	public void setIsGift(Integer isGift) {
		this.isGift = isGift;
	}
	/**
	 * 获取：是否支持赠品
	 */
	public Integer getIsGift() {
		return isGift;
	}
	/**
	 * 设置：商品供货价格
	 */
	public void setSupplyPrice(BigDecimal supplyPrice) {
		this.supplyPrice = supplyPrice;
	}
	/**
	 * 获取：商品供货价格
	 */
	public BigDecimal getSupplyPrice() {
		return supplyPrice;
	}
	/**
	 * 设置：套装价
	 */
	public void setPackagePrice(BigDecimal packagePrice) {
		this.packagePrice = packagePrice;
	}
	/**
	 * 获取：套装价
	 */
	public BigDecimal getPackagePrice() {
		return packagePrice;
	}
	/**
	 * 设置：参考价格,销售指导价格
	 */
	public void setSaleGuidePrice(BigDecimal saleGuidePrice) {
		this.saleGuidePrice = saleGuidePrice;
	}
	/**
	 * 获取：参考价格,销售指导价格
	 */
	public BigDecimal getSaleGuidePrice() {
		return saleGuidePrice;
	}
	/**
	 * 设置：产品最低限价
	 */
	public void setLimitedPrice(BigDecimal limitedPrice) {
		this.limitedPrice = limitedPrice;
	}
	/**
	 * 获取：产品最低限价
	 */
	public BigDecimal getLimitedPrice() {
		return limitedPrice;
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
	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}
	/**
	 * 获取：销量
	 */
	public Integer getSaleNum() {
		return saleNum;
	}
	/**
	 * 设置：虚拟销量
	 */
	public void setVirtualSaleNum(Integer virtualSaleNum) {
		this.virtualSaleNum = virtualSaleNum;
	}
	/**
	 * 获取：虚拟销量
	 */
	public Integer getVirtualSaleNum() {
		return virtualSaleNum;
	}
	/**
	 * 设置：开票码
	 */
	public void setConTaxCode(String conTaxCode) {
		this.conTaxCode = conTaxCode;
	}
	/**
	 * 获取：开票码
	 */
	public String getConTaxCode() {
		return conTaxCode;
	}
	/**
	 * 设置：添加时间
	 */
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Integer getAddTime() {
		return addTime;
	}
	/**
	 * 设置：最后更改时间
	 */
	public void setLastModify(Integer lastModify) {
		this.lastModify = lastModify;
	}
	/**
	 * 获取：最后更改时间
	 */
	public Integer getLastModify() {
		return lastModify;
	}
	/**
	 * 设置：对应的淘宝商品
	 */
	public void setTaobaoUrl(String taobaoUrl) {
		this.taobaoUrl = taobaoUrl;
	}
	/**
	 * 获取：对应的淘宝商品
	 */
	public String getTaobaoUrl() {
		return taobaoUrl;
	}
	/**
	 * 设置：上市时间
	 */
	public void setListedTime(Integer listedTime) {
		this.listedTime = listedTime;
	}
	/**
	 * 获取：上市时间
	 */
	public Integer getListedTime() {
		return listedTime;
	}
	/**
	 * 设置：运费模板(快递费用-发货地)
	 */
	public void setShippingTemplatesId(Integer shippingTemplatesId) {
		this.shippingTemplatesId = shippingTemplatesId;
	}
	/**
	 * 获取：运费模板(快递费用-发货地)
	 */
	public Integer getShippingTemplatesId() {
		return shippingTemplatesId;
	}
}
