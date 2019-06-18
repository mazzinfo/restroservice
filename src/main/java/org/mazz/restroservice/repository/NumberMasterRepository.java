package org.mazz.restroservice.repository;


import java.util.Optional;

import org.mazz.restroservice.entity.NumberMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberMasterRepository extends JpaRepository<NumberMaster, Long> {
	
	 @Query("FROM NumberMaster t where t.posArea = :posArea")     
	Optional<NumberMaster> getCurrentKotNo( @Param("posArea") int posArea);
	
	
}