package org.mazz.restroservice.repository;

import java.util.List;
import java.util.Optional;

import org.mazz.restroservice.entity.PosMast;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PosMasterRepository extends JpaRepository<PosMast, Long> {
	
//	 @Query("FROM UserMasterEntity t where t.userName = :userName")     
//	Optional<List<UserMasterEntity>> getUserListByUserName( @Param("userName") String userName);
	
}