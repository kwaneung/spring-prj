package com.portfolio.first.board.service;

import java.util.List;
import java.util.Map;

import com.portfolio.first.board.model.BoardVO;

public interface BoardService {

	public List<BoardVO> getBoardList() throws Exception;
	
}