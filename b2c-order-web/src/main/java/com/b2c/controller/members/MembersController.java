package com.b2c.controller.members;

import com.b2c.common.PageOld;
import com.b2c.common.ServiceResult;
import com.b2c.common.utils.MD5Utils;
import com.b2c.domain.members.MembersEntity;
import com.b2c.service.members.MembersService;
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
 * @date 2017-11-18 14:36:03
 */
@RestController
@RequestMapping("/members")
@Slf4j
public class MembersController {
	@Autowired
	private MembersService membersService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public ServiceResult<PageOld<List<MembersEntity>>> list(@RequestParam Map<String, Object> params){
		//查询列表数据

		ServiceResult<PageOld<List<MembersEntity>>> serviceResult = new ServiceResult<PageOld<List<MembersEntity>>>(){};
		try {
			PageOld<List<MembersEntity>> listPageOld = membersService.queryLists(params);
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
	public  ServiceResult<MembersEntity>  info(@PathVariable("id") Integer id){

			ServiceResult serviceResult = new ServiceResult(){};

			try {

				MembersEntity members = membersService.queryObject(id);

				serviceResult.setCode(members);

			}catch (Exception e) {
				log.error("接口调用出现未知异常"+e);
				serviceResult.setError("接口调用出现未知异常"+e);
			}
			return serviceResult;
	}

	/**
	 * 登录
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public  ServiceResult<MembersEntity>  loginByUserName(@RequestParam(required = true) String userName,
														  @RequestParam(required = true) String passWord){

			ServiceResult serviceResult = new ServiceResult(){};

			try {

				MembersEntity members = membersService.loginByUserName(userName);

				if (members==null){
					serviceResult.setError("此用户不存在");
				}else if (!MD5Utils.md5Password(passWord).equals(members.getPassword())){
					serviceResult.setError("用户名密码不匹配");
				}else {
					serviceResult.setCode(members);
					log.info("用户:${userName}登录成功");
				}
			}catch (Exception e) {
				log.error("接口调用出现未知异常"+e);
				serviceResult.setError("接口调用出现未知异常"+e);
			}
			return serviceResult;
	}

	/**
	 * 注册用户
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public  ServiceResult<MembersEntity>  register(@RequestParam(required = true) String userName,
												   @RequestParam(required = true) String passWord){

			ServiceResult serviceResult = new ServiceResult(){};

			try {

				MembersEntity members = membersService.loginByUserName(userName);

				if (members!=null){
					serviceResult.setError("此账户已注册！");
				}else {

					String password = MD5Utils.md5Password(passWord);

					MembersEntity membersEntity = new MembersEntity();
						long currentTimeMillis = System.currentTimeMillis()/1000;
						membersEntity.setPassword(password);
						membersEntity.setUsername(userName);
						membersEntity.setRegistertime(currentTimeMillis);
						membersEntity.setSource("mobile");
						membersEntity.setSign("1");
						membersEntity.setCanreceivesms(1);
						membersEntity.setCanreceiveemail(1);
						membersEntity.setModified(currentTimeMillis);
						membersEntity.setGradeId(1);
						membersEntity.setIsBlacklist(0);
						membersEntity.setNickName(userName);

					membersService.save(membersEntity);

					log.info("用户:${userName}注册成功");
				}
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
	public  ServiceResult<Boolean>  save(@RequestBody MembersEntity members){

			ServiceResult serviceResult = new ServiceResult(){};

			try {
				if (members == null){
					serviceResult.setError("添加对象为空");
				}else if (members.getPassword()!=null) {
					members.setPassword(MD5Utils.md5Password(members.getPassword()));
				}else {
					membersService.save(members);
					serviceResult.setCode(true);
				}
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
	public  ServiceResult<Boolean>  update(@RequestBody MembersEntity members){

			ServiceResult serviceResult = new ServiceResult(){};

			try {
				if (members == null){
					serviceResult.setError("修改对象为空");
				}else if (members.getPassword()!=null){
					members.setPassword(MD5Utils.md5Password(members.getPassword()));
				}else{
					membersService.update(members);
					serviceResult.setCode(true);
				}
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
	public  ServiceResult<Boolean>  delete(@RequestBody Integer[] ids){

			ServiceResult serviceResult = new ServiceResult(){};

			try {
				membersService.deleteBatch(ids);
				serviceResult.setCode(true);
			}catch (Exception e) {
				log.error("接口调用出现未知异常"+e);
				serviceResult.setError("接口调用出现未知异常"+e);
			}
			return serviceResult;
	}
	
}
