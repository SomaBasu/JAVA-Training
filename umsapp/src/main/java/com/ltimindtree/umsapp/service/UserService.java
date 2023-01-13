package com.ltimindtree.umsapp.service;

import java.util.List;

import com.ltimindtree.umsapp.dto.UserDTO;
import com.ltimindtree.umsapp.exception.umsException;

public interface UserService {	
	public Integer addUser(UserDTO user) throws umsException;
	public List<UserDTO> getAllUsers() throws umsException;
	public UserDTO getUser(Integer userId) throws umsException;
	public void deleteUser(Integer userId) throws umsException;
	public void updateUser(Integer userId, UserDTO user) throws umsException;
}
