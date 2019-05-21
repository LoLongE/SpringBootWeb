package com.springweb.test.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springweb.test.domain.TestVO;
import com.springweb.test.service.TestService;

@Controller
public class TestController {
	
	@Resource(name="TestService")
	private TestService testService;
	
	@RequestMapping("/test")
	public String Test()
	{
		System.out.println("TestController-Start");
		testService.testdataflow();
		System.out.println("TestController-End");
		return "test";
	}
	
	@RequestMapping("/landerz")
	public String landerz(Model model, RedirectAttributes redirectAttributes,
			@ModelAttribute("TestVO") TestVO testVO,
			@RequestParam(value="member_id", defaultValue="") String member_id ) 
	{
		System.out.println("landerz");
		//redirectAttributes.addAttribute("member_id", member_id);
		return "landerz/index";
	}

}