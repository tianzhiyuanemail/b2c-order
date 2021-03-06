package com.b2c.service.members;


import com.b2c.common.PageOld;
import com.b2c.domain.members.MembersEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author admin
 * @email ${email}
 * @date 2017-11-18 14:36:03
 */
public interface MembersService {
	
	MembersEntity queryObject(Integer id);
	
	List<MembersEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(MembersEntity members);
	
	void update(MembersEntity members);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);

	PageOld<List<MembersEntity>> queryLists(Map<String, Object> params);

	MembersEntity loginByUserName(String userName);

}
