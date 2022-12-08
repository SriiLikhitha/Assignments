package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.User;
import com.axis.exception.ResourceNotFoundException;
import com.axis.repository.UserRepository;
 
@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	//get all users
	@GetMapping
	public List<User> getAllUsers(){
		return this.userRepository.findAll();
	}
	//get user by id
	@GetMapping("/{userID}/")
	public User getUserById(@PathVariable (value="userID") long userID) {
		return this.userRepository.findById(userID)
				.orElseThrow(()-> new ResourceNotFoundException("user not found with id:"+userID));
		
	}
	//create user
	@PostMapping
	public User createUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}
    //	update user 
	@PutMapping("/{userID}/")
	public User updateUser(@RequestBody User user,@PathVariable("userID")long userID) {
		User existingUser= this.userRepository.findById(userID)
				.orElseThrow(()->new ResourceNotFoundException("User not found with id:"+userID));
	    existingUser.setFirstName(user.getFirstName());
	    existingUser.setLastName(user.getLastName());
	    existingUser.setEmail(user.getEmail());
	    return this.userRepository.save(existingUser);
	}
	//delete user by id
	@DeleteMapping("/{userID}/")
	public ResponseEntity<User> deleteUser(@PathVariable("userID")long userID){
		User existingUser= this.userRepository.findById(userID)
				.orElseThrow(()->new ResourceNotFoundException("User not found with id:"+userID));
	    this.userRepository.delete(existingUser);
	    return ResponseEntity.ok().build();
	}
}