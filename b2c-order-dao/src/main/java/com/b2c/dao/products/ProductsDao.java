package com.b2c.dao.products;


import com.b2c.domain.products.ProductsEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author admin
 * @email ${email}
 * @date 2017-11-10 12:43:43
 */

public interface ProductsDao  {
    ProductsEntity queryObject(Integer id);

    List<ProductsEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(ProductsEntity products);

    void update(ProductsEntity products);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
