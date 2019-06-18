package org.mazz.restroservice.repository;

import java.util.List;
import java.util.Optional;


import org.mazz.restroservice.entity.RateMast;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RateMasterRepository extends JpaRepository<RateMast, Long> {

//	 @Query("FROM UserMasterEntity t where t.userName = :userName")     
//	Optional<List<UserMasterEntity>> getUserListByUserName( @Param("userName") String userName);

}