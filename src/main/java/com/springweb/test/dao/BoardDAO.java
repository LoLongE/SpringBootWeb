package com.springweb.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springweb.test.domain.BoardVO;

@Mapper
@Repository("BoardDAO")
public class BoardDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardVO> selectBoardList()
	{
		List<BoardVO> result = new ArrayList<BoardVO>();
		BoardVO boardVO = new BoardVO();
		
		// Test �Խñ� 01
		boardVO.setBoard_id("1");
		boardVO.setBoard_title("����000001");
		boardVO.setBoard_contents("����00000001");
		boardVO.setBoard_regist_id("�뵿��");
		result.set(0, boardVO);
		
		// Test �Խñ� 01
		boardVO.setBoard_id("2");
		boardVO.setBoard_title("����000002");
		boardVO.setBoard_contents("����00000002");
		boardVO.setBoard_regist_id("�뵿��");
		result.set(1, boardVO);
				
		// Test �Խñ� 01
		boardVO.setBoard_id("3");
		boardVO.setBoard_title("����000003");
		boardVO.setBoard_contents("����00000003");
		boardVO.setBoard_regist_id("�̿���");
		result.set(2, boardVO);
				
				
		// Test �Խñ� 01
		boardVO.setBoard_id("4");
		boardVO.setBoard_title("����000004");
		boardVO.setBoard_contents("����00000004");
		boardVO.setBoard_regist_id("�������ٺ�");
		result.set(3, boardVO);
				
				
		// Test �Խñ� 01
		boardVO.setBoard_id("5");
		boardVO.setBoard_title("����000005");
		boardVO.setBoard_contents("����00000005");
		boardVO.setBoard_regist_id("�뵿��");
		result.set(4, boardVO);
				
		return result;
		//return sqlSessionTemplate.selectOne("selectMemberInfo", memberVO);
	}
}
