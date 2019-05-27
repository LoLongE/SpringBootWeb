package com.springweb.test.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springweb.test.domain.BoardVO;
import com.springweb.test.domain.MemberVO;
import com.springweb.test.service.BoardService;

@Controller
public class BoardController {

	@Resource(name="BoardService")
	private BoardService boardService;
		
	@RequestMapping(value="/selectBoardList.do")
	public String selectBoardList(Model model, RedirectAttributes redirectAttributes,
			@ModelAttribute("memberVO") MemberVO memberVO,
			@ModelAttribute("boardVO") BoardVO boardVO)
	{
		List<BoardVO> result = boardService.selectBoardList();
		memberVO.setMember_id("노동현");
		memberVO.setMember_password("비밀번호");
		
		model.addAttribute("result", result);
		model.addAttribute("memberVO", memberVO);
		return "member/memberinfo02";
	}
	
}
