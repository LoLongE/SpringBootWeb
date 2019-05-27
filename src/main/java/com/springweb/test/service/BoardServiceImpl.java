package com.springweb.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springweb.test.dao.BoardDAO;
import com.springweb.test.domain.BoardVO;
import com.springweb.test.domain.MemberVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
	
	public List<BoardVO> selectBoardList()
	{
		return boardDAO.selectBoardList();
	}

}
