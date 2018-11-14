package com.durian.common.service;

import org.springframework.stereotype.Service;

import com.durian.common.domain.LogDO;
import com.durian.common.domain.PageDO;
import com.durian.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
