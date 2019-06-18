package org.mazz.restroservice.service;

import java.util.Optional;

import org.mazz.restroservice.entity.UserMast;
import org.mazz.restroservice.exception.ResourceNotFoundException;

public interface UserMasterService {
	
	
	UserMast loginValidation (UserMast userMasterEntity) throws
	  ResourceNotFoundException;
	 

}
