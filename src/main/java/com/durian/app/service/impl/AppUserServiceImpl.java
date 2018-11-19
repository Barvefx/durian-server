package com.durian.app.service.impl;

import com.durian.app.dao.AppUserDao;
import com.durian.app.domian.UserDO;
import com.durian.app.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;





@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired
	private AppUserDao appUserDao;
	
	@Override
	public UserDO get(String id){
		return appUserDao.get(id);
	}
	
	@Override
	public List<UserDO> list(Map<String, Object> map){
		return appUserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return appUserDao.count(map);
	}
	
	@Override
	public int save(UserDO user){
		return appUserDao.save(user);
	}
	
	@Override
	public int update(UserDO user){
		return appUserDao.update(user);
	}
	
	@Override
	public int remove(String id){
		return appUserDao.remove(id);
	}
	
	@Override
	public int batchRemove(String[] ids){
		return appUserDao.batchRemove(ids);
	}
	
}
