package com.springweb.test.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springweb.test.dao.MemberDAO;
import com.springweb.test.domain.MemberVO;

@Service("MemberService")
public class MemberServiceImpl implements MemberService{
	
	@Resource(name="MemberDAO")
	private MemberDAO memberDAO;
	
	public Map<String, Object> selectMemberInfo01(Map<String, Object> memberMap)
	{
		System.out.println(memberMap);
		memberMap.put("member_id", "노동아이디");
		memberMap.put("member_password", "노동패스워드");
		return memberMap;
		//return memberDAO.selectMemberInfo(memberVO);
	}
	
	public MemberVO selectMemberInfo02(MemberVO memberVO)
	{
		System.out.println(memberVO);
		memberVO.setMember_id("노동아이디");
		memberVO.setMember_password("노동패스워드");
		return memberVO;
		//return memberDAO.selectMemberInfo(memberVO);
	}

}
