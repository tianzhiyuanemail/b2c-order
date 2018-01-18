package com.b2c.service.members.impl;

import com.b2c.common.PageOld;
import com.b2c.dao.members.MembersDao;
import com.b2c.domain.members.MembersEntity;
import com.b2c.service.members.MembersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service("membersService")
@Slf4j
public class MembersServiceImpl implements MembersService {
	@Autowired
	private MembersDao membersDao;
	
	@Override
	public MembersEntity queryObject(Integer id){
		return membersDao.queryObject(id);
	}
	
	@Override
	public List<MembersEntity> queryList(Map<String, Object> map){
		return membersDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return membersDao.queryTotal(map);
	}
	
	@Override
	public void save(MembersEntity members){
		membersDao.save(members);
	}
	
	@Override
	public void update(MembersEntity members){
		membersDao.update(members);
	}
	
	@Override
	public void delete(Integer id){
		membersDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		membersDao.deleteBatch(ids);
	}

	@Override
	public PageOld<List<MembersEntity>> queryLists(Map<String, Object> params) {
		PageOld<List<MembersEntity>> pageOld = new PageOld<List<MembersEntity>>(params){};
		try {
			//查询列表数据
			List<MembersEntity> membersList = membersDao.queryList(params);
			int total = membersDao.queryTotal(params);
			pageOld = new PageOld(membersList, total);
		}catch (Exception e){
			log.error("membersDao:queryLists()接口出现未知异常：{}"+e.getMessage());
		}
		return pageOld;

	}

	@Override
	public MembersEntity loginByUserName(String userName) {
		MembersEntity members = null;
		try {
			 members = membersDao.loginByUserName(userName);

		}catch (Exception e){
			log.error("membersDao:loginByUserName()接口出现未知异常：{}"+e.getMessage());
		}

		return members;
	}

}
