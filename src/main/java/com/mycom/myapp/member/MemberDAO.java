package com.mycom.myapp.member;



import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;

	public int insertMember(MemberVO vo) {
		int result = sqlSession.insert("Member.insertMember", vo);
		return result;
	}

	// ê¸? ?‚­? œ
	public int deleteMember(int seq) {
		int result = sqlSession.delete("Member.deleteMember", seq);
		return result;
	}
	
	public int updateMember(MemberVO vo) {
		int result = sqlSession.update("Member.updateMember", vo);
		return result;
	}	
	
	public MemberVO getMember(int seq) {
		MemberVO one = sqlSession.selectOne("Member.getMember", seq);
		return one;
	}
	
	public List<MemberVO> getMemberList() {
		List<MemberVO> list = sqlSession.selectList("Member.getMemberList");
		return list;
	}
}
