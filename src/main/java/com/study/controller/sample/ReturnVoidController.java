package com.study.controller.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReturnVoidController {

	private static final Logger logger = LoggerFactory.getLogger(ReturnVoidController.class);
	
	@RequestMapping("/sample/sample1")
	public void sample1() {
		logger.info("sample1 called....................");
		return;
	}
	
	@RequestMapping("/sample/sample2")
	public void sample2() {
		logger.info("sample2 called....................");
		return;
	}
}
