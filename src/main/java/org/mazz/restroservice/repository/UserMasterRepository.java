package org.mazz.restroservice.repository;

import java.util.List;
import java.util.Optional;

import org.mazz.restroservice.entity.UserMast;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMast, Long> {
	
	 @Query("FROM UserMast t where t.userCode = :userCode")     
	Optional<List<UserMast>> getUserListByUserCode( @Param("userCode") Long userCode);
	
}