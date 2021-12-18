package com.mycom.myapp.member;


import java.util.List;

public interface MemberService {
	public int insertMember(MemberVO vo);
	public int deleteMember(int seq);
	public int updateMember(MemberVO vo);
	public MemberVO getMember(int seq);
	public List<MemberVO>getMemberList();
}
