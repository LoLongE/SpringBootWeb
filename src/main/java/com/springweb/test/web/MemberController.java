package com.springweb.test.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springweb.test.domain.MemberVO;
import com.springweb.test.service.MemberService;

@Controller
public class MemberController {

	@Resource(name="MemberService")
	private MemberService memberService;
	
	@RequestMapping(value="/selectMemberTest01.do")
	public String selectMemberTest01(Model model, 
			HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes)
	{
		System.out.println("selectMemberTest01.do");
	
		String member_id = "";
		String member_password = "";
		member_id = httpServletRequest.getParameter("member_id");
		member_password = httpServletRequest.getParameter("member_password");
		// Git Test
		// TEST DATA
		member_id = "아이디";
		member_password = "비밀번호";
		// TEST DATA
		
		model.addAttribute("member_id", member_id);
		model.addAttribute("member_password", member_password);
		return "member/membertest";
	}
	
	@RequestMapping(value="/selectMemberTest02.do")
	public String selectMemberTest02(Model model, RedirectAttributes redirectAttributes,
			@RequestParam(value="member_id", defaultValue="") String member_id ,
			@RequestParam(value="member_password", defaultValue="") String member_password)
	{
		System.out.println("selectMemberTest02.do");
		
		// TEST DATA
		member_id = "아이디";
		member_password = "비밀번호";
		// TEST DATA
		
		model.addAttribute("member_id", member_id);
		model.addAttribute("member_password", member_password);
		return "member/membertest";
	}
	
	@RequestMapping(value="/selectMemberInfo01.do")
	public String selectMemberInfo01(Model model, RedirectAttributes redirectAttributes,
			@ModelAttribute("memberVO") MemberVO memberVO)
	{
		Map<String,Object> memberMap = new HashMap<String,Object>();
		memberMap = memberService.selectMemberInfo01(memberMap);
		model.addAttribute("memberMap", memberMap);
		return "member/memberinfo01";
	}
	
	@RequestMapping(value="/selectMemberInfo02.do")
	public String selectMemberInfo02(Model model, RedirectAttributes redirectAttributes,
			@ModelAttribute("memberVO") MemberVO memberVO)
	{
		memberVO = memberService.selectMemberInfo02(memberVO);
		model.addAttribute("memberVO", memberVO);
		return "member/memberinfo02";
	}
	
	
}
