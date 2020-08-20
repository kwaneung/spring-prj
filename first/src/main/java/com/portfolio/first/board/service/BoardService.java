package com.portfolio.first.board.service;

import java.util.List;
import com.portfolio.first.board.model.BoardVO;
import com.portfolio.first.common.Pagination;
import com.portfolio.first.common.Search;

public interface BoardService {

	public List<BoardVO> getBoardList(Search search) throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void deleteBoard(int bid) throws Exception;
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;
}
