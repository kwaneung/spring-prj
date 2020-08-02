package com.portfolio.first.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.first.board.dao.BoardDAO;
import com.portfolio.first.board.model.BoardVO;
import com.portfolio.first.error.controller.NotFoundException;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList() throws Exception {
		return boardDAO.getBoardList();
	}
	
	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}
	
	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		boardDAO.updateBoard(boardVO);
	}
	
	@Transactional
	public BoardVO getBoardContent(int bid) throws Exception{
		boardDAO.updateViewCnt(bid);
		return boardDAO.getBoardContent(bid);
	}
	
//	@Transactional
//	@Override
//	public BoardVO getBoardContent(int bid) throws Exception{
//		BoardVO boardVO = new BoardVO();
//		    
//		boardDAO.updateViewCnt(bid);
//	//	boardVO = boardDAO.getBoardContent(bid);
//		try {
//			boardVO.setBid(bid);
//			boardVO.setCate_cd("1111111111111111111111111111111111111");
//			boardDAO.updateBoard(boardVO);
//		} catch (RuntimeException e) {
//			throw new NotFoundException();
//		}
//		return boardVO;
//	}
	
	@Override
	public void deleteBoard(int bid) throws Exception {
		 boardDAO.deleteBoard(bid);
	}

}