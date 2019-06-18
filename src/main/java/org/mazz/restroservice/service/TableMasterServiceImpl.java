package org.mazz.restroservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.mazz.restroservice.custommodal.ItemCustomModal;
import org.mazz.restroservice.custommodal.TableCustomModal;
import org.mazz.restroservice.entity.UserMast;
import org.mazz.restroservice.exception.ResourceNotFoundException;
import org.mazz.restroservice.repository.UserMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TableMasterServiceImpl implements TableMasterService  {
	
	 private static final String SEARCH_TABLE_WAITER = "SELECT unqNo, tableNo,posCode,pax,sitTime,waiterNo,sitActive,sitHour,"
	 		+ "sitMin,sit,active as tableStatus,discount,(select waiterName from WaiterMast where waiterNo=t.waiterNo ) as waiterName,COALESCE((select (sum(amount*taxRate/100+amount)) as totalAmount from KotDetail where unqNo=t.unqNo ),0) as totalAmount FROM TableMast t where t.posCode=:posCode";
	 
	 
	 
	 
	 
	 private static final String SEARCH_TABLE_WAITER_POS_CODE_TABLE_ID = "SELECT unqNo, tableNo,posCode,pax,sitTime,waiterNo,sitActive,sitHour,"
		 		+ "sitMin,sit,active as tableStatus,discount,(select waiterName from WaiterMast where waiterNo=t.waiterNo ) as waiterName,COALESCE((select (sum(amount*taxRate/100+amount)) as totalAmount from KotDetail where unqNo=t.unqNo ),0) as totalAmount FROM TableMast t where t.posCode=:posCode and t.unqNo=:unqNo";
	 
	 
	 
	 
	 private static final String TABLE_WAITER = "SELECT unqNo, tableNo,posCode,pax,sitTime,waiterNo,sitActive,sitHour,"
		 		+ "sitMin,sit,active as tableStatus,discount,(select waiterName from WaiterMast where waiterNo=t.waiterNo ) as waiterName,COALESCE((select (sum(amount*taxRate/100+amount)) as totalAmount from KotDetail where unqNo=t.unqNo ),0) as totalAmount FROM TableMast t ";
	 
	    private final  NamedParameterJdbcTemplate jdbcTemplate;
	 
	
	 @Autowired TableMasterServiceImpl(NamedParameterJdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate; }
	 

	@Transactional(readOnly = true)
	@Override
	public List<TableCustomModal> getTableWithWaiter(int poscode) {
		Map<String, Integer> queryParams = new HashMap<>();
		queryParams.put("posCode", poscode);
		List<TableCustomModal> searchResults = null;

		if (poscode == 0) {
			searchResults = jdbcTemplate.query(TABLE_WAITER, new BeanPropertyRowMapper<>(TableCustomModal.class));

		} else {

			searchResults = jdbcTemplate.query(SEARCH_TABLE_WAITER, queryParams,
					new BeanPropertyRowMapper<>(TableCustomModal.class));

		}

		return searchResults;
	}
	
	
	@Transactional(readOnly = true)
	@Override
	public TableCustomModal getTableWithWaiterPosTable(int poscode,int unqNo) {
		Map<String, Integer> queryParams = new HashMap<>();
		queryParams.put("posCode", poscode);
		queryParams.put("unqNo", unqNo);
		List<TableCustomModal> searchResults = null;

//		if (poscode == 0) {
//			searchResults = (TableCustomModal) jdbcTemplate.query(TABLE_WAITER, new BeanPropertyRowMapper<>(TableCustomModal.class));
//
//		} else {

			searchResults = jdbcTemplate.query(SEARCH_TABLE_WAITER_POS_CODE_TABLE_ID, queryParams,
					new BeanPropertyRowMapper<>(TableCustomModal.class));

//		}

		return searchResults.get(0);
	}
	
	
	
	 private static final String SEARCH_ITEM_RATE = "SELECT itemPckey, itemCode,groupCode,itemName,active,status,totalMl,uom,measure,issueAsitis,"
		 		+ " (select rate from RateMast where itemPckey=t.itemPckey and posCode=:posCode ) as rate, (select taxRate from RateMast where itemPckey=t.itemPckey and posCode=:posCode ) as taxRate FROM ItemMast t ";
	
	 
	 private static final String SEARCH_ITEM_RATE_WITH_ITEM_SEARCH = "SELECT itemPckey, itemCode,groupCode,itemName,active,status,totalMl,uom,measure,issueAsitis,"
		 		+ " (select rate from RateMast where itemPckey=t.itemPckey and posCode=:posCode )"
		 		+ " as rate, (select taxRate from RateMast where itemPckey=t.itemPckey and posCode=:posCode ) as taxRate FROM ItemMast t where t.itemName LIKE :itemName ";
	
	 
	@Transactional(readOnly = true)
	@Override
	public List<ItemCustomModal> getItemWithRate(int posCode,String itemName) {
		System.out.println("itemName.."+itemName);
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("posCode", ""+posCode);
		
		List<ItemCustomModal> searchResults = null;

		if(itemName.equals("0")) {
			searchResults = jdbcTemplate.query(SEARCH_ITEM_RATE, queryParams,
					new BeanPropertyRowMapper<>(ItemCustomModal.class));
			
		}else{
			queryParams.put("itemName", "%"+itemName+"%");
			searchResults = jdbcTemplate.query(SEARCH_ITEM_RATE_WITH_ITEM_SEARCH, queryParams,
					new BeanPropertyRowMapper<>(ItemCustomModal.class));
			
			
		}

			

		

		return searchResults;
	}
	
	
	
	 
	 

}
