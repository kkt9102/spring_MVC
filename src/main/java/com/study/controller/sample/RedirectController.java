package com.study.controller.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	private static final Logger logger = LoggerFactory.getLogger(RedirectController.class);
	
	@RequestMapping("/sample/dummysample5")
	public String redirectSample(RedirectAttributes rttr) {
		logger.info("redirectSample called but redirect to /sample5..................");
		
		rttr.addFlashAttribute("msg","This is the Message!! with redirected");
		return "redirect:/sample/sample5";
	}
	
	@RequestMapping("/sample/sample5")
	public void sample5(@ModelAttribute String msg) {
		logger.info("sample5 called...................." + msg);
	}
}
