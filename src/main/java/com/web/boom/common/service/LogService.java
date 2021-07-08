package com.web.boom.common.service;

import com.web.boom.common.domain.LogDO;
import com.web.boom.common.domain.PageDO;
import com.web.boom.common.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
