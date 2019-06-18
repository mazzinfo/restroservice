package org.mazz.restroservice.service;

import java.util.List;
import java.util.Optional;

import org.mazz.restroservice.entity.UserMast;
import org.mazz.restroservice.exception.ResourceNotFoundException;
import org.mazz.restroservice.repository.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserMasterServiceImpl implements UserMasterService  {
	
	  @Autowired private UserMasterRepository userMasterRepository;
	  
	  @Override public UserMast loginValidation(UserMast user)
	  throws ResourceNotFoundException {
	  
	  List<UserMast> uservalidation = userMasterRepository
	  .getUserListByUserCode(user.getUserCode()) .orElseThrow(() -> new
	  ResourceNotFoundException("User not found on :: " + user.getUserCode()));
	  
	  
	  
	  UserMast validUser = uservalidation.stream() .filter(b ->
	  b.getPassWrd().equalsIgnoreCase(user.getPassWrd()))
	  .findFirst().orElseThrow(() -> new
	  ResourceNotFoundException("Password is Incorrect "));
	  
	  return validUser; }
	 

}
