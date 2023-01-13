package com.ltimindtree.umsapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.umsapp.dto.UserDTO;
import com.ltimindtree.umsapp.exception.umsException;
import com.ltimindtree.umsapp.service.UserService;



@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class UserAPI {
	
	@Autowired
	private UserService userService;
	@Autowired
	private Environment environment;
	
	@PostMapping(value = "/users")
	public ResponseEntity<String> addUser(@RequestBody UserDTO user) throws umsException {
		Integer userId = userService.addUser(user);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + userId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
	}
	@GetMapping(value = "/users")
	public ResponseEntity<List<UserDTO>> getAllUsers() throws umsException {
		List<UserDTO> userList = userService.getAllUsers();
		return new ResponseEntity<>(userList, HttpStatus.OK);
	}	
	
	@GetMapping(value = "/users/{userId}")
	public ResponseEntity <UserDTO> getUser(@PathVariable Integer userId) throws umsException {
		UserDTO user = userService.getUser(userId);
		return new ResponseEntity<>(user, HttpStatus.OK);		
	}
	
	@DeleteMapping(value = "/users/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId) throws umsException {
		userService.deleteUser(userId);
		String successMessage = environment.getProperty("API.DELETE_SUCCESS");
		return new ResponseEntity<>(successMessage, HttpStatus.OK);
	}
	
	@PutMapping(value = "/users/{userId}")
	public ResponseEntity<String> updateUser(@PathVariable Integer userId, @RequestBody UserDTO user) throws umsException {
		userService.updateUser(userId,user);
		return new ResponseEntity<>( HttpStatus.OK);
	}
}
