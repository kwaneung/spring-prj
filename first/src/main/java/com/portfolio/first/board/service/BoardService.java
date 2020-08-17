package com.portfolio.first.board.service;

import java.util.List;
import java.util.Map;

import com.portfolio.first.board.common.Pagination;
<<<<<<< HEAD
import com.portfolio.first.board.common.Search;
=======
>>>>>>> jang
import com.portfolio.first.board.model.BoardVO;

public interface BoardService {

<<<<<<< HEAD
	public List<BoardVO> getBoardList(Search search) throws Exception;
=======
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
>>>>>>> jang
	public void insertBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void deleteBoard(int bid) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
<<<<<<< HEAD
	public int getBoardListCnt(Search search) throws Exception;
=======
	public int getBoardListCnt() throws Exception;
>>>>>>> jang
}
