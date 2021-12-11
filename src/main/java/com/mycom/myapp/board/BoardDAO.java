package com.mycom.myapp.board;



import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;

	public int insertBoard(BoardVO vo) {
		int result = sqlSession.insert("Board.insertBoard", vo);
		return result;
	}

	// 글 삭제
	public int deleteBoard(int seq) {
		int result = sqlSession.delete("Board.deleteBoard", seq);
		return result;
	}
	
	public int updateBoard(BoardVO vo) {
		int result = sqlSession.update("Board.updateBoard", vo);
		return result;
	}	
	
	public BoardVO getBoard(int seq) {
		BoardVO one = sqlSession.selectOne("Board.getBoard", seq);
		return one;
	}
	
	public List<BoardVO> getBoardList() {
		List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
		return list;
	}
}
