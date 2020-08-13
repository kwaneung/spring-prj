package com.portfolio.first.board.dao;

import java.util.List;



import com.portfolio.first.board.model.BoardVO;
import com.portfolio.first.common.Pagination;



public interface BoardDAO {
	
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;

	public BoardVO getBoardContent(int bid) throws Exception;

	public int insertBoard(BoardVO boardVO) throws Exception;

	public int updateBoard(BoardVO boardVO) throws Exception;

	public int deleteBoard(int bid) throws Exception;

	public int updateViewCnt(int bid) throws Exception;
	
	//�� �Խñ� ���� Ȯ��
	public int getBoardListCnt() throws Exception;

}