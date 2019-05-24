package com.springweb.test.service;

import java.util.Map;

import com.springweb.test.domain.MemberVO;

public interface MemberService {

	public Map<String,Object> selectMemberInfo01(Map<String,Object> memberMap);
	
	public MemberVO selectMemberInfo02(MemberVO memberVO);
	
}
