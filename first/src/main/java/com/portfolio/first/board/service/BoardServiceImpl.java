package com.portfolio.first.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.first.board.dao.BoardDAO;
import com.portfolio.first.board.model.BoardVO;
import com.portfolio.first.board.model.ReplyVO;
import com.portfolio.first.common.Pagination;
import com.portfolio.first.common.Search;
import com.portfolio.first.error.controller.NotFoundException;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList(Search search) throws Exception {
		return boardDAO.getBoardList(search);
	}
	
	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}
	
	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		boardDAO.updateBoard(boardVO);
	}
	
//	@Transactional
//	public BoardVO getBoardContent(int bid) throws Exception{
//		boardDAO.updateViewCnt(bid);
//		return boardDAO.getBoardContent(bid);
//	}
	
	@Transactional
	@Override
	public BoardVO getBoardContent(int bid) throws Exception{
		BoardVO boardVO = new BoardVO();
		 
		boardDAO.updateViewCnt(bid);
		boardVO = boardDAO.getBoardContent(bid);        //�ּ��� Ǯ�� �ݴϴ�.
	//   ����ó�� �׽�Ʈ�� �������Ƿ� �Ʒ� ������ ���� �ϰų� �ּ� ó�� �մϴ�.
	//    try {
	//		boardVO.setBid(bid);
	//		boardVO.setCate_cd("1111111111111111111111111111111111111");
	//		boardDAO.updateBoard(boardVO);
	//	} catch (RuntimeException e) {
	//		throw new NotFoundException();
	//	}
		return boardVO;
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
	
	//�� �Խñ� ���� Ȯ��
	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return boardDAO.getBoardListCnt(search);
	}
	
	
	// ��� ����Ʈ

		@Override

		public List<ReplyVO> getReplyList(int bid) throws Exception {

			return boardDAO.getReplyList(bid);

		}



		@Override

		public int saveReply(ReplyVO replyVO) throws Exception {

			return boardDAO.saveReply(replyVO);

		}



		@Override

		public int updateReply(ReplyVO replyVO) throws Exception {

			return boardDAO.updateReply(replyVO);

		}



		@Override

		public int deleteReply(int rid) throws Exception {

			return boardDAO.deleteReply(rid);

		}

}