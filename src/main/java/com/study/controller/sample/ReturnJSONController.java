package com.study.controller.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.vo.SampleVO;

@Controller
public class ReturnJSONController {

	@RequestMapping("/sample/sample6")
	public @ResponseBody SampleVO doJSON() {
		
		SampleVO vo = new SampleVO("샘플상품", 10000);
		
		return vo;
	}
}
