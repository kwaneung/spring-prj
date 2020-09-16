package com.portfolio.first.menu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.portfolio.first.menu.model.MenuVO;

@Repository
public class MenuDAOImpl implements MenuDAO {
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<MenuVO> getMenuList() throws Exception {
		return sqlSession.selectList("com.portfolio.first.menu.menuMapper.getMenuList");
	}

	@Override
	public int saveMenu(MenuVO menuVO) throws Exception {
		return sqlSession.insert("com.portfolio.first.menu.menuMapper.insertMenu", menuVO);
	}

	@Override
	public int updateMenu(MenuVO menuVO) throws Exception {
		return sqlSession.update("com.portfolio.first.menu.menuMapper.updateMenu", menuVO);
	}

	@Override
	public int deleteMenu(String code) throws Exception {
		return sqlSession.delete("com.portfolio.first.menu.menuMapper.deleteMenu", code);
	}

}