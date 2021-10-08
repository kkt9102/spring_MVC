package com.study.controller.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.vo.SampleVO;

@Controller
public class ReturnStringUseModelController {

	private static final Logger logger = LoggerFactory.getLogger(ReturnStringUseModelController.class);
	
	@RequestMapping("/sample/sample4")
	public String sample4(Model model) {
		
		// 샘플데이터 만들기
		SampleVO sample = new SampleVO("t",1099);
		
		logger.info("sample4");
		
		model.addAttribute(sample);
		
		return "/sample/sample4";
	}
}
