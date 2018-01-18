package com.b2c.controller.products;

import com.b2c.common.Page;
import com.b2c.common.PageOld;
import com.b2c.common.ServiceResult;
import com.b2c.domain.products.ProductCateEntity;
import com.b2c.service.products.ProductCateService;
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
 * @date 2018-01-07 14:25:08
 */
@RestController
@RequestMapping("/productcate")
@Slf4j
public class ProductCateController {
	@Autowired
	private ProductCateService productCateService;

	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ServiceResult<Page<List<ProductCateEntity>>> list(@RequestParam Map<String, Object> params){
		ServiceResult<Page<List<ProductCateEntity>>> serviceResult = new ServiceResult<Page<List<ProductCateEntity>>>(){};
		try {
			Page<List<ProductCateEntity>> listPageOld = productCateService.queryLists(params);
			serviceResult.setCode(listPageOld);
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return serviceResult;
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public ServiceResult<ProductCateEntity> info(@PathVariable("id") Integer id){
		ServiceResult<ProductCateEntity> serviceResult = new ServiceResult<ProductCateEntity>(){};
		try {
			ProductCateEntity products = productCateService.queryObject(id);
			serviceResult.setCode(products);
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return serviceResult;
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public ServiceResult save(@RequestBody ProductCateEntity products){


		ServiceResult serviceResult = new ServiceResult(){};
		try {
			productCateService.save(products);
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
	public ServiceResult update(@RequestBody ProductCateEntity products){


		ServiceResult<ProductCateEntity> serviceResult = new ServiceResult<ProductCateEntity>(){};
		try {
			productCateService.update(products);
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


		ServiceResult<ProductCateEntity> serviceResult = new ServiceResult<ProductCateEntity>(){};
		try {
			productCateService.deleteBatch(ids);
		}catch (Exception e) {
			log.error("接口调用出现未知异常"+e);
			serviceResult.setError("接口调用出现未知异常"+e);
		}
		return serviceResult;
	}
}
