package com.mycom.myapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
	
	@Autowired
	UserDAO userDAO;
	public UserVO getUser(UserVO vo) {
	return userDAO.getUser(vo);
	}
}
