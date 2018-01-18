package com.b2c.service.products.impl;


import com.b2c.common.Page;
import com.b2c.common.PageOld;
import com.b2c.common.utils.PageUtil;
import com.b2c.dao.products.ProductsDao;
import com.b2c.domain.products.ProductsEntity;
import com.b2c.service.products.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	private ProductsDao productsDao;

	@Override
	public ProductsEntity queryObject(Integer id){
		return productsDao.queryObject(id);
	}
	
	@Override
	public List<ProductsEntity> queryList(Map<String, Object> map){
		return productsDao.queryList(map);
	}
	@Override
	public Page<List<ProductsEntity>> queryLists(Map<String, Object> map){


		Page<List<ProductsEntity>> page = null;

		try {
			//查询列表数据
			PageUtil.page(map);
			List<ProductsEntity> productsList = productsDao.queryList(map);
			int total = productsDao.queryTotal(map);
			page = new Page<>(total,productsList);
		}catch (Exception e){
			log.error("productsservice:queryLists()接口出现未知异常：{}"+e.getMessage());
		}
		return page;

	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return productsDao.queryTotal(map);
	}
	
	@Override
	public void save(ProductsEntity products){
		productsDao.save(products);
	}
	
	@Override
	public void update(ProductsEntity products){
		productsDao.update(products);
	}
	
	@Override
	public void delete(Integer id){
		productsDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		productsDao.deleteBatch(ids);
	}
	
}
