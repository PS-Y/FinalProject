package com.mycom.myapp.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Autowired
	SqlSessionTemplate sqlSession;
	public UserVO getUser(UserVO vo) {
	return sqlSession.selectOne("User.getUser", vo);
	} 
}
