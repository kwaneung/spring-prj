package com.portfolio.first.board.service;

import java.util.List;
import java.util.Map;

import com.portfolio.first.board.common.Pagination;
import com.portfolio.first.board.common.Search;
import com.portfolio.first.board.model.BoardVO;

public interface BoardService {

	public List<BoardVO> getBoardList(Search search) throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void deleteBoard(int bid) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	public int getBoardListCnt(Search search) throws Exception;
}
