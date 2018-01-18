package com.b2c.service.products.impl;


import com.b2c.common.PageOld;
import com.b2c.common.Page;
import com.b2c.common.utils.PageUtil;
import com.b2c.dao.products.ProductCateDao;
import com.b2c.domain.products.ProductCateEntity;
import com.b2c.service.products.ProductCateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ProductCateServiceImpl implements ProductCateService {
	@Autowired
	private ProductCateDao productCateDao;

	@Override
	public ProductCateEntity queryObject(Integer id){
		return productCateDao.queryObject(id);
	}

	@Override
	public List<ProductCateEntity> queryList(){
		return productCateDao.queryList();
	}
	@Override
	public Page<List<ProductCateEntity>> queryLists(Map<String, Object> map){

		Page<List<ProductCateEntity>> page = null;

		try {
			//查询列表数据
			PageUtil.page(map);
			List<ProductCateEntity> productsList = productCateDao.queryList();
			int total = productCateDao.queryTotal(map);
			page = new Page<>(total,productsList);
		}catch (Exception e){
			log.error("productsservice:queryLists()接口出现未知异常：{}"+e.getMessage());
		}
		return page;
	}

	@Override
	public int queryTotal(Map<String, Object> map){
		return productCateDao.queryTotal(map);
	}

	@Override
	public void save(ProductCateEntity products){
		productCateDao.save(products);
	}

	@Override
	public void update(ProductCateEntity products){
		productCateDao.update(products);
	}

	@Override
	public void delete(Integer id){
		productCateDao.delete(id);
	}

	@Override
	public void deleteBatch(Integer[] ids){
		productCateDao.deleteBatch(ids);
	}


}
