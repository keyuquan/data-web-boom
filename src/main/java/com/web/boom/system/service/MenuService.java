package com.web.boom.system.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.web.boom.common.domain.Tree;
import com.web.boom.system.domain.MenuDO;
import org.springframework.stereotype.Service;

@Service
public interface MenuService {
	Tree<MenuDO> getSysMenuTree(Long id);

	List<Tree<MenuDO>> listMenuTree(Long id);

	Tree<MenuDO> getTree();

	Tree<MenuDO> getTree(Long id);

	List<MenuDO> list(Map<String, Object> params);

	int remove(Long id);

	int save(MenuDO menu);

	int update(MenuDO menu);

	MenuDO get(Long id);

	Set<String> listPerms(Long userId);
}
