package com.portfolio.first.board.dao;

import java.util.List;

import com.portfolio.first.board.common.Pagination;
<<<<<<< HEAD
import com.portfolio.first.board.common.Search;
=======
>>>>>>> jang
import com.portfolio.first.board.model.BoardVO;



public interface BoardDAO {

<<<<<<< HEAD
	public List<BoardVO> getBoardList(Search search) throws Exception;
=======
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
>>>>>>> jang
	public BoardVO getBoardContent(int bid) throws Exception;
	public int insertBoard(BoardVO boardVO) throws Exception;
	public int updateBoard(BoardVO boardVO) throws Exception;
	public int deleteBoard(int bid) throws Exception;
	public int updateViewCnt(int bid) throws Exception;
<<<<<<< HEAD
	public int getBoardListCnt(Search search) throws Exception;
=======
	public int getBoardListCnt() throws Exception;
>>>>>>> jang
}