
package org.mazz.restroservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;

@Table(name = "kotdetail")
@Entity(name = "KotDetail")
@NamedQuery(name = "KotDetail.findAll", query = "SELECT p FROM KotDetail p")
public class KotDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "kotpckey")
	private int kotPckey;
	
	@Column(name = "kotno")
	private String kotNo;
	
	@Column(name = "kotdate")
	private Date kotDate;
	
	@Column(name = "unqno")
	private int unqNo;
	
	@Column(name = "itempckey")
	private int itemPckey;
	
	@Column(name = "itemcode")
	private String itemCode;
	
	@Column(name = "quantity")
	private BigDecimal quantity;
	
	@Column(name = "rate")
	private BigDecimal rate;
	
	@Column(name = "taxrate")
	private BigDecimal taxRate;
	
	@Column(name = "amount")
	private BigDecimal amount;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "discount")
	private BigDecimal discount;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "preferencepckey")
	private int preferencePckey;
	
	@Column(name = "printed")
	private int printed;
	
	@Column(name = "pref")
	private String pref;

	public int getKotPckey() {
		return kotPckey;
	}

	public void setKotPckey(int kotPckey) {
		this.kotPckey = kotPckey;
	}

	public String getKotNo() {
		return kotNo;
	}

	public void setKotNo(String kotNo) {
		this.kotNo = kotNo;
	}

	public Date getKotDate() {
		return kotDate;
	}

	public void setKotDate(Date kotDate) {
		this.kotDate = kotDate;
	}

	public int getUnqNo() {
		return unqNo;
	}

	public void setUnqNo(int unqNo) {
		this.unqNo = unqNo;
	}

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

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getPreferencePckey() {
		return preferencePckey;
	}

	public void setPreferencePckey(int preferencePckey) {
		this.preferencePckey = preferencePckey;
	}

	public int getPrinted() {
		return printed;
	}

	public void setPrinted(int printed) {
		this.printed = printed;
	}

	public String getPref() {
		return pref;
	}

	public void setPref(String pref) {
		this.pref = pref;
	}

	
}
