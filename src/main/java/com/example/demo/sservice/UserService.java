package com.example.demo.sservice;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.User;
import com.example.demo.repository.UserRepo;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepo userrepo;
	
	public void saveuserdata(User user) {
		userrepo.save(user);
		
	}

}
