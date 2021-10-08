package com.study.controller.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnStringController {

	private static final Logger logger = LoggerFactory.getLogger(ReturnStringController.class);
	
	@RequestMapping("/sample/sample3")
	// @ModelAtriibute("msg")는 요청 시 'msg' 이름의 파라미터를 문자열로 처리해주고, 뷰에 전달되도록 한다.
	// 스프링 MVC의 @ModelAtrribute는 자동으로 해당 객체를 뷰까지 전달한다.
	public String sample3(@ModelAttribute("msg") String msg) {
		logger.info("sample3 called....................");
		return "/sample/sample3";
	}
	
}
