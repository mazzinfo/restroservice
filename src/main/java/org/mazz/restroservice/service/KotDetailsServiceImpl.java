package org.mazz.restroservice.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mazz.restroservice.custommodal.KotDetailsCustomModal;
import org.mazz.restroservice.entity.KotDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KotDetailsServiceImpl implements KotDetailsService {

	private static final String SEARCH_KOT_DETAILS_TABLE = "SELECT kotPckey,kotNo,kotDate,itemPckey,itemCode,"
			+ "(select itemName from ItemMast where itemPckey=kot.itemPckey )  as itemName,quantity,rate,taxRate,(amount*taxRate/100) as taxAmount,"
			+ "amount,status,discount,reason,preferencePckey,printed,pref"
			+ " FROM KotDetail kot where kot.unqNo=:unqNo";

	private final NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	KotDetailsServiceImpl(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional(readOnly = true)
	@Override
	public List<KotDetailsCustomModal> getKotDetailsByTable(int unqNo) {

		Map<String, String> queryParams = new HashMap<>();
		queryParams.put("unqNo", "" + unqNo);

		List<KotDetailsCustomModal> searchResults = null;

		searchResults = jdbcTemplate.query(SEARCH_KOT_DETAILS_TABLE, queryParams,
				new BeanPropertyRowMapper<>(KotDetailsCustomModal.class));

		return searchResults;
	}

}
