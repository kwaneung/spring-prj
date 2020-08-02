package com.portfolio.first.board.error.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice // @ResponseStatus 보다 @ControllerAdvice 가 먼저 호출
public class CommonExceptionAdvice {

	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	@ExceptionHandler(RuntimeException.class)
	public String errorException(Model model, Exception e) {
		logger.info("@ControllerAdvice 방식 \n###exeption : " + e.getMessage());
		
		model.addAttribute("exception", e);
		
		return "error/exception";
	}
}