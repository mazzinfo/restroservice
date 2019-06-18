package org.mazz.restroservice.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.mazz.restroservice.custommodal.TableCustomModal;
import org.mazz.restroservice.entity.TableMast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TableMasterRepository extends JpaRepository<TableMast, Long> {

//	 @Query("FROM UserMasterEntity t where t.userName = :userName")     
//	Optional<List<UserMasterEntity>> getUserListByUserName( @Param("userName") String userName);
	@Transactional
	 @Modifying
	 @Query("update TableMast c set c.Active=:Active,c.pax=:pax,c.waiterNo=:waiterNo,c.sit=:sit WHERE c.unqNo =:unqNo")
     void updateTableMasterStatus(@Param("unqNo") int unqNo,@Param("Active") int  Active,@Param("pax") int pax,@Param("waiterNo") int waiterNo,@Param("sit") String sit);
}