package com.b2c.service.products;


import com.b2c.common.PageOld;
import com.b2c.common.Page;
import com.b2c.domain.products.ProductCateEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author admin
 * @email ${email}
 * @date 2018-01-07 14:25:08
 */
public interface ProductCateService {

	ProductCateEntity queryObject(Integer id);

	List<ProductCateEntity> queryList();

	Page<List<ProductCateEntity>> queryLists(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

	void save(ProductCateEntity products);

	void update(ProductCateEntity products);

	void delete(Integer id);

	void deleteBatch(Integer[] ids);
}
