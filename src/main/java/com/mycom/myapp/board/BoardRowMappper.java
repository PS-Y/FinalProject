package com.mycom.myapp.board;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BoardRowMappper implements RowMapper<BoardVO> {

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO vo = new BoardVO();
		vo.setSeq(rs.getInt("seq"));
		vo.setTitle(rs.getString("title"));
		vo.setContent(rs.getString("content"));
		vo.setWriter(rs.getString("writer"));
		vo.setCategory(rs.getString("category"));
		vo.setRegdate(rs.getString("regdate"));
		return vo;
	}

}
