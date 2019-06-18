package org.mazz.restroservice.repository;




import org.mazz.restroservice.entity.KotDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface KotDetailsRepository extends JpaRepository<KotDetail, Long> {
	
	 @Modifying(clearAutomatically = true)
	 @Transactional
	    @Query("UPDATE KotDetail c SET c.printed = :printed WHERE c.unqNo = :unqNo")
	    void updateKotStatus(@Param("unqNo") int unqNo, @Param("printed") int printed);




}