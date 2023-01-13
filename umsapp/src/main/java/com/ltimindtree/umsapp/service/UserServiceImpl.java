package com.ltimindtree.umsapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ltimindtree.umsapp.dto.UserDTO;
import com.ltimindtree.umsapp.entity.User;
import com.ltimindtree.umsapp.exception.umsException;
import com.ltimindtree.umsapp.repository.UserRepository;

@Service(value = "userService")
@Transactional

public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public Integer addUser(UserDTO user) throws umsException {
		User userEntity = new User();
		userEntity.setUserID(user.getUserID());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhone(user.getPhone());
		userEntity.setWebsite(user.getWebsite());
		User userEntity2 = userRepository.save(userEntity);
		return userEntity2.getUserID();
	}
	
	@Override
	public List<UserDTO> getAllUsers() throws umsException {
		Iterable<User> users = userRepository.findAll();
		List<UserDTO> users2 = new ArrayList<>();
		users.forEach(user -> {
			UserDTO usr = new UserDTO();
			usr.setUserID(user.getUserID());
			usr.setFirstName(user.getFirstName());
			usr.setLastName(user.getLastName());
			usr.setEmail(user.getEmail());
			usr.setPhone(user.getPhone());
			usr.setWebsite(user.getWebsite());
			users2.add(usr);			
		});
		if(users2.isEmpty())
			throw new umsException("Service.USERS_NOT_FOUND");
		return users2;
	}
	
	@Override
	public UserDTO getUser(Integer userId) throws umsException {
		Optional<User> optional = userRepository.findById(userId);
		User usr = optional.orElseThrow(() -> new umsException("Service.USER_NOT_FOUND"));
		UserDTO usr2 = new UserDTO();
		usr2.setUserID(usr.getUserID());
		usr2.setFirstName(usr.getFirstName());
		usr2.setLastName(usr.getLastName());
		usr2.setEmail(usr.getEmail());
		usr2.setPhone(usr.getPhone());
		usr2.setWebsite(usr.getWebsite());
		return usr2;			
	}

	@Override
	public void deleteUser(Integer userId) throws umsException {
		Optional<User> user = userRepository.findById(userId);
		user.orElseThrow(() -> new umsException("Service.USER_NOT_FOUND"));
		userRepository.deleteById(userId);		
	}

	@Override
	public void updateUser(Integer userId, UserDTO user) throws umsException {
		Optional<User> usr = userRepository.findById(userId);
		User usr2 = usr.orElseThrow(() -> new umsException("Service.CUSTOMER_NOT_FOUND"));	
		
		usr2.setFirstName(user.getFirstName());
		usr2.setLastName(user.getLastName());
		usr2.setEmail(user.getEmail());
		usr2.setPhone(user.getPhone());
		usr2.setWebsite(user.getWebsite());
		
	}	
}
