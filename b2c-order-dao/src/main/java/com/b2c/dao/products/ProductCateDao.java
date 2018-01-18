package com.b2c.dao.products;


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
public interface ProductCateDao {
    ProductCateEntity queryObject(Integer id);

    List<ProductCateEntity> queryList();

    int queryTotal(Map map);

    void save(ProductCateEntity productCate);

    void update(ProductCateEntity productCate);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
