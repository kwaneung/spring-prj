package com.portfolio.first.board.service;

import java.util.List;
import java.util.Map;

import com.portfolio.first.board.model.BoardVO;

public interface BoardService {

	public List<BoardVO> getBoardList() throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void deleteBoard(int bid) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
}
