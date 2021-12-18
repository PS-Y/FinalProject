package com.mycom.myapp.member;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberVO> {

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberVO vo = new MemberVO();
		vo.setSeq(rs.getInt("seq"));
		vo.setSnumber(rs.getString("snumber"));
		vo.setName(rs.getString("name"));
		vo.setGender(rs.getString("gender"));
		vo.setBirth(rs.getString("birth"));
		vo.setMajor(rs.getString("major"));
		vo.setResidence(rs.getString("residence"));
		return vo;
	}

}