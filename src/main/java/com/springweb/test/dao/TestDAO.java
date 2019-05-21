package com.springweb.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("TestDAO")
public class TestDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public void testdataflow()
	{
		System.out.println("TestDAO");
		return;
		//return sqlSessionTemplate.selectOne("testdataflow");
	}
}