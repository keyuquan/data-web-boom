package com.web.boom.system.service;

import java.util.Collection;
import java.util.List;

import com.web.boom.system.domain.UserDO;
import com.web.boom.system.domain.UserOnline;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

@Service
public interface SessionService {
	List<UserOnline> list();

	List<UserDO> listOnlineUser();

	Collection<Session> sessionList();
	
	boolean forceLogout(String sessionId);
}
