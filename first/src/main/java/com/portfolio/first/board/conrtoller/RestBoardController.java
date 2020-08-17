package com.portfolio.first.board.conrtoller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.first.board.model.ReplyVO;
import com.portfolio.first.board.service.BoardService;

@RestController
@RequestMapping(value = "/restBoard")
public class RestBoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService boardService;
	
	@RequestMapping(value = "/getReqlyList", method = RequestMethod.POST)
	public List<ReplyVO> getReplyList(@RequestParam("bid") int bid) throws Exception {
		return boardService.getReplyList(bid);
	}
}