package com.durian.app.service;



import com.durian.app.domian.UserDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-11-18 15:50:19
 */
public interface AppUserService {
	
	UserDO get(String id);
	
	List<UserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserDO user);
	
	int update(UserDO user);
	
	int remove(String id);
	
	int batchRemove(String[] ids);
}
