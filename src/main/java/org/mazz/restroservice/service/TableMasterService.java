package org.mazz.restroservice.service;

import java.util.List;
import java.util.Optional;

import org.mazz.restroservice.custommodal.ItemCustomModal;
import org.mazz.restroservice.custommodal.TableCustomModal;
import org.mazz.restroservice.entity.UserMast;
import org.mazz.restroservice.exception.ResourceNotFoundException;

public interface TableMasterService {
	
	
	List<TableCustomModal> getTableWithWaiter(int posCode);
	 List<ItemCustomModal> getItemWithRate(int posCode,String ItemName);
	
	 TableCustomModal getTableWithWaiterPosTable(int posCode,int unqNo);
	 

}
