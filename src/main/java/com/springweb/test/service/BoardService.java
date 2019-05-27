package com.springweb.test.service;

import java.util.List;

import com.springweb.test.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> selectBoardList();
	
}
