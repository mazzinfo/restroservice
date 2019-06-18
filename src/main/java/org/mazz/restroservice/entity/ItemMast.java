package org.mazz.restroservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

/**
 * The persistent class for the PosMast database table.
 * 
 */
@Table(name = "itemmast")
@Entity(name = "ItemMast")
@NamedQuery(name = "ItemMast.findAll", query = "SELECT p FROM ItemMast p")
public class ItemMast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "itempckey")
	private int ItemPckey;

	@Column(name = "itemcode")
	private String ItemCode;

	@Column(name = "groupcode")
	private Long GroupCode;

	@Column(name = "itemname")
	private String ItemName;

	@Column(name = "taxrate")
	private BigDecimal TaxRate;

	@Column(name = "active")
	private String Active;

	@Column(name = "status")
	private String Status;

	@Column(name = "totalml")
	private BigDecimal TotalMl;

	@Column(name = "uom")
	private String Uom;

	@Column(name = "measure")
	private BigDecimal Measure;

	@Column(name = "issueasitis")
	private int IssueAsitis;

	@Column(name = "rate")
	private BigDecimal Rate;

	public int getItemPckey() {
		return ItemPckey;
	}

	public void setItemPckey(int itemPckey) {
		ItemPckey = itemPckey;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public Long getGroupCode() {
		return GroupCode;
	}

	public void setGroupCode(Long groupCode) {
		GroupCode = groupCode;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public BigDecimal getTaxRate() {
		return TaxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		TaxRate = taxRate;
	}

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public BigDecimal getTotalMl() {
		return TotalMl;
	}

	public void setTotalMl(BigDecimal totalMl) {
		TotalMl = totalMl;
	}

	public String getUom() {
		return Uom;
	}

	public void setUom(String uom) {
		Uom = uom;
	}

	public BigDecimal getMeasure() {
		return Measure;
	}

	public void setMeasure(BigDecimal measure) {
		Measure = measure;
	}

	public int getIssueAsitis() {
		return IssueAsitis;
	}

	public void setIssueAsitis(int issueAsitis) {
		IssueAsitis = issueAsitis;
	}

	public BigDecimal getRate() {
		return Rate;
	}

	public void setRate(BigDecimal rate) {
		Rate = rate;
	}

}