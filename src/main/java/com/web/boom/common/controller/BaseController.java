package com.web.boom.common.controller;

import com.web.boom.common.utils.ShiroUtils;
import org.springframework.stereotype.Controller;
import com.web.boom.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}