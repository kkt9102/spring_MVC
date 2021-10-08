package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	@RequestMapping("/borad/boardlist")
	public String showBoardList() {
		return "/board/boardlist";
	}
}
