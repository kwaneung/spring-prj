package com.portfolio.first.board.service;

import java.util.List;
import com.portfolio.first.board.model.BoardVO;
import com.portfolio.first.common.Pagination;

public interface BoardService {

	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void deleteBoard(int bid) throws Exception;
	//�� �Խñ� ���� Ȯ��
	public int getBoardListCnt() throws Exception;
}
