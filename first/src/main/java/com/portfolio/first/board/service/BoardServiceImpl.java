package com.portfolio.first.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.first.board.dao.BoardDAO;
import com.portfolio.first.board.error.controller.NotFoundException;
import com.portfolio.first.board.model.BoardVO;

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
	
	public void updateBoard(BoardVO boardVO) throws Exception {
		boardDAO.updateBoard(boardVO);
	}
	
//	public BoardVO getBoardContent(int bid) throws Exception{
//		boardDAO.updateViewCnt(bid);
//		return boardDAO.getBoardContent(bid);
//	}
	
	@Override
	public void deleteBoard(int bid) throws Exception {
		boardDAO.deleteBoard(bid);
	}

	@Override
	@Transactional(rollbackFor = {Exception.class})
	public BoardVO getBoardContent(int bid) throws Exception{
		BoardVO boardVO = new BoardVO();

		boardDAO.updateViewCnt(bid);
	//	boardVO = boardDAO.getBoardContent(bid);
		try {
			boardVO.setBid(bid);
			boardVO.setReg_id("장병호 브랜치asdasdasdasdasdasdasdasdasdasdadasdasdasdasdasdasdasdasdasdasdasdasdasd1111111111111111111111111111111111111");
			boardDAO.updateBoard(boardVO);
		} catch (RuntimeException e) {
			throw new NotFoundException();
			//throw new RuntimeException("RuntimeException occured");
		}
		return boardVO;
	}
}