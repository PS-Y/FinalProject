package com.mycom.myapp.member;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServicelmpl implements MemberService {
	
	@Autowired
	MemberDAO MemberDAO;
	
	@Override
	public int insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return MemberDAO.insertMember(vo);
	}

	@Override
	public int deleteMember(int seq) {
		// TODO Auto-generated method stub
		return MemberDAO.deleteMember(seq);
	}

	@Override
	public int updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return MemberDAO.updateMember(vo);
	}

	@Override
	public MemberVO getMember(int seq) {
		// TODO Auto-generated method stub
		return MemberDAO.getMember(seq);
	}

	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		return MemberDAO.getMemberList();
	}

}
