package com.portfolio.first.menu.dao;

import java.util.List;
import com.portfolio.first.menu.model.MenuVO;

public interface MenuDAO {
	public List<MenuVO> getMenuList() throws Exception;
	
	public int saveMenu(MenuVO menuVO) throws Exception;
	
	public int updateMenu(MenuVO menuVO) throws Exception;
	
	public int deleteMenu(String code) throws Exception;
}