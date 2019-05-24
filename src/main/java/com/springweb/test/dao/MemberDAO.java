package com.springweb.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springweb.test.domain.MemberVO;

@Mapper
@Repository("MemberDAO")
public class MemberDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public MemberVO selectMemberInfo(MemberVO memberVO)
	{
		return null;
		//return sqlSessionTemplate.selectOne("selectMemberInfo", memberVO);
	}
}
