package com.springweb.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springweb.test.dao.TestDAO;

@Service("TestService")
public class TestServiceImpl implements TestService {

	@Resource(name="TestDAO")
	private TestDAO testDAO;
	
	public void testdataflow()
	{
		System.out.println("TestServiceImpl-Start");
		testDAO.testdataflow();
		System.out.println("TestServiceImpl-End");
		return;
	}
}