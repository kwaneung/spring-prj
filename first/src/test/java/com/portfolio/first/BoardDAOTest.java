package com.portfolio.first;

import java.util.List;



import javax.inject.Inject;



import org.junit.Ignore;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.portfolio.first.board.dao.BoardDAO;

import com.portfolio.first.board.model.BoardVO;



@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {

		"classpath:spring/root-context.xml",

		"classpath:spring/dataSource-context.xml"

		})

public class BoardDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

	

	@Inject

	private BoardDAO boardDAO;

	

	@Test 

	public void testGetBoardList() throws Exception {

		List<BoardVO> boardList = boardDAO.getBoardList();

		logger.info("\n Board List \n ");

		if(boardList.size() > 0) {

			for(BoardVO list : boardList) {

				logger.info(list.title);

			}

		} else {

			logger.info("�����Ͱ� �����ϴ�.");

		}

	}

	

	@Test

	public void testGetBoardContent() throws Exception {

		BoardVO boardVO = boardDAO.getBoardContent(3);

		logger.info("\n Board List \n ");

		if(boardVO != null) {

			logger.info("�۹�ȣ : " + boardVO.getBid() );

			logger.info("������ : " + boardVO.getTitle() );

			logger.info("�۳��� : " + boardVO.getContent() );

			logger.info("���±� : " + boardVO.getTag() );

			logger.info("��ȸ�� : " + boardVO.getView_cnt() );

			logger.info("�ۼ��� : " + boardVO.getReg_id() );

			logger.info("�ۼ��� : " + boardVO.getReg_dt() );

			logger.info("������ : " + boardVO.getEdit_dt() );

		} else {

			logger.info("�����Ͱ� �����ϴ�.");

		}

	}

	

	@Test @Ignore

	public void testInsertBoard() throws Exception {

		BoardVO boardVO = new BoardVO();

		boardVO.setCate_cd("4");

		boardVO.setTitle("�� ��° �Խñ�");

		boardVO.setContent("�� ��° �Խñ�");

		boardVO.setTag("4");

		boardVO.setReg_id("4");

		

		int result = boardDAO.insertBoard(boardVO);

		logger.info("\n Insert Board Result " +result);

		if(result == 1) {

			logger.info("\n �Խù� ��� ���� ");

		} else {

			logger.info("\n �Խù� ��� ����");

		}

	}

	

	@Test @Ignore 

	public void testUpdateBoard() throws Exception {

		BoardVO boardVO = new BoardVO();

		boardVO.setBid(1);

		boardVO.setCate_cd("1");

		boardVO.setTitle("test1-edited");

		boardVO.setContent("test1-edited");

		boardVO.setTag("1-edited");

		

		int result = boardDAO.updateBoard(boardVO);

		logger.info("\n Update Board Result \n ");

		if(result > 0) {

			logger.info("\n �Խù� ���� ���� ");

		} else {

			logger.info("\n �Խù� ���� ����");

		}

	}

	

	@Test @Ignore  

	public void tesDeleteBoard() throws Exception {

		

		int result = boardDAO.deleteBoard(1);

		logger.info("\n Delete Board Result \n ");

		if(result > 0) {

			logger.info("\n �Խù� ���� ���� ");

		} else {

			logger.info("\n �Խù� ���� ����");

		}

	}



	@Test @Ignore

	public void testUpdateViewCnt() throws Exception {

		

		int result = boardDAO.updateViewCnt(3);

		logger.info("\n Update View Count Result \n ");

		if(result > 0) {

			logger.info("\n �Խù� ��ȸ�� ������Ʈ ���� ");

		} else {

			logger.info("\n �Խù� ��ȸ�� ������Ʈ ����");

		}

	}

}