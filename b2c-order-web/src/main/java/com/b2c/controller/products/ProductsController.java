package com.b2c.controller.products;

import com.b2c.common.*;
import com.b2c.domain.products.ProductsEntity;
import com.b2c.service.products.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


/**
 * 
 * 
 * @author admin
 * @email ${email}
 * @date 2017-11-10 12:43:43
 */
@RestController
@RequestMapping("/products")
@Slf4j
public class ProductsController {
	@Autowired
	private ProductsService productsService;


	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public Page<List<ProductsEntity>> list(@RequestParam Map<String, Object> params){
		ServiceResult<Page<List<ProductsEntity>>> serviceResult = new ServiceResult<Page<List<ProductsEntity>>>(){};
		try {
			Page<List<ProductsEntity>> listPageOld = productsService.queryLists(params);
			serviceResult.setCode(listPageOld);
			return listPageOld;
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return null;
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ProductsEntity info(@PathVariable("id") Integer id){
		ServiceResult<ProductsEntity> serviceResult = new ServiceResult<ProductsEntity>(){};
		try {
			ProductsEntity products = productsService.queryObject(id);
			serviceResult.setCode(products);
			return products;
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return null;
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ServiceResult save(@RequestBody ProductsEntity products){


		ServiceResult serviceResult = new ServiceResult(){};
		try {
			productsService.save(products);
			serviceResult.setCode(null);
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return serviceResult;
	}

	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public ServiceResult update(@RequestBody ProductsEntity products){


		ServiceResult<ProductsEntity> serviceResult = new ServiceResult<ProductsEntity>(){};
		try {
			productsService.update(products);
			serviceResult.setCode(null);
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return serviceResult;
	}

	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public ServiceResult delete(@RequestBody Integer[] ids){


		ServiceResult<ProductsEntity> serviceResult = new ServiceResult<ProductsEntity>(){};
		try {
			productsService.deleteBatch(ids);
			serviceResult.setCode(null);
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return serviceResult;
	}
	
}
