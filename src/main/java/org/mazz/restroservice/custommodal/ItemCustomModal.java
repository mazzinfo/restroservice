package org.mazz.restroservice.custommodal;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ItemCustomModal {

	
	private int itemPckey;

	
	private String itemCode;

	
	private Long groupCode;

	
	private String itemName;
	
	private BigDecimal rate;

	
	private BigDecimal taxRate;

	
	private String active;

	
	private String status;

	
	private BigDecimal totalMl;

	
	private String uom;

	
	private BigDecimal measure;

	
	private int issueAsitis;


	public int getItemPckey() {
		return itemPckey;
	}


	public void setItemPckey(int itemPckey) {
		this.itemPckey = itemPckey;
	}


	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public Long getGroupCode() {
		return groupCode;
	}


	public void setGroupCode(Long groupCode) {
		this.groupCode = groupCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public BigDecimal getRate() {
		return rate;
	}


	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}


	public BigDecimal getTaxRate() {
		return taxRate;
	}


	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public BigDecimal getTotalMl() {
		return totalMl;
	}


	public void setTotalMl(BigDecimal totalMl) {
		this.totalMl = totalMl;
	}


	public String getUom() {
		return uom;
	}


	public void setUom(String uom) {
		this.uom = uom;
	}


	public BigDecimal getMeasure() {
		return measure;
	}


	public void setMeasure(BigDecimal measure) {
		this.measure = measure;
	}


	public int getIssueAsitis() {
		return issueAsitis;
	}


	public void setIssueAsitis(int issueAsitis) {
		this.issueAsitis = issueAsitis;
	}

}
